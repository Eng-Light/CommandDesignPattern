package remotecontroller.commands

import remotecontroller.devices.Stereo

class StereoOnWithCDCommand(private val stereo: Stereo):Command{
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(10)
    }

    override fun undo() {
        stereo.off()
    }
}