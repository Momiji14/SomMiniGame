package SomMiniGame.Player

import SomMiniGame.Player.Interface.PlayerMessage
import SomMiniGame.Player.Interface.SaveLoad
import org.bukkit.entity.Player

class PlayerData(override val player: Player) : SaveLoad, PlayerMessage {
    override val playerData: PlayerData = this
    override val uuid: String = player.uniqueId.toString()
    override var isLoaded: Boolean = false
}