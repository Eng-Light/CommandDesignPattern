package remotecontroller

import remotecontroller.commands.Command
import remotecontroller.commands.NoCommand


class RemoteControl {
    private var onCommands: Array<Command>
    private var offCommands: Array<Command>
    private var undoCommand: Command
    private val slotSize = 7

    init {
        val command = NoCommand()
        onCommands = Array(slotSize) { command }
        offCommands = Array(slotSize) { command }
        undoCommand = command
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        println("Undo was pushed")
        undoCommand.undo()
        println("-------------")

    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            stringBuff.append("[slot $i] ${onCommands[i].javaClass.name},,,${offCommands[i].javaClass.name}\n")
        }
        stringBuff.append("[Undo] ${undoCommand.javaClass.name}")
        return stringBuff.toString()
    }
}