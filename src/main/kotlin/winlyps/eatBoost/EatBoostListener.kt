package winlyps.eatBoost

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerItemConsumeEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class EatBoostListener(private val plugin: EatBoost) : Listener {

    @EventHandler
    fun onPlayerItemConsume(event: PlayerItemConsumeEvent) {
        val player: Player = event.player

        // Apply saturation effect for 7 seconds (140 ticks)
        player.addPotionEffect(PotionEffect(PotionEffectType.SATURATION, 140, 0))
    }
}