@file:JvmName("TeaVMLauncher")

package io.github.blippy.teavm

import com.github.xpenatan.gdx.teavm.backends.web.WebApplicationConfiguration
import com.github.xpenatan.gdx.teavm.backends.web.WebApplication
import io.github.blippy.GdxGame

/** Launches the TeaVM/HTML application. */
fun main() {
    val config = WebApplicationConfiguration("canvas").apply {
        //// If width and height are each greater than 0, then the app will use a fixed size.
        //width = 640
        //height = 480
        //// If width and height are both 0, then the app will use all available space.
        width = 0
        height = 0
    }
    WebApplication(GdxGame(), config)
}
