package net.daechler.antiitembreak;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.ChatColor;

public class AntiItemBreak extends JavaPlugin implements Listener {

    // Called when the plugin is enabled
    @Override
    public void onEnable() {
        // Register the event listener
        getServer().getPluginManager().registerEvents(this, this);

        // Print an enable message to the console
        getLogger().info(ChatColor.GREEN + getName() + " has been enabled!");
    }

    // Called when the plugin is disabled
    @Override
    public void onDisable() {
        // Print a disable message to the console
        getLogger().info(ChatColor.RED + getName() + " has been disabled!");
    }

    // Event handler to prevent item durability decrease
    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent event) {
        // Cancel the event to prevent item durability from decreasing
        event.setCancelled(true);
    }
}
