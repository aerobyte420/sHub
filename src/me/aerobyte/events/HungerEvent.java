package me.aerobyte.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class HungerEvent implements Listener {

    @EventHandler
    public void onHungryMan(FoodLevelChangeEvent e) {
        if(e.getEntityType() == EntityType.PLAYER) {
            Player player = (Player) e.getEntity();
            e.setCancelled(true);
            player.setFoodLevel(20);
        }
    }

}
