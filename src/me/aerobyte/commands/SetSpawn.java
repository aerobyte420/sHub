package me.aerobyte.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class    SetSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        Player player = (Player) commandSender;
        if(player.hasPermission("shub.setspawn")) {
            World world = player.getWorld();
            Location loc = player.getLocation();
            world.setSpawnLocation(loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ());
            player.sendMessage(ChatColor.GRAY + "You have changed " + ChatColor.AQUA + "Hub-01 " + ChatColor.GRAY + "spawn location.");
        } else {
            player.sendMessage(ChatColor.RED + "Insufficient Permissions.");
        }

        return false;
    }
}
