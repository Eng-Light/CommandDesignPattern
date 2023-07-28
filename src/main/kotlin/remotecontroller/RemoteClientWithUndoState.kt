package remotecontroller

import remotecontroller.commands.CeilingFanHighCommand
import remotecontroller.commands.CeilingFanMediumCommand
import remotecontroller.commands.CeilingFanOffCommand
import remotecontroller.devices.CeilingFan

fun main() {
    val remoteControl = RemoteControl()
    val ceilingFan = CeilingFan("Living Room")
    val ceilingFanMediumCommand = CeilingFanMediumCommand(ceilingFan)
    val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand)
    remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()

    remoteControl.onButtonWasPushed(1)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()
}