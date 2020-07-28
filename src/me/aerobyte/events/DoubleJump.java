package me.aerobyte.events;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJump implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if(player.getGameMode() != GameMode.CREATIVE)  {
					 if(player.getLocation().subtract(0.0, 0.1, 0.0).getBlock().getType() != Material.AIR
                && !player.isFlying()) {
            player.setAllowFlight(true);
        }
    }
}
    @EventHandler
    public void onFly(PlayerToggleFlightEvent e) {
        Player player = e.getPlayer();
        if (player.getGameMode() == GameMode.CREATIVE) {
            return;
        }
        e.setCancelled(true);
        player.setAllowFlight(false);
        player.setFlying(false);
        player.setVelocity(player.getLocation().getDirection().multiply(1.3).setY(1.1));
        // multiply = 1.3, setY = 1.1
        player.spigot().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 1, 1, 1.0f, 1.0f, 1.0f, 1.0f, 1, 1);
    }
}