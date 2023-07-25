package remotecontroller

interface Command {
    fun execute()
}

class LightOnCommand(private val light:Light) : Command {
    override fun execute() {
        light.on()
    }
}
class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}