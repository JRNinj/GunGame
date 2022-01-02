package de.jrninj.gungame.listener;

import com.destroystokyo.paper.event.player.PlayerPickupExperienceEvent;
import de.jrninj.gungame.Main;
import de.jrninj.gungame.game.GunGame;
import de.jrninj.gungame.game.GunGameKits;
import de.jrninj.gungame.utils.Regions;
import de.jrninj.gungame.utils.ScoreBoardGG;
import de.jrninj.gungame.utils.StatsFile;
import org.bukkit.GameMode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class UsefulListeners implements Listener {

    @EventHandler
    public void onFoodLevel(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onHeal(EntityRegainHealthEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = (Player) e.getPlayer();
        e.setJoinMessage("§7>> §2" + player.getName());
        GunGame.kitvalue.put(player.getUniqueId(), 0);
        GunGameKits.setKit(player, 0);
        player.setHealth(20);
        player.setGameMode(GameMode.ADVENTURE);

        StatsFile file = new StatsFile();
        FileConfiguration config = file.getFileConfiguration();

        if(config.get(player.getUniqueId() + ".Kills") == null) {
            config.set(player.getUniqueId() + ".Kills", 0);
            config.set(player.getUniqueId() + ".Deaths", 0);
        }
        config.set(player.getUniqueId() + ".Name", player.getName());
        try {
            config.save(file.getFile());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        FileConfiguration config2 = Main.getPlugin().getConfig();
        Random random = new Random();
        int i = random.nextInt(4) + 1;

        player.teleport(config2.getLocation("Setup.Spawn" + i));

        ScoreBoardGG sb = new ScoreBoardGG();
        sb.ScoreBoard(player);
    }

    @EventHandler
    public void onDisconnect(PlayerQuitEvent e) {
        e.setQuitMessage("§7<< §c" + e.getPlayer().getName());
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if(e.getEntityType().equals(EntityType.PLAYER)) {
            if(e.getCause().equals(EntityDamageEvent.DamageCause.DROWNING) || e.getCause().equals(EntityDamageEvent.DamageCause.FALL) || e.getCause().equals(EntityDamageEvent.DamageCause.DRYOUT) || e.getCause().equals(EntityDamageEvent.DamageCause.FLY_INTO_WALL) || e.getCause().equals(EntityDamageEvent.DamageCause.FIRE) || e.getCause().equals(EntityDamageEvent.DamageCause.FIRE_TICK) || e.getCause().equals(EntityDamageEvent.DamageCause.LAVA) || e.getCause().equals(EntityDamageEvent.DamageCause.SUFFOCATION)) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onEntityDamge(EntityDamageByEntityEvent e) {
        if(e.getEntityType().equals(EntityType.PLAYER)) {
            Player player = (Player) e.getEntity();
            FileConfiguration config = Main.Plugin.getConfig();
            if(config.get("Setup.SpawnArea.1") != null && config.get("Setup.SpawnArea.2") != null) {
                if(Regions.isIn(player.getLocation(), config.getLocation("Setup.SpawnArea.1"), config.getLocation("Setup.SpawnArea.2"))) {
                    e.setCancelled(true);
                }
                if(Regions.isIn(e.getDamager().getLocation(), config.getLocation("Setup.SpawnArea.1"), config.getLocation("Setup.SpawnArea.2"))) {
                    e.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onPickup(PlayerAttemptPickupItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onExpPickup(PlayerPickupExperienceEvent e) {
        e.setCancelled(true);
    }

}
