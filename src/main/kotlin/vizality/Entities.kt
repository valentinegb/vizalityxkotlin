@file:JsModule("@vizality/entities")
@file:JsNonModule
package js.vizality.entities

import kotlin.js.Promise

open external class Plugin: Updatable {
    /**
     * Injects a style element containing the styles from the specified stylesheet into the document head.
     * Style element (and styles) are automatically removed on plugin disable/unload.
     * @param path Stylesheet path. Either absolute or relative to the plugin root
     * @param suppress Whether to suppress errors in console
     */
    fun injectStyles(path: String, suppress: Boolean? = definedExternally)

    fun registerSettings(render: Any)

    fun log(vararg message: Any)

    fun warn(vararg message: Any)

    fun error(vararg message: Any)
}

/**
 * @param dir Directory path of entity to update
 * @param addonId Addon ID
 * @param updateIdentifier Entity update identifier
 */
open external class Updatable(dir: String, addonId: String, updateIdentifier: String) {
    /**
     * @return Whether this can be updated or not
     */
    fun isUpdatable(): Boolean

    /**
     * Fetches the git repository URL for an entity.
     */
    fun getGitRepo(): Promise<String?>

    /**
     * Fetches the current git branch for an entity.
     */
    fun getBranch(): Promise<String?>
}