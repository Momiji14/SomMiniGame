package SomMiniGame.Events

import SomMiniGame.Player.PlayerUtil
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerEvent : Listener{

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player
        PlayerUtil.create(player).load()
    }
}