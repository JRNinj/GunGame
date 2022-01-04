package de.jrninj.gungame.commands;

import de.jrninj.gungame.Main;
import de.jrninj.gungame.game.GunGame;
import de.jrninj.gungame.game.GunGameKits;
import de.jrninj.gungame.utils.ScoreBoardGG;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KitCommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("gungame.command.kit")) {
                if(args.length == 1) {

                    GunGame.kitvalue.put(player.getUniqueId(), Integer.parseInt(args[0]));
                    GunGameKits.setKit(player, Integer.parseInt(args[0]));

                    player.sendMessage("§2Du hast dir das Kit §6" + args[0] + " §2zugewiesen!");
                    ScoreBoardGG sb = new ScoreBoardGG();
                    sb.ScoreBoard(player);

                } else if(args.length == 2) {

                    if(Bukkit.getPlayer(args[0]) != null) {
                        Player target = (Player) Bukkit.getPlayer(args[0]);

                        GunGame.kitvalue.put(target.getUniqueId(), Integer.parseInt(args[1]));
                        GunGameKits.setKit(target, Integer.parseInt(args[1]));

                        player.sendMessage("§2Du hast §6" + args[0] + " §2das Kit §6" + args[1] + " §2zugewiesen!");
                        target.sendMessage("§6Dir wurde das Kit §f" + args[1] + " §6von einem §4Admin §6zugewiesen!");
                        ScoreBoardGG sb = new ScoreBoardGG();
                        sb.ScoreBoard(player);
                        sb.ScoreBoard(target);

                    } else
                        player.sendMessage("§4Dieser Spieler ist nicht online oder existiert nicht!");

                } else
                    player.sendMessage("§4Bitte benutze: §6/kit <Kit> §4oder: §6/kit <Spieler> <Kit>");
            } else
                player.sendMessage("§4Dafür hast du keine Rechte!");
        } else
            sender.sendMessage("§4Diesen Befehl kann nur ein Spieler verwenden!");

        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {

        ArrayList<String> tc = new ArrayList<>();
        if(args.length == 1) {
            FileConfiguration config = Main.getPlugin().getConfig();
            int i = config.getConfigurationSection("Kits").getKeys(false).size();
            for (int x = 0; x < i; x++) {
                tc.add(String.valueOf(x));
            }

            for(Player all : Bukkit.getOnlinePlayers()) {
                tc.add(all.getName());
            }
            return tc.stream().filter(s -> s.startsWith(args[0])).collect(Collectors.toList());
        } else if(args.length == 2) {
            FileConfiguration config = Main.getPlugin().getConfig();
            int i = config.getConfigurationSection("Kits").getKeys(false).size();
            for (int x = 0; x < i; x++) {
                tc.add(String.valueOf(x));
            }

            return tc.stream().filter(s -> s.startsWith(args[1])).collect(Collectors.toList());
        }

        return null;
    }
}
