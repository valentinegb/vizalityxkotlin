import js.vizality.api.NoticeButton
import js.vizality.api.Notifications
import js.vizality.api.VizalityNotice
import js.vizality.entities.Plugin

const val NOTICE_ID = "vizalityxkotlin_start_toast_1"
const val NOTICE_COLOR = "BLURPLE_GRADIENT_2"

fun VizalityNotice(): VizalityNotice = js("{}")
fun NoticeButton(): NoticeButton = js("{}")

@JsExport
@JsName("default")
class VizalityXKotlin: Plugin() {
    fun start() {
        Notifications.sendNotice(VizalityNotice().apply {
            id = NOTICE_ID
            color = NOTICE_COLOR

            message = "Hello Kotlin!"

            buttons = arrayOf(NoticeButton().apply {
                text = "... My name's not Kotlin"

                onClick = {
                    Notifications.closeNotice(NOTICE_ID)

                    Notifications.sendNotice(VizalityNotice().apply {
                        color = NOTICE_COLOR

                        message = "Well, no it's mine..."
                    })
                }
            })
        })
    }

    fun stop() {
        this.log("Goodbye Kotlin!")
    }
}