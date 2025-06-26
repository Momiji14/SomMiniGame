package SomMiniGame

import org.bukkit.plugin.java.JavaPlugin

class SomCore : JavaPlugin() {

    companion object {
        lateinit var Plugin: JavaPlugin
            private set
    }

    override fun onEnable() {
        Plugin = this
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
