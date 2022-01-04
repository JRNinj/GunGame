package de.jrninj.gungame.game;

import de.jrninj.gungame.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GunGameKits {

    public static void setKit(Player player, int kit) {
        FileConfiguration config = Main.getPlugin().getConfig();
        player.getInventory().clear();
        Inventory i = player.getInventory();

        //Hand Item
        if(config.get("Kits." + kit + ".hand.Item") != null && !config.get("Kits." + kit + ".hand.Item").equals("/")) {

            if(config.get("Kits." + kit + ".hand.Enchantment") != null && !config.get("Kits." + kit + ".hand.Enchantment").equals("/")) {

                if(config.get("Kits." + kit + ".hand.Level") != null && !config.get("Kits." + kit + ".hand.Level").equals("/")) {

                    ItemStack item = new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".hand.Item").toUpperCase()));
                    item.addUnsafeEnchantment(Enchantment.getByKey(NamespacedKey.minecraft(config.getString("Kits." + kit + ".hand.Enchantment").toLowerCase())), config.getInt("Kits." + kit + ".hand.Level"));
                    player.getInventory().setItem(0, item);

                } else
                    Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§4Es muss auch ein Enchantmentlevel in der Config angegeben werden!");

            } else
                player.getInventory().setItem(0, new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".hand.Item").toUpperCase())));
        }

        //Helmet
        if(config.get("Kits." + kit + ".helmet.Item") != null && !config.get("Kits." + kit + ".helmet.Item").equals("/")) {

            if(config.get("Kits." + kit + ".helmet.Enchantment") != null && !config.get("Kits." + kit + ".helmet.Enchantment").equals("/")) {

                if(config.get("Kits." + kit + ".helmet.Level") != null && !config.get("Kits." + kit + ".helmet.Level").equals("/")) {

                    ItemStack item = new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".helmet.Item").toUpperCase()));
                    item.addUnsafeEnchantment(Enchantment.getByKey(NamespacedKey.minecraft(config.getString("Kits." + kit + ".helmet.Enchantment").toLowerCase())), config.getInt("Kits." + kit + ".helmet.Level"));
                    player.getInventory().setHelmet(item);

                } else
                    Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§4Es muss auch ein Enchantmentlevel in der Config angegeben werden!");

            } else
                player.getInventory().setHelmet(new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".helmet.Item").toUpperCase())));
        }

        //Chestplate
        if(config.get("Kits." + kit + ".chestplate.Item") != null && !config.get("Kits." + kit + ".chestplate.Item").equals("/")) {

            if(config.get("Kits." + kit + ".chestplate.Enchantment") != null && !config.get("Kits." + kit + ".chestplate.Enchantment").equals("/")) {

                if(config.get("Kits." + kit + ".chestplate.Level") != null && !config.get("Kits." + kit + ".chestplate.Level").equals("/")) {

                    ItemStack item = new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".chestplate.Item").toUpperCase()));
                    item.addUnsafeEnchantment(Enchantment.getByKey(NamespacedKey.minecraft(config.getString("Kits." + kit + ".chestplate.Enchantment").toLowerCase())), config.getInt("Kits." + kit + ".chestplate.Level"));
                    player.getInventory().setChestplate(item);

                } else
                    Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§4Es muss auch ein Enchantmentlevel in der Config angegeben werden!");

            } else
                player.getInventory().setChestplate(new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".chestplate.Item").toUpperCase())));
        }

        //Leggins
        if(config.get("Kits." + kit + ".leggins.Item") != null && !config.get("Kits." + kit + ".leggins.Item").equals("/")) {

            if(config.get("Kits." + kit + ".leggins.Enchantment") != null && !config.get("Kits." + kit + ".leggins.Enchantment").equals("/")) {

                if(config.get("Kits." + kit + ".leggins.Level") != null && !config.get("Kits." + kit + ".leggins.Level").equals("/")) {

                    ItemStack item = new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".leggins.Item").toUpperCase()));
                    item.addUnsafeEnchantment(Enchantment.getByKey(NamespacedKey.minecraft(config.getString("Kits." + kit + ".leggins.Enchantment").toLowerCase())), config.getInt("Kits." + kit + ".leggins.Level"));
                    player.getInventory().setLeggings(item);

                } else
                    Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§4Es muss auch ein Enchantmentlevel in der Config angegeben werden!");

            } else
                player.getInventory().setLeggings(new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".leggins.Item").toUpperCase())));
        }

        //Boots
        if(config.get("Kits." + kit + ".boots.Item") != null && !config.get("Kits." + kit + ".boots.Item").equals("/")) {

            if(config.get("Kits." + kit + ".boots.Enchantment") != null && !config.get("Kits." + kit + ".boots.Enchantment").equals("/")) {

                if(config.get("Kits." + kit + ".boots.Level") != null && !config.get("Kits." + kit + ".boots.Level").equals("/")) {

                    ItemStack item = new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".boots.Item").toUpperCase()));
                    item.addUnsafeEnchantment(Enchantment.getByKey(NamespacedKey.minecraft(config.getString("Kits." + kit + ".boots.Enchantment").toLowerCase())), config.getInt("Kits." + kit + ".boots.Level"));
                    player.getInventory().setBoots(item);

                } else
                    Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§4Es muss auch ein Enchantmentlevel in der Config angegeben werden!");

            } else
                player.getInventory().setBoots(new ItemStack(Material.getMaterial(config.getString("Kits." + kit + ".boots.Item").toUpperCase())));
        }

    }
}
