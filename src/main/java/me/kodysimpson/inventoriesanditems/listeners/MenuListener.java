package me.kodysimpson.inventoriesanditems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        // Do e.getClickedInventory().getTitle() for older versions like 1.8.8
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Potato Time")){ //dont forget to include ChatColor formatting

            //Make sure the player clicked on an item and not on the inventory
            if(e.getCurrentItem() == null){
                return;
            }

            //See what item they clicked on by getting the material of the item
            if(e.getCurrentItem().getType() == Material.POPPY){
                System.out.println("You clicked the poppy!!!");
            }else if(e.getCurrentItem().getType() == Material.BEEF){
                System.out.println("You clicked the beef!!!");
            }else{
                System.out.println("You clicked on something else!!!");
            }

            //make it so that players cannot move items in the inventory
            e.setCancelled(true);

        }

    }

}
