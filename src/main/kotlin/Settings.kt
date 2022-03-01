import js.vizality.components.settings.buttonItem
import react.*
import react.dom.div

val Settings = fc<Props> {
    div {
        buttonItem {
            +"Foobar"

            attrs {
                note = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            }
        }
    }
}