package remotecontroller.commands

import remotecontroller.devices.CeilingFan

class CeilingFanOnCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.low()
    }

    override fun undo() {
        ceilingFan.off()
    }
}