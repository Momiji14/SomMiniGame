package SomMiniGame.Player

import org.bukkit.entity.Player

object PlayerUtil {
    private val container: HashMap<String, PlayerData> = HashMap()

    fun create(player: Player) {
        val uuid = player.uniqueId.toString()
        container[uuid] = PlayerData(player)
    }

    fun get(player: Player): PlayerData? {
        val uuid = player.uniqueId.toString()
        return container[uuid]
    }
}