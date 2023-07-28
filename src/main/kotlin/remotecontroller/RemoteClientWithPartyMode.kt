package remotecontroller

import remotecontroller.commands.*
import remotecontroller.devices.*

fun main() {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val ceilingFan = CeilingFan("Living Room")
    val tv = TV("Living Room")
    val stereo = Stereo("Living Room")
    val hotTub = HotTub()

    val livingRoomLightOnCommand = LightOnCommand(livingRoomLight)
    val livingRoomLightOffCommand = LightOffCommand(livingRoomLight)
    val ceilingFanOnCommand = CeilingFanOnCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
    val stereoOnCommand = StereoOnWithCDCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)
    val tVonDVDCommand = TVonDVDCommand(tv)
    val tVoffCommand = TVoffCommand(tv)
    val hotTubOnCommand = HotTubOnCommand(hotTub)
    val hotTubOffCommand = HotTubOffCommand(hotTub)


    val onCommands =
        listOf(
            livingRoomLightOnCommand,
            ceilingFanOnCommand,
            stereoOnCommand, tVonDVDCommand,
            hotTubOnCommand
        )
    val offCommands = listOf(
        livingRoomLightOffCommand,
        ceilingFanOffCommand,
        stereoOffCommand,
        tVoffCommand,
        hotTubOffCommand
    )

    remoteControl.setCommand(0, MacroCommand(onCommands), MacroCommand(offCommands))
    println(remoteControl)
    println("------ Pushing Macro On ------")
    remoteControl.onButtonWasPushed(0)
    println("------ Pushing Macro Off ------")
    remoteControl.offButtonWasPushed(0)
}