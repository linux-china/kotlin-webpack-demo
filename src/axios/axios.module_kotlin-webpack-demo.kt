@file:JsModule("axios")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package axios

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface AxiosTransformer {
    @nativeInvoke
    operator fun invoke(data: Any, headers: Any = definedExternally): Any
}

external interface AxiosAdapter {
    @nativeInvoke
    operator fun invoke(config: AxiosRequestConfig): AxiosPromise<Any>
}

external interface AxiosBasicCredentials {
    var username: String
    var password: String
}

external interface `T$0` {
    var username: String
    var password: String
}

external interface AxiosProxyConfig {
    var host: String
    var port: Number
    var auth: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var protocol: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxiosRequestConfig {
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var method: String /* 'get' | 'GET' | 'delete' | 'DELETE' | 'head' | 'HEAD' | 'options' | 'OPTIONS' | 'post' | 'POST' | 'put' | 'PUT' | 'patch' | 'PATCH' | 'purge' | 'PURGE' | 'link' | 'LINK' | 'unlink' | 'UNLINK' */
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var transformRequest: dynamic /* AxiosTransformer | Array<AxiosTransformer> */
        get() = definedExternally
        set(value) = definedExternally
    var transformResponse: dynamic /* AxiosTransformer | Array<AxiosTransformer> */
        get() = definedExternally
        set(value) = definedExternally
    var headers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var params: Any?
        get() = definedExternally
        set(value) = definedExternally
    var paramsSerializer: ((params: Any) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeoutErrorMessage: String?
        get() = definedExternally
        set(value) = definedExternally
    var withCredentials: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var adapter: AxiosAdapter?
        get() = definedExternally
        set(value) = definedExternally
    var auth: AxiosBasicCredentials?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: String /* 'arraybuffer' | 'blob' | 'document' | 'json' | 'text' | 'stream' */
    var xsrfCookieName: String?
        get() = definedExternally
        set(value) = definedExternally
    var xsrfHeaderName: String?
        get() = definedExternally
        set(value) = definedExternally
    var onUploadProgress: ((progressEvent: ProgressEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onDownloadProgress: ((progressEvent: ProgressEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var maxContentLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxBodyLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var validateStatus: ((status: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var maxRedirects: Number?
        get() = definedExternally
        set(value) = definedExternally
    var socketPath: String?
        get() = definedExternally
        set(value) = definedExternally
    var httpAgent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var httpsAgent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var proxy: dynamic /* AxiosProxyConfig | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var cancelToken: CancelToken?
        get() = definedExternally
        set(value) = definedExternally
    var decompress: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxiosResponse<T> {
    var data: T
    var status: Number
    var statusText: String
    var headers: Any
    var config: AxiosRequestConfig
    var request: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxiosPromise<T> : Promise<AxiosResponse<T>>

external interface CancelStatic

external interface Cancel {
    var message: String
}

external interface Canceler {
    @nativeInvoke
    operator fun invoke(message: String = definedExternally)
}

external interface CancelTokenStatic {
    fun source(): CancelTokenSource
}

external interface CancelToken {
    var promise: Promise<Cancel>
    var reason: Cancel?
        get() = definedExternally
        set(value) = definedExternally
    fun throwIfRequested()
}

external interface CancelTokenSource {
    var token: CancelToken
    var cancel: Canceler
}

external interface AxiosInterceptorManager<V> {
    fun use(onFulfilled: (value: V) -> dynamic = definedExternally, onRejected: (error: Any) -> Any = definedExternally): Number
    fun eject(id: Number)
}

external interface `T$1` {
    var request: AxiosInterceptorManager<AxiosRequestConfig>
    var response: AxiosInterceptorManager<AxiosResponse<Any>>
}

external interface AxiosInstance {
    @nativeInvoke
    operator fun invoke(config: AxiosRequestConfig): AxiosPromise<Any>
    @nativeInvoke
    operator fun invoke(url: String, config: AxiosRequestConfig = definedExternally): AxiosPromise<Any>
    var defaults: AxiosRequestConfig
    var interceptors: `T$1`
    fun getUri(config: AxiosRequestConfig = definedExternally): String
    fun <T, R> request(config: AxiosRequestConfig): Promise<R>
    fun <T, R> get(url: String, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> delete(url: String, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> head(url: String, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> options(url: String, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> post(url: String, data: Any = definedExternally, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> put(url: String, data: Any = definedExternally, config: AxiosRequestConfig = definedExternally): Promise<R>
    fun <T, R> patch(url: String, data: Any = definedExternally, config: AxiosRequestConfig = definedExternally): Promise<R>
}

external interface AxiosStatic : AxiosInstance {
    fun create(config: AxiosRequestConfig = definedExternally): AxiosInstance
    var Cancel: CancelStatic
    var CancelToken: CancelTokenStatic
    fun isCancel(value: Any): Boolean
    fun <T> all(values: Array<dynamic /* T | Promise<T> */>): Promise<Array<T>>
    fun <T, R> spread(callback: (args: Array<T>) -> R): (array: Array<T>) -> R
}

@JsName("default")
external var Axios: AxiosStatic