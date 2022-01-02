package de.jrninj.gungame.game;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GunGameKits {

    public static void setKit(Player player, int kit) {
        player.getInventory().clear();
        Inventory i = player.getInventory();
        if(kit == 0) {
            i.setItem(0, new ItemStack(Material.WOODEN_AXE));
        } else if(kit == 1) {
            i.setItem(0, new ItemStack(Material.WOODEN_SWORD));
        } else if(kit == 2) {
            i.setItem(0, new ItemStack(Material.WOODEN_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        } else if(kit == 3) {
            i.setItem(0, new ItemStack(Material.WOODEN_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
        } else if(kit == 4) {
            i.setItem(0, new ItemStack(Material.GOLDEN_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
        } else if(kit == 5) {
            i.setItem(0, new ItemStack(Material.GOLDEN_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
        } else if(kit == 6) {
            i.setItem(0, new ItemStack(Material.GOLDEN_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
        } else if(kit == 7) {
            i.setItem(0, new ItemStack(Material.STONE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
        } else if(kit == 8) {
            i.setItem(0, new ItemStack(Material.STONE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
        } else if(kit == 9) {
            i.setItem(0, new ItemStack(Material.STONE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        } else if(kit == 10) {
            i.setItem(0, new ItemStack(Material.IRON_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        } else if(kit == 11) {
            i.setItem(0, new ItemStack(Material.IRON_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
        } else if(kit == 12) {
            i.setItem(0, new ItemStack(Material.IRON_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        } else if(kit == 13) {
            i.setItem(0, new ItemStack(Material.DIAMOND_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        } else if(kit == 14) {
            i.setItem(0, new ItemStack(Material.DIAMOND_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        } else if(kit == 15) {
            i.setItem(0, new ItemStack(Material.DIAMOND_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        } else if(kit == 16) {
            i.setItem(0, new ItemStack(Material.NETHERITE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        } else if(kit == 17) {
            i.setItem(0, new ItemStack(Material.NETHERITE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        } else if(kit == 18) {
            i.setItem(0, new ItemStack(Material.NETHERITE_SWORD));
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 19) {
            ItemStack i1 = new ItemStack(Material.WOODEN_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 20) {
            ItemStack i1 = new ItemStack(Material.GOLDEN_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 21) {
            ItemStack i1 = new ItemStack(Material.STONE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 22) {
            ItemStack i1 = new ItemStack(Material.IRON_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 23) {
            ItemStack i1 = new ItemStack(Material.DIAMOND_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 24) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            player.getInventory().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 25) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.LEATHER_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 26) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.GOLDEN_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 27) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.CHAINMAIL_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 28) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.IRON_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 29) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.DIAMOND_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 30) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            player.getInventory().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 31) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.LEATHER_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 32) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.GOLDEN_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 33) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.CHAINMAIL_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 34) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.IRON_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 35) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.DIAMOND_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 36) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            player.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 37) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.LEATHER_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 38) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.GOLDEN_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 39) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 40) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.IRON_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 41) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.DIAMOND_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 42) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            player.getInventory().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
        } else if(kit == 43) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.LEATHER_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        } else if(kit == 44) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.GOLDEN_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        } else if(kit == 45) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        } else if(kit == 46) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.IRON_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        } else if(kit == 47) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.DIAMOND_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        } else if(kit == 48) {
            ItemStack i1 = new ItemStack(Material.NETHERITE_SWORD);
            i1.addEnchantment(Enchantment.DAMAGE_ALL, 4);
            i.setItem(0, i1);
            ItemStack i2 = new ItemStack(Material.NETHERITE_BOOTS);
            i2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setBoots(i2);
            ItemStack i3 = new ItemStack(Material.NETHERITE_HELMET);
            i3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setHelmet(i3);
            ItemStack i4 = new ItemStack(Material.NETHERITE_CHESTPLATE);
            i4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setChestplate(i4);
            ItemStack i5 = new ItemStack(Material.NETHERITE_LEGGINGS);
            i5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            player.getInventory().setLeggings(i5);
        }
    }
}
