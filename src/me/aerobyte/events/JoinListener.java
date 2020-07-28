package me.aerobyte.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        World world = Bukkit.getServer().getWorld("world");
        player.teleport(world.getSpawnLocation());
        player.sendMessage(ChatColor.AQUA + "You have been connected to Hub-01");
        player.sendMessage(ChatColor.GRAY + "You can use the navigator to connect to a server.");
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 2));
    }
}
