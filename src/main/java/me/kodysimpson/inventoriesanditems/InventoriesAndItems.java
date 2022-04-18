package me.kodysimpson.inventoriesanditems;

import me.kodysimpson.inventoriesanditems.commands.MenuCommand;
import me.kodysimpson.inventoriesanditems.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class InventoriesAndItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("menu").setExecutor(new MenuCommand());

        getServer().getPluginManager().registerEvents(new MenuListener(), this);


    }

}
