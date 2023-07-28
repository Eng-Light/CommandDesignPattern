package remotecontroller.commands

import remotecontroller.devices.HotTub

class HotTubOnCommand(private val hotTub: HotTub):Command{
    override fun execute() {
        hotTub.on()
        hotTub.heat(104)
        hotTub.bubble()

    }

    override fun undo() {
        hotTub.off()
    }
}