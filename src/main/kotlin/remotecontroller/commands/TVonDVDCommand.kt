package remotecontroller.commands

import remotecontroller.devices.TV

class TVonDVDCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.on()
        tv.setDVD()
    }

    override fun undo() {
        tv.off()
    }
}