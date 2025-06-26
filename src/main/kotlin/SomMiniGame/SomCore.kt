package SomMiniGame

import SomMiniGame.Events.PlayerEvent
import org.bukkit.plugin.java.JavaPlugin

class SomCore : JavaPlugin() {

    companion object {
        lateinit var Plugin: JavaPlugin
            private set
    }

    override fun onEnable() {
        Plugin = this

        server.pluginManager.registerEvents(PlayerEvent(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
