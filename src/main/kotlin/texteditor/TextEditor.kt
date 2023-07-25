package texteditor

class TextEditor(initialContent: String) {
    private var content = initialContent

    fun cut(): String {
        val cutContent = content.takeLast(1)
        content = content.dropLast(1)
        return cutContent
    }

    fun copy(): String {
        return content
    }

    fun write(text: String) {
        content += text
    }

    fun delete(text: String) {
        content = content.removeSuffix(text)
    }

    fun print() {
        println(content)
    }
}