package complexremotecontrol

fun main() {
    val remoteControl = RemoteControl()//init Invoker

    // Use the remote control with the TV
    val tv = TV()// init TV receiver
    remoteControl.setDevice(tv)

    remoteControl.pressButtonOne() // TV: Turning on
    remoteControl.pressButtonTwo() // TV: Changing channel

    // Use the remote control with the Stereo
    val stereo = Stereo()// init Stereo receiver
    remoteControl.setDevice(stereo)

    remoteControl.pressButtonOne() // Stereo: Turning on
    remoteControl.pressButtonTwo() // Stereo: Changing volume
}