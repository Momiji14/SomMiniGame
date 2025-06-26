package SomMiniGame.Player.Interface

import SomMiniGame.Player.PlayerData
import org.bukkit.entity.Player

interface PlayerExtend {
    val playerData: PlayerData
    val uuid: String
    val player: Player
}