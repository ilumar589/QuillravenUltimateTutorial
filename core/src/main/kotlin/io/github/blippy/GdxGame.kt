package io.github.blippy

import com.badlogic.gdx.Application
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport
import io.github.blippy.ui.GameSkin
import ktx.app.KtxGame
import ktx.app.KtxScreen

class GdxGame : KtxGame<KtxScreen>() {
    val batch: Batch by lazy { SpriteBatch() }
    val shapeRenderer: ShapeRenderer by lazy { ShapeRenderer() }
    val gameViewport: Viewport by lazy { FitViewport(16f, 9f) }
    val uiViewport: Viewport by lazy { FitViewport(1280f, 720f) }
    val stage: Stage by lazy { Stage(uiViewport, batch) }
    val skin: Skin by lazy { GameSkin() }
    val inputMultiplexer: InputMultiplexer by lazy { InputMultiplexer() }

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        Gdx.input.inputProcessor = inputMultiplexer
    }
}
