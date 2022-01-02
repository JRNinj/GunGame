package de.jrninj.gungame.commands;

import de.jrninj.gungame.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GunGameSetup implements CommandExecutor, TabExecutor {

    private int x;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("gungame.command.setup")) {
                if(args.length == 2) {
                    if (args[0].equalsIgnoreCase("setSpawn")) {
                        if (Integer.parseInt(args[1]) == 1) {
                            FileConfiguration config = Main.getPlugin().getConfig();
                            Location pl = player.getLocation();
                            pl.setPitch(0);
                            config.set("Setup.Spawn1", pl);
                            Main.getPlugin().saveConfig();

                            player.sendMessage("§2Du hast den Spawn 1 festgelegt! §6(§f" + player.getLocation().getBlockX() + "§6, §f" + player.getLocation().getBlockY() + "§6, §f" + player.getLocation().getBlockZ() + "§6, Yaw: §f" + player.getLocation().getYaw() + "§6)");
                        } else if (Integer.parseInt(args[1]) == 2) {
                            FileConfiguration config = Main.getPlugin().getConfig();
                            Location pl = player.getLocation();
                            pl.setPitch(0);
                            config.set("Setup.Spawn2", pl);
                            Main.getPlugin().saveConfig();

                            player.sendMessage("§2Du hast den Spawn 2 festgelegt! §6(§f" + player.getLocation().getBlockX() + "§6, §f" + player.getLocation().getBlockY() + "§6, §f" + player.getLocation().getBlockZ() + "§6, Yaw: §f" + player.getLocation().getYaw() + "§6)");
                        } else if (Integer.parseInt(args[1]) == 3) {
                            FileConfiguration config = Main.getPlugin().getConfig();
                            Location pl = player.getLocation();
                            pl.setPitch(0);
                            config.set("Setup.Spawn3", pl);
                            Main.getPlugin().saveConfig();

                            player.sendMessage("§2Du hast den Spawn 3 festgelegt! §6(§f" + player.getLocation().getBlockX() + "§6, §f" + player.getLocation().getBlockY() + "§6, §f" + player.getLocation().getBlockZ() + "§6, Yaw: §f" + player.getLocation().getYaw() + "§6)");
                        } else if (Integer.parseInt(args[1]) == 4) {
                            FileConfiguration config = Main.getPlugin().getConfig();
                            Location pl = player.getLocation();
                            pl.setPitch(0);
                            config.set("Setup.Spawn4", pl);
                            Main.getPlugin().saveConfig();

                            player.sendMessage("§2Du hast den Spawn 4 festgelegt! §6(§f" + player.getLocation().getBlockX() + "§6, §f" + player.getLocation().getBlockY() + "§6, §f" + player.getLocation().getBlockZ() + "§6, Yaw: §f" + player.getLocation().getYaw() + "§6)");
                        } else {
                            player.sendMessage("§4Du kannst maximal 4 Spawns festlegen!");
                            return false;
                        }
                    } else if (args[0].equalsIgnoreCase("setDeathBlock")) {
                        FileConfiguration config = Main.Plugin.getConfig();
                        if (!args[1].toUpperCase().equals(args[1])) {
                            args[1] = args[1].toUpperCase();
                        }

                        if (Material.getMaterial(args[1]) != null) {
                            config.set("Setup.DeathBlock", args[1]);
                            Main.getPlugin().saveConfig();
                            player.sendMessage("§2Der Todesblock wurde zu §6" + args[1] + " §2geändert!");
                        } else {
                            TextComponent message = new TextComponent("§4Dieser Block existiert nicht! §6(§fDetails ansehen§6)");
                            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://papermc.io/javadocs/paper/1.17/org/bukkit/Material.html"));
                            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                                    new ComponentBuilder("https://papermc.io/javadocs/paper/1.17/org/bukkit/Material.html").color(ChatColor.GRAY).create()));
                            player.spigot().sendMessage(message);
                        }
                    } else if (args[0].equalsIgnoreCase("setSpawnArea")) {
                        int areaselction;
                        if (Integer.parseInt(args[1]) == 1) {
                            areaselction = 1;
                        } else if (Integer.parseInt(args[1]) == 2) {
                            areaselction = 2;
                        } else {
                            player.sendMessage("§4Du kannst nur an 2 Ecken eine Position festlegen!");
                            return false;
                        }

                        FileConfiguration config = Main.getPlugin().getConfig();
                        config.set("Setup.SpawnArea." + areaselction, player.getLocation());
                        Main.getPlugin().saveConfig();

                        player.sendMessage("§2Du hast die §6" + areaselction + "§6. §2Position von der Spawn Area gesetzt!");

                    } else
                        player.sendMessage("§4Dieses Argument existiert nicht!");
                } else if(args.length == 5) {
                    if(args[0].equalsIgnoreCase("setSpawnArea")) {
                        int areaselction;
                        if (Integer.parseInt(args[1]) == 1) {
                            areaselction = 1;
                        } else if (Integer.parseInt(args[1]) == 2) {
                            areaselction = 2;
                        } else {
                            player.sendMessage("§4Du kannst nur an 2 Ecken eine Position festlegen!");
                            return false;
                        }

                        FileConfiguration config = Main.getPlugin().getConfig();

                        Location loc = new Location(player.getWorld(), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
                        config.set("Setup.SpawnArea." + areaselction, loc);
                        Main.getPlugin().saveConfig();

                        player.sendMessage("§2Du hast die §6" + areaselction + "§6. §2Position von der Spawn Area gesetzt!");
                    } else
                        player.sendMessage("§4Dieses Argument existiert nicht!");
                } else if(args.length == 6) {
                    if(args[0].equalsIgnoreCase("setSpawn")) {
                        if(Integer.parseInt(args[1]) == 1) {
                            x = 1;
                        } else if(Integer.parseInt(args[1]) == 2) {
                            x = 2;
                        } else if(Integer.parseInt(args[1]) == 3) {
                            x = 3;
                        } else if(Integer.parseInt(args[1]) == 4) {
                            x = 4;
                        } else {
                            player.sendMessage("§4Du kannst maximal 4 Spawns festlegen!");
                            return false;
                        }

                        FileConfiguration config = Main.getPlugin().getConfig();
                        Location pl = new Location(player.getWorld(), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]), Float.parseFloat(args[5]), 0);
                        config.set("Setup.Spawn" + x, pl);
                        Main.getPlugin().saveConfig();

                        player.sendMessage("§2Du hast den Spawn §2" + x + " §2festgelegt! §6(§f" + args[2] + "§6, §f" + args[3] + "§6, §f" + args[4] + "§6, Yaw: §f" + args[5] + "§6)");
                    } else
                        player.sendMessage("§4Dieses Argument existiert nicht!");
                } else
                    player.sendMessage("§4Bitte benutze: §6/setup <setSpawn/setDeathBlock> <Spawn/Block> <Koordinaten>");

            } else
                player.sendMessage("§4Dafür hast du keine Rechte!");
        } else
            sender.sendMessage("§4Diesen Befehl kann nur ein Spieler benutzen!");

        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {

        List<String> tc = new ArrayList<>();

        if(args.length == 1) {
            tc.add("setSpawn");
            tc.add("setDeathBlock");
            tc.add("setSpawnArea");
            return tc.stream().filter(s -> s.startsWith(args[0])).collect(Collectors.toList());
        } else if(args.length == 2) {
            if(args[0].equalsIgnoreCase("setSpawn")) {
                tc.add("1");
                tc.add("2");
                tc.add("3");
                tc.add("4");
                return tc;
            } else if(args[0].equalsIgnoreCase("setDeathBlock")) {
                for(Material m : Material.values()) {
                    if(args[1].toLowerCase().equals(args[1])) {
                        tc.add(m.toString().toLowerCase());
                    } else
                        tc.add(m.toString());
                }
                return tc.stream().filter(s -> s.startsWith(args[1])).collect(Collectors.toList());
            } else if(args[0].equalsIgnoreCase("setSpawnArea")) {
                tc.add("1");
                tc.add("2");
                tc.add("[Positions:(1/2)]");
                return tc;
            }
        } else if(args.length == 3) {
            if(args[0].equalsIgnoreCase("setSpawn")) {
                tc.add("[X-Koordinate]");
                return tc;
            } else if(args[0].equalsIgnoreCase("setSpawnArea")) {
                Player player = (Player) sender;
                tc.add("[X-Koordinate]");
                tc.add(String.valueOf(player.getTargetBlock(5).getX()));
                tc.add(String.valueOf(player.getLocation().getBlockX()));
                return tc.stream().filter(s -> s.startsWith(args[2])).collect(Collectors.toList());
            }
        } else if(args.length == 4) {
            if(args[0].equalsIgnoreCase("setSpawn")) {
                tc.add("[Y-Koordinate]");
                return tc;
            } else if(args[0].equalsIgnoreCase("setSpawnArea")) {
                Player player = (Player) sender;
                tc.add("[Y-Koordinate]");
                tc.add(String.valueOf(player.getTargetBlock(5).getY()));
                tc.add(String.valueOf(player.getLocation().getBlockY()));
                return tc.stream().filter(s -> s.startsWith(args[3])).collect(Collectors.toList());
            }
        } else if(args.length == 5) {
            if(args[0].equalsIgnoreCase("setSpawn")) {
                tc.add("[Z-Koordinate]");
                return tc;
            } else if(args[0].equalsIgnoreCase("setSpawnArea")) {
                Player player = (Player) sender;
                tc.add("[Z-Koordinate]");
                tc.add(String.valueOf(player.getTargetBlock(5).getZ()));
                tc.add(String.valueOf(player.getLocation().getBlockZ()));
                return tc.stream().filter(s -> s.startsWith(args[4])).collect(Collectors.toList());
            }
        } else if(args.length == 6) {
            if(args[0].equalsIgnoreCase("setSpawn")) {
                tc.add("[Yaw]");
                return tc;
            }
        }

        return null;
    }
}
