package me.valky.spawnerShop;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.valky.spawnerShop.cmds.CmdShop;
import me.valky.spawnerShop.gui.GUIShopListener;
import me.valky.spawnerShop.listeners.BlockListener;

public class SpawnerShop extends JavaPlugin {
	@Override
	public void onEnable() {
		registerEvents(getServer().getPluginManager());
		registerCommands();
	}
	
	private void registerEvents(PluginManager pm) {
		pm.registerEvents(new BlockListener(), this);
		pm.registerEvents(new GUIShopListener(), this);
	}
	
	private void registerCommands() {
		getCommand("spawnershop").setExecutor(new CmdShop());
	}
}
