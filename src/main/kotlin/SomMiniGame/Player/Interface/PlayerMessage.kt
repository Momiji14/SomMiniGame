package SomMiniGame.Player.Interface

import net.kyori.adventure.text.Component

interface PlayerMessage : PlayerExtend {
    fun sendMessage(message: String) {
        player.sendMessage(Component.text(message))
    }
}