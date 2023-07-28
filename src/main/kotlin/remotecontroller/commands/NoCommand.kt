package remotecontroller.commands

class NoCommand: Command {
    override fun execute() {
        println("No Command")
    }

    override fun undo() {
        println("No undo command")
    }
}