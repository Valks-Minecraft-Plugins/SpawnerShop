package me.valky.spawnerShop.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import me.valky.spawnerShop.utils.Utils;

public class GUIShopListener implements Listener {
	@EventHandler
	private void invClickEvent(InventoryClickEvent e) {
		InventoryView view = e.getView();
		if (!view.getTitle().equals("Spawner Shop")) return;
		e.setCancelled(true);
		
		PlayerInventory pinv = e.getWhoClicked().getInventory();
		
		if (e.getSlot() >= 0 && e.getSlot() <= 23) {
			if (e.getWhoClicked().getInventory().contains(new ItemStack(Material.EMERALD))) {
				e.getWhoClicked().getInventory().remove(new ItemStack(Material.EMERALD, 10));
			} else {
				Player p = (Player) e.getWhoClicked();
				p.sendMessage(ChatColor.DARK_GREEN + "You need 10 emeralds to do that.");
				view.close();
				return;
			}
		}
		
		switch (e.getSlot()) {
		case 0:
			pinv.addItem(Utils.CREEPER);
			view.close();
			break;
		case 1:
			pinv.addItem(Utils.SKELETON);
			view.close();
			break;
		case 2:
			pinv.addItem(Utils.SPIDER);
			view.close();
			break;
		case 3:
			pinv.addItem(Utils.ZOMBIE);
			view.close();
			break;
		case 4:
			pinv.addItem(Utils.SLIME);
			view.close();
			break;
		case 5:
			pinv.addItem(Utils.GHAST);
			view.close();
			break;
		case 6:
			pinv.addItem(Utils.PIG_ZOMBIE);
			view.close();
			break;
		case 7:
			pinv.addItem(Utils.ENDERMAN);
			view.close();
			break;
		case 8:
			pinv.addItem(Utils.CAVE_SPIDER);
			view.close();
			break;
		case 9:
			pinv.addItem(Utils.SILVERFISH);
			view.close();
			break;
		case 10:
			pinv.addItem(Utils.BLAZE);
			view.close();
			break;
		case 11:
			pinv.addItem(Utils.MAGMA_CUBE);
			view.close();
			break;
		case 12:
			pinv.addItem(Utils.BAT);
			view.close();
			break;
		case 13:
			pinv.addItem(Utils.WITCH);
			view.close();
			break;
		case 14:
			pinv.addItem(Utils.PIG);
			view.close();
			break;
		case 15:
			pinv.addItem(Utils.SHEEP);
			view.close();
			break;
		case 16:
			pinv.addItem(Utils.COW);
			view.close();
			break;
		case 17:
			pinv.addItem(Utils.CHICKEN);
			view.close();
			break;
		case 18:
			pinv.addItem(Utils.SQUID);
			view.close();
			break;
		case 19:
			pinv.addItem(Utils.WOLF);
			view.close();
			break;
		case 20:
			pinv.addItem(Utils.MUSHROOM_COW);
			view.close();
			break;
		case 21:
			pinv.addItem(Utils.OCELOT);
			view.close();
			break;
		case 22:
			pinv.addItem(Utils.HORSE);
			view.close();
			break;
		case 23:
			pinv.addItem(Utils.VILLAGER);
			view.close();
			break;
		default:
			break;
		}
	}
}
