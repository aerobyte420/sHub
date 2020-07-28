package me.aerobyte.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageEvent implements Listener {

    @EventHandler
    public void onHurtMan(EntityDamageEvent e) {
        if (e.getEntityType() == EntityType.PLAYER) {
            e.setCancelled(true);
        }
    }
}
