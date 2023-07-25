package texteditor

class CutCommand(private val receiver:TextEditor, private val clipboard: Clipboard):Command {
    override fun execute() {
        clipboard.content = receiver.cut()
    }

    override fun undo() {
        clipboard.content = ""
    }
}

class CopyCommand(private val receiver: TextEditor, private val clipboard: Clipboard) : Command {
    override fun execute() {
        clipboard.content = receiver.copy()
    }

    override fun undo() {
        clipboard.content = ""
    }
}
class PasteCommand(private val receiver:TextEditor, private val clipboard: Clipboard):Command {
    override fun execute() {
        receiver.write(clipboard.content)
    }

    override fun undo() {
        receiver.delete(clipboard.content)
    }
}