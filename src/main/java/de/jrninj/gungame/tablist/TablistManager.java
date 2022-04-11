package de.jrninj.gungame.tablist;

import de.jrninj.gungame.Main;
import de.jrninj.gungame.game.GunGame;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {

    private Main plugin;

    public TablistManager(Main plugin) {
        this.plugin = plugin;
    }

    public void updateTablist() {

        for (Player player : Bukkit.getOnlinePlayers()) {
            Scoreboard scoreboard = player.getScoreboard();

            //Create Teams
            Team team10 = scoreboard.getTeam("team10");
            Team team20 = scoreboard.getTeam("team20");
            Team team30 = scoreboard.getTeam("team30");
            Team team40 = scoreboard.getTeam("team40");
            Team team48 = scoreboard.getTeam("team48");
            if (team10 == null) {
                team10 =scoreboard.registerNewTeam("team10");
            }
            if (team20 == null) {
                team20 =scoreboard.registerNewTeam("team20");
            }
            if (team30 == null) {
                team30 =scoreboard.registerNewTeam("team30");
            }
            if (team40 == null) {
                team40 =scoreboard.registerNewTeam("team40");
            }
            if (team48 == null) {
                team48 =scoreboard.registerNewTeam("team48");
            }

            team10.setPrefix("§8[§7Low§8] §8- §7");
            team10.setColor(ChatColor.GRAY);

            team20.setPrefix("§8[§2Common§8] §8- §7");
            team20.setColor(ChatColor.DARK_GREEN);

            team30.setPrefix("§8[§9Rare§8] §8- §7");
            team30.setColor(ChatColor.BLUE);

            team40.setPrefix("§8[§5Advanced§8] §8- §7");
            team40.setColor(ChatColor.DARK_PURPLE);

            team48.setPrefix("§8[§6Legend§8] §8- §7");
            team48.setColor(ChatColor.GOLD);

            for (Player target : Bukkit.getOnlinePlayers()) {
                if (GunGame.kitvalue.get(target.getUniqueId()) < 10) {
                    team10.addEntry(target.getName());
                } else if (GunGame.kitvalue.get(target.getUniqueId()) < 20) {
                    team20.addEntry(target.getName());
                } else if (GunGame.kitvalue.get(target.getUniqueId()) < 30) {
                    team30.addEntry(target.getName());
                } else if (GunGame.kitvalue.get(target.getUniqueId()) < 40) {
                    team40.addEntry(target.getName());
                } else if (GunGame.kitvalue.get(target.getUniqueId()) >= 40) {
                    team48.addEntry(target.getName());
                }
            }
        }

    }

    public void scheduleTablist() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                updateTablist();
            }
        }, 10, 10);
    }
}
