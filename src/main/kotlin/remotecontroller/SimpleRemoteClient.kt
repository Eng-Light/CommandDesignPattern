package remotecontroller

import remotecontroller.commands.*
import remotecontroller.devices.CeilingFan
import remotecontroller.devices.GarageDoor
import remotecontroller.devices.Light
import remotecontroller.devices.Stereo

fun main() {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val ceilingFan = CeilingFan("Living Room")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)
    val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOff = CeilingFanOffCommand(ceilingFan)
    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
    remoteControl.setCommand(3, stereoOnWithCD, stereoOff)

    println(remoteControl)
    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    remoteControl.onButtonWasPushed(3)
    remoteControl.offButtonWasPushed(3)
}