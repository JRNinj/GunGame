package de.jrninj.gungame.commands;

import de.jrninj.gungame.game.GunGame;
import de.jrninj.gungame.game.GunGameKits;
import de.jrninj.gungame.utils.ScoreBoardGG;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
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

                    if(Integer.parseInt(args[0]) <= 48 && Integer.parseInt(args[0]) >= 0) {
                        GunGame.kitvalue.put(player.getUniqueId(), Integer.parseInt(args[0]));
                        GunGameKits.setKit(player, Integer.parseInt(args[0]));

                        player.sendMessage("§2Du hast dir das Kit §6" + args[0] + " §2zugewiesen!");
                        ScoreBoardGG sb = new ScoreBoardGG();
                        sb.ScoreBoard(player);
                    } else
                        player.sendMessage("§4Es gibt nur Kits von §60 - 30§4!");

                } else if(args.length == 2) {

                    if(Bukkit.getPlayer(args[0]) != null) {
                        Player target = (Player) Bukkit.getPlayer(args[0]);

                        if(Integer.parseInt(args[1]) <= 48 && Integer.parseInt(args[1]) >= 0) {
                            GunGame.kitvalue.put(target.getUniqueId(), Integer.parseInt(args[1]));
                            GunGameKits.setKit(target, Integer.parseInt(args[1]));

                            player.sendMessage("§2Du hast §6" + args[0] + " §2das Kit §6" + args[1] + " §2zugewiesen!");
                            target.sendMessage("§6Dir wurde das Kit §f" + args[1] + " §6von einem §4Admin §6zugewiesen!");
                            ScoreBoardGG sb = new ScoreBoardGG();
                            sb.ScoreBoard(player);
                            sb.ScoreBoard(target);
                        } else
                            player.sendMessage("§4Es gibt nur Kits von §60 - 48§4!");

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
            tc.add("0");
            tc.add("1");
            tc.add("2");
            tc.add("3");
            tc.add("4");
            tc.add("5");
            tc.add("6");
            tc.add("7");
            tc.add("8");
            tc.add("9");
            tc.add("10");
            tc.add("11");
            tc.add("12");
            tc.add("13");
            tc.add("14");
            tc.add("15");
            tc.add("16");
            tc.add("17");
            tc.add("18");
            tc.add("19");
            tc.add("20");
            tc.add("21");
            tc.add("22");
            tc.add("23");
            tc.add("24");
            tc.add("25");
            tc.add("26");
            tc.add("27");
            tc.add("28");
            tc.add("29");
            tc.add("30");
            tc.add("31");
            tc.add("32");
            tc.add("33");
            tc.add("34");
            tc.add("35");
            tc.add("36");
            tc.add("37");
            tc.add("38");
            tc.add("39");
            tc.add("40");
            tc.add("41");
            tc.add("42");
            tc.add("43");
            tc.add("44");
            tc.add("45");
            tc.add("46");
            tc.add("47");
            tc.add("48");
            for(Player all : Bukkit.getOnlinePlayers()) {
                tc.add(all.getName());
            }
            return tc.stream().filter(s -> s.startsWith(args[0])).collect(Collectors.toList());
        } else if(args.length == 2) {
            tc.add("0");
            tc.add("1");
            tc.add("2");
            tc.add("3");
            tc.add("4");
            tc.add("5");
            tc.add("6");
            tc.add("7");
            tc.add("8");
            tc.add("9");
            tc.add("10");
            tc.add("11");
            tc.add("12");
            tc.add("13");
            tc.add("14");
            tc.add("15");
            tc.add("16");
            tc.add("17");
            tc.add("18");
            tc.add("19");
            tc.add("20");
            tc.add("21");
            tc.add("22");
            tc.add("23");
            tc.add("24");
            tc.add("25");
            tc.add("26");
            tc.add("27");
            tc.add("28");
            tc.add("29");
            tc.add("30");
            tc.add("31");
            tc.add("32");
            tc.add("33");
            tc.add("34");
            tc.add("35");
            tc.add("36");
            tc.add("37");
            tc.add("38");
            tc.add("39");
            tc.add("40");
            tc.add("41");
            tc.add("42");
            tc.add("43");
            tc.add("44");
            tc.add("45");
            tc.add("46");
            tc.add("47");
            tc.add("48");
            return tc.stream().filter(s -> s.startsWith(args[1])).collect(Collectors.toList());
        }

        return null;
    }
}
