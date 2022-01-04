package de.jrninj.gungame.game;

import de.jrninj.gungame.Main;
import de.jrninj.gungame.utils.ScoreBoardGG;
import de.jrninj.gungame.utils.StatsFile;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class GunGame implements Listener {

    public static HashMap<UUID, Integer> kitvalue = new HashMap<>();
    private static FileConfiguration cfg1 = Main.getPlugin().getConfig();
    private static Material m = Material.getMaterial(cfg1.getString("Setup.DeathBlock"));
    private static int scheduler2;

    @EventHandler
    public void onDie(PlayerDeathEvent e) {
        if(e.getEntityType().equals(EntityType.PLAYER)) {
            Player player = (Player) e.getEntity();

            if(e.getEntity().getKiller() != null) {
                Player killer = (Player) e.getEntity().getKiller();
                e.setDeathMessage(null);

                player.sendMessage("§c§l⚔ §7- Du wurdest von §6" + killer.getName() + " §7getötet!");
                killer.sendMessage("§2§l⚔ §7- Du hast §6" + player.getName() + " §7getötet!");

                kitvalue.put(player.getUniqueId(), getNewLevelAfterDeath(kitvalue.get(player.getUniqueId())));

                if(kitvalue.get(killer.getUniqueId()) + 1 <= 48) {
                    kitvalue.put(killer.getUniqueId(), kitvalue.get(killer.getUniqueId()) + 1);
                }

                GunGameKits.setKit(player, kitvalue.get(player.getUniqueId()));
                GunGameKits.setKit(killer, kitvalue.get(killer.getUniqueId()));

                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_HIT, 50, 2);
                killer.playSound(killer.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 50, 5);
                int x = (int) Math.round(killer.getHealth()) + 10;
                if(x > 20) {
                    x = 20;
                }
                killer.setHealth(x);

                StatsFile file = new StatsFile();
                FileConfiguration config = file.getFileConfiguration();
                config.set(player.getUniqueId() + ".Deaths", config.getInt(player.getUniqueId() + ".Deaths") + 1);
                config.set(killer.getUniqueId() + ".Kills", config.getInt(killer.getUniqueId() + ".Kills") + 1);
                try {
                    config.save(file.getFile());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                ScoreBoardGG sb = new ScoreBoardGG();
                sb.ScoreBoard(player);
                sb.ScoreBoard(killer);

            } else {
                e.setDeathMessage(null);

                player.sendMessage("§c§l⚔ §7- Du bist gestorben!");

                kitvalue.put(player.getUniqueId(), getNewLevelAfterDeath(kitvalue.get(player.getUniqueId())));

                GunGameKits.setKit(player, kitvalue.get(player.getUniqueId()));

                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_HIT, 50, 2);

                StatsFile file = new StatsFile();
                FileConfiguration config = file.getFileConfiguration();
                config.set(player.getUniqueId() + ".Deaths", config.getInt(player.getUniqueId() + ".Deaths") + 1);
                try {
                    config.save(file.getFile());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                ScoreBoardGG sb = new ScoreBoardGG();
                sb.ScoreBoard(player);
            }
        }
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        Player player = (Player) e.getPlayer();
        FileConfiguration config2 = Main.getPlugin().getConfig();
        Random random = new Random();
        int i = random.nextInt(4) + 1;

        e.setRespawnLocation(config2.getLocation("Setup.Spawn" + i));
    }

    public static void GunGameEngine() {

        scheduler2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                for(Player player : Bukkit.getOnlinePlayers()) {

                    Block block = player.getLocation().getBlock();
                    if(block.getType().equals(m)) {
                        player.setHealth(0);
                        player.setKiller(null);
                    }

                }
            }
        }, 0, 5);

    }

    private static int getNewLevelAfterDeath(int level){
        return (int) Math.round(Math.sqrt(level)*(Math.log(level)/1.1));
    }

}
