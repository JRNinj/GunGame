package de.jrninj.gungame;

import de.jrninj.gungame.commands.GunGameSetup;
import de.jrninj.gungame.commands.KitCommand;
import de.jrninj.gungame.game.GunGame;
import de.jrninj.gungame.listener.UsefulListeners;
import de.jrninj.gungame.utils.DefaultConfig;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main Plugin;
    public static String PREFIX = "§f[§4Gun§6Game§f] §f";

    @Override
    public void onEnable() {
        Plugin = this;
        log(PREFIX + "§2Das Plugin wurde erfolgrecih geladen!");
        log("§fAlle Rechte am Plugin gehören ausschließlich den Mitarbeitern von TimeTravelStudios ©2021");

        register();

        DefaultConfig.setStandart();
        GunGame.GunGameEngine();

        for (World world : Bukkit.getWorlds()) {
            world.setGameRule(GameRule.KEEP_INVENTORY, true);
            world.setGameRule(GameRule.DO_IMMEDIATE_RESPAWN, true);
        }

    }

    @Override
    public void onDisable() {

        log(PREFIX + "§cDas Plugin wurde erfolgreich entladen!");

    }

    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(text);
    }

    public void register() {
        PluginManager event = Bukkit.getPluginManager();
        event.registerEvents(new UsefulListeners(), this);
        event.registerEvents(new GunGame(), this);

        Bukkit.getPluginCommand("kit").setExecutor(new KitCommand());
        Bukkit.getPluginCommand("kit").setExecutor(new KitCommand());
        Bukkit.getPluginCommand("setup").setExecutor(new GunGameSetup());
    }

    public static Main getPlugin() {
        return Plugin;
    }
}
