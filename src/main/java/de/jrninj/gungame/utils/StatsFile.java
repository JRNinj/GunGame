package de.jrninj.gungame.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class StatsFile {

    public File getFile() {
        return new File("plugins/GunGame", "stats.yml");
    }

     public FileConfiguration getFileConfiguration() {
        return YamlConfiguration.loadConfiguration(getFile());
    }

}
