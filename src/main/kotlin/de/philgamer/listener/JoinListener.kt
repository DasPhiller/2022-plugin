package de.philgamer.listener

import net.axay.kspigot.chat.KColors
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class JoinListener : Listener {
    @EventHandler
    fun joinEvent(event: PlayerJoinEvent) {
        event.joinMessage =  "${KColors.GREEN}" + event.player.name + " hat den Server betreten"
    }
    @EventHandler
    fun quitEvent(event: PlayerQuitEvent) {
        event.quitMessage = "${KColors.RED}" + event.player.name + " hat den Server verlassen"
    }
}