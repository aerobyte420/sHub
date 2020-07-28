package me.aerobyte.events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockEvent implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if(!!(player.hasPermission("shub.break"))) {
           e.setCancelled(true);
        }
        if(player.hasPermission("shub.break")) {
            if(player.getGameMode() == GameMode.SURVIVAL) {
                e.setCancelled(true);
            }
            if(player.hasPermission("shub.break")) {
                if(player.getGameMode() == GameMode.CREATIVE) {
                    e.setCancelled(false);
                }
            }
        }
    }

}
