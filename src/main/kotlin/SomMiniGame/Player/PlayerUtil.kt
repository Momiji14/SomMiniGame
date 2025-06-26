package SomMiniGame.Player

import org.bukkit.entity.Player

object PlayerUtil {
    private val container: HashMap<String, PlayerData> = HashMap()

    fun create(player: Player): PlayerData {
        val uuid = player.uniqueId.toString()
        val playerData = PlayerData(player)
        container[uuid] = playerData
        return playerData
    }

    fun get(player: Player): PlayerData? {
        val uuid = player.uniqueId.toString()
        return container[uuid]
    }
}