package remotecontroller.commands

import remotecontroller.devices.HotTub

class HotTubOffCommand(private val hotTub: HotTub): Command {
    override fun execute() {
        hotTub.off()
    }

    override fun undo() {
        hotTub.on()
        hotTub.heat(104)
        hotTub.bubble()
    }
}