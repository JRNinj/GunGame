package de.jrninj.gungame.utils;

import org.bukkit.Location;

public class Regions {

    public static boolean isIn(Location loc, Location locA, Location locB) {

        Double maxX = (Math.max(locA.getX(), locB.getX()));
        Double minX = (Math.min(locA.getX(), locB.getX()));

        Double maxY = (Math.max(locA.getY(), locB.getY()));
        Double minY = (Math.min(locA.getY(), locB.getY()));

        Double maxZ = (Math.max(locA.getZ(), locB.getZ()));
        Double minZ = (Math.min(locA.getZ(), locB.getZ()));

        if(loc.getX() <= maxX && loc.getX() >= minX) {
            if(loc.getY() <= maxY && loc.getY() >= minY) {
                if(loc.getZ() <= maxZ && loc.getZ() >= minZ) {
                    return true;
                }
            }
        }

        return false;
    }

}
