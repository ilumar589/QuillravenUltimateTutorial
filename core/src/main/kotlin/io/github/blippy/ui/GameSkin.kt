package io.github.blippy.ui

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import ktx.assets.toInternalFile
import ktx.freetype.generateFont

class GameSkin : Skin() {
    init {
        // generate and register fonts
        //TODO at a later time
//        val ftfGenerator = FreeTypeFontGenerator("ui/alagard.ttf".toInternalFile())
//        add(FONT_SMALL, ftfGenerator.generateFont { size = 32 })
//        add(FONT_DEFAULT, ftfGenerator.generateFont { size = 40 })
    }

    companion object {
        // graphics
        const val RIBBON_GRAY = "ribbon_gray"
        const val RIBBON_YELLOW = "ribbon_yellow"
        const val RIBBON_TEAL = "ribbon_teal"
        const val SWORD_PURPLE = "sword_purple"
        const val BANNER = "banner"
        private const val AVATAR_WARRIOR = "avatar_warrior"
        private const val AVATAR_ARCHER = "avatar_archer"
        private const val AVATAR_MONK = "avatar_monk"
        const val AVATAR_PAWN = "avatar_pawn"
        const val AVATAR_LANCER = "avatar_lancer"
        const val CURSOR_SELECT = "cursor_select"
        private const val ARROW_GREEN_UP = "arrow_green_up"
        private const val ARROW_GREEN_DOWN = "arrow_green_down"

        // fonts
        private const val FONT_SMALL = "font_small"
        private const val FONT_DEFAULT = "font_default"

        // style names
        const val STYLE_LABEL = "default"
        const val STYLE_SPAWN_BTN = "spawn"
        const val STYLE_ARROW_UP_BTN = "arrow_up"
        const val STYLE_ARROW_DOWN_BTN = "arrow_down"
        const val STYLE_WARRIOR_BTN = "warrior"
        const val STYLE_ARCHER_BTN = "archer"
        const val STYLE_MONK_BTN = "monk"
        const val STYLE_MENU_BTN = "menu"
    }
}
