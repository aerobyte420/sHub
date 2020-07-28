package me.aerobyte.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("spawn")) {
            World world = Bukkit.getServer().getWorld("world");
            player.teleport(world.getSpawnLocation());
        }

        return false;
    }
}
