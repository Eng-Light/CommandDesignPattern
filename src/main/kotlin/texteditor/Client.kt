package texteditor

fun textEditorClient(){
    val clipboard = Clipboard()
    val editor = TextEditor("Baeldung")//Receiver
    val invoker = TextEditorInvoker()

    invoker.executeCommand(CutCommand(editor, clipboard)) // cuts last character of initial content to clipboard
    invoker.executeCommand(CopyCommand(editor, clipboard)) // copies current content to clipboard
    invoker.executeCommand(PasteCommand(editor, clipboard)) // pastes current clipboard content to text editor

    editor.print() // prints "BaeldunBaeldun"

    invoker.undo() // undoes the paste command

    editor.print() // prints "Baeldun"
}