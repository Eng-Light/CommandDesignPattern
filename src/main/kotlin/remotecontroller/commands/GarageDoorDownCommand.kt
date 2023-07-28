package remotecontroller.commands

import remotecontroller.devices.GarageDoor

class GarageDoorDownCommand(private val garageDoor: GarageDoor):Command{
    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}