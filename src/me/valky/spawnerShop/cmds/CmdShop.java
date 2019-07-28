package me.valky.spawnerShop.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import me.valky.spawnerShop.utils.Utils;

public class CmdShop implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("spawnershop")) {
			Inventory inv = Bukkit.createInventory(null, 27, "Spawner Shop");
			inv.setItem(0, Utils.CREEPER);
			inv.setItem(1, Utils.SKELETON);
			inv.setItem(2, Utils.SPIDER);
			inv.setItem(3, Utils.ZOMBIE);
			inv.setItem(4, Utils.SLIME);
			inv.setItem(5, Utils.GHAST);
			inv.setItem(6, Utils.PIG_ZOMBIE);
			inv.setItem(7, Utils.ENDERMAN);
			inv.setItem(8, Utils.CAVE_SPIDER);
			inv.setItem(9, Utils.SILVERFISH);
			inv.setItem(10, Utils.BLAZE);
			inv.setItem(11, Utils.MAGMA_CUBE);
			inv.setItem(12, Utils.BAT);
			inv.setItem(13, Utils.WITCH);
			inv.setItem(14, Utils.PIG);
			inv.setItem(15, Utils.SHEEP);
			inv.setItem(16, Utils.COW);
			inv.setItem(17, Utils.CHICKEN);
			inv.setItem(18, Utils.SQUID);
			inv.setItem(19, Utils.WOLF);
			inv.setItem(20, Utils.MUSHROOM_COW);
			inv.setItem(21, Utils.OCELOT);
			inv.setItem(22, Utils.HORSE);
			inv.setItem(23, Utils.VILLAGER);
			Player p = (Player) sender;
			p.openInventory(inv);
			return true;
		}
		
		return false;
	}
}
