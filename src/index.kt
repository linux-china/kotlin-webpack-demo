import axios.Axios
import axios.AxiosRequestConfig
import axios.AxiosRequestConfigImpl
import axios.AxiosResponse
import kotlinx.coroutines.coroutineScope
import lodash.toUpper

suspend fun main() = coroutineScope {
    //document.getElementById("hello")!!.appendText("Hello World")
    val config: AxiosRequestConfig = AxiosRequestConfigImpl("get", "text")
    config.url = "http://httpbin.org/ip"
    Axios.request<String, AxiosResponse<String>>(config).then {
        console.log(it.data)
    }
    Unit
}

@ExperimentalJsExport
@JsExport
@JsName("hello")
fun hello(name: String): String {
    return "Hello ${toUpper(name)}"
}