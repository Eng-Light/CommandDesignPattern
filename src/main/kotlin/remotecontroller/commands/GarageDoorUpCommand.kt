package remotecontroller.commands

import remotecontroller.devices.GarageDoor

class GarageDoorUpCommand(private val garageDoor: GarageDoor):Command{
    override fun execute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}