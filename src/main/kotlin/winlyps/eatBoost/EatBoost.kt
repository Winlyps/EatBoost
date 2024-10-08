package winlyps.eatBoost

import org.bukkit.plugin.java.JavaPlugin

class EatBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(EatBoostListener(this), this)
        logger.info("EatBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("EatBoost plugin disabled.")
    }
}