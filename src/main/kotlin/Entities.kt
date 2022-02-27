@file:JsModule("@vizality/entities")
@file:JsNonModule
package js.vizality.entities

open external class Plugin() {
    fun log(vararg message: Any)
}