package remotecontroller.commands

class MacroCommand(private val commands: List<Command>):Command {
    override fun execute() {
        for(command in commands){
            command.execute()
        }
    }

    override fun undo() {
        for(command in commands){
            command.undo()
        }
    }
}