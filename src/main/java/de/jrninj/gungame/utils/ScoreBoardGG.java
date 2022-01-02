package de.jrninj.gungame.utils;

import de.jrninj.gungame.game.GunGame;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreBoardGG {

    public void ScoreBoard(Player player) {
        StatsFile file = new StatsFile();
        FileConfiguration config = file.getFileConfiguration();

        int i = (int) Math.round((config.getDouble(player.getUniqueId() + ".Kills") / config.getDouble(player.getUniqueId() + ".Deaths")) * 100);

        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = board.registerNewObjective("abcd", "abcd", "§4§lGun§6§lGame");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.getScore("   ").setScore(1);
        objective.getScore("§3Level: §f" + GunGame.kitvalue.get(player.getUniqueId())).setScore(2);
        objective.getScore("  ").setScore(3);
        objective.getScore("§8KD-Index: §f" + i + "§f%").setScore(4);
        objective.getScore("    ").setScore(5);
        objective.getScore("§4Deaths: §f" + config.getInt(player.getUniqueId() + ".Deaths")).setScore(6);
        objective.getScore(" ").setScore(7);
        objective.getScore("§6Kills: §f" + config.getInt(player.getUniqueId() + ".Kills")).setScore(8);
        objective.getScore("      ").setScore(9);

        player.setScoreboard(board);
    }

}
