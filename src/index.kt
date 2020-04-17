import lodash.toUpper
import kotlin.browser.document
import kotlin.dom.appendText

@ExperimentalJsExport
fun main() {
    document.getElementById("hello")!!.appendText("Hello World")
}

@ExperimentalJsExport
@JsExport
@JsName("hello")
fun hello(name: String): String {
    return "Hello ${toUpper(name)}"
}