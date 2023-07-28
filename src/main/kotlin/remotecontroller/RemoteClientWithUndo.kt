package remotecontroller

import remotecontroller.commands.LightOffCommand
import remotecontroller.commands.LightOnCommand
import remotecontroller.devices.Light

fun main() {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()
    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(0)
    println(remoteControl)
    remoteControl.undoButtonWasPushed()
}