package js.vizality.components.settings

import react.ComponentType
import react.PropsWithChildren
import react.RBuilder
import react.RHandler

@JsModule("@vizality/components/settings/ButtonItem")
@JsNonModule
private external val buttonItemModule: dynamic

private val buttonItemComponentType: ComponentType<ButtonItemProps> = buttonItemModule.default

external interface ButtonItemProps: PropsWithChildren {
    var note: String
}

fun RBuilder.buttonItem(handler: RHandler<ButtonItemProps>) {
    console.log(buttonItemComponentType)
    child(buttonItemComponentType, handler = handler)
}