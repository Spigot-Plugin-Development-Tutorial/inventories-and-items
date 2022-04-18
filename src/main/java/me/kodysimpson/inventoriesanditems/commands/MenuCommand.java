package me.kodysimpson.inventoriesanditems.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        //Inventory sizes(multiple of 9 up to 54)
        //9 18 27 36 45 54

        Inventory inventory = Bukkit.createInventory(p, 9, ChatColor.RED + "Potato Time");

        //ItemStacks are items in the game
        ItemStack item = new ItemStack(Material.BEEF, 16);
        inventory.addItem(item);

        //ItemMeta is the metadata of an item, such as the name, lore, and enchantments
        ItemStack flower = new ItemStack(Material.POPPY, 1);
        ItemMeta flowerMeta = flower.getItemMeta();
        flowerMeta.setDisplayName("Sexy Flower");

        //Lore is a list of strings that are displayed when you hover over an item
        ArrayList<String> lore = new ArrayList<>();
        lore.add("This is the ");
        lore.add("coolest flower ");
        lore.add("on the planet.");
        flowerMeta.setLore(lore);

        //Adding a simple enchantment to the item
        flowerMeta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        flower.setItemMeta(flowerMeta);

        //Adding the item to the inventory at a specific slot
        inventory.setItem(3, flower);
        //Adding the item to the inventory to the first available slot
        //inventory.addItem(flower);

        // Dont forget to open the inventory for the player or they wont see it
        p.openInventory(inventory);

        return true;
    }
}
