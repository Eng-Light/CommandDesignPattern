package remotecontroller.commands

interface Command{
    fun execute()
    fun undo()
}