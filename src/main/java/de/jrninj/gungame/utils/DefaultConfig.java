package de.jrninj.gungame.utils;

import de.jrninj.gungame.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

public class DefaultConfig {

    public static void setStandart() {
        FileConfiguration config = Main.getPlugin().getConfig();

        World world = Bukkit.getWorlds().get(0);

        config.options().copyDefaults(true);
        config.addDefault("Setup.DeathBlock", "WATER");
        config.addDefault("Setup.Spawn1", new Location(world, 0, 0, 0, 90, 0));
        config.addDefault("Setup.Spawn2", new Location(world, 0, 0, 0, 90, 0));
        config.addDefault("Setup.Spawn3", new Location(world, 0, 0, 0, 90, 0));
        config.addDefault("Setup.Spawn4", new Location(world, 0, 0, 0, 90, 0));

        Main.getPlugin().saveConfig();
    }

}
