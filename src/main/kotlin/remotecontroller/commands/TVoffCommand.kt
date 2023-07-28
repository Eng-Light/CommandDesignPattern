package remotecontroller.commands

import remotecontroller.devices.TV

class TVoffCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.off()

    }

    override fun undo() {
        tv.on()
    }
}