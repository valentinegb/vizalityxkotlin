import js.vizality.entities.Plugin

@JsExport
@JsName("default")
class VizalityXKotlin: Plugin() {
    fun start() {
        this.log("Hello Kotlin!")
    }

    fun stop() {
        this.log("Goodbye Kotlin!")
    }
}