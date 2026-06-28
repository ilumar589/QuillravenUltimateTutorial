package io.github.blippy.screen

import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.viewport.Viewport
import com.github.quillraven.fleks.World
import com.github.quillraven.fleks.configureWorld
import io.github.blippy.GdxGame
import ktx.app.KtxScreen

class GameScreen(
    game: GdxGame,
    private val gameViewport: Viewport = game.gameViewport,
    private val batch: Batch = game.batch,
    private val shapeRenderer: ShapeRenderer = game.shapeRenderer,
    private val stage: Stage = game.stage,
    private val inputMultiplexer: InputMultiplexer = game.inputMultiplexer,
    private val skin: Skin = game.skin
) : KtxScreen {

    private fun ecsWorld() : World = configureWorld {
        injectables {
            add(batch)
            add(shapeRenderer)
            add(stage)
            add(gameViewport)
        }
    }
}
