@file:JsModule("@vizality/api")
@file:JsNonModule
package js.vizality.api

/**
 * Vizality notice object.
 */
external interface VizalityNotice {
    /**
     * Notice ID
     */
    var id: String?

    /**
     * Notice message
     */
    var message: String

    /**
     * Notice background color
     */
    var color: String?

    /**
     * Callback function triggered when the notice closes
     */
    var callback: () -> Unit?

    /**
     * Notice buttons
     */
    var buttons: Array<NoticeButton>?

    /**
     * Addon ID of notice sender. This property is set automatically.
     */
    var caller: String
}

/**
 * Vizality notice button.
 */
external interface NoticeButton {
    /**
     * Button click executor. Closes the notice by default.
     */
    var onClick: () -> Unit?

    /**
     * Button text
     */
    var text: String
}

open external class Notifications {
    /**
     * Shuts down the API, removing all listeners and stored objects.
     */
    fun stop()

    companion object {
        /**
         * Sends a notice (in the form of a banner at the top of the client).
         * @param notice Notice to send
         */
        fun sendNotice(notice: VizalityNotice)

        /**
         * Closes a notice.
         * @param noticeId Notice ID
         */
        fun closeNotice(noticeId: String)
    }
}