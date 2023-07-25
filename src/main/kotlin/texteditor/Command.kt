package texteditor

interface Command {
    fun execute()
    fun undo()
}