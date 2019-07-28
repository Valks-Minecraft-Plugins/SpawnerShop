package me.valky.spawnerShop.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {
	public static final ItemStack CREEPER = spawnerItem("Creeper");
	public static final ItemStack SKELETON = spawnerItem("Skeleton");
	public static final ItemStack SPIDER = spawnerItem("Spider");
	public static final ItemStack ZOMBIE = spawnerItem("Zombie");
	public static final ItemStack SLIME = spawnerItem("Slime");
	public static final ItemStack GHAST = spawnerItem("Ghast");
	public static final ItemStack PIG_ZOMBIE = spawnerItem("Pig Zombie");
	public static final ItemStack ENDERMAN = spawnerItem("Enderman");
	public static final ItemStack CAVE_SPIDER = spawnerItem("Cave Spider");
	public static final ItemStack SILVERFISH = spawnerItem("Silverfish");
	public static final ItemStack BLAZE = spawnerItem("Blaze");
	public static final ItemStack MAGMA_CUBE = spawnerItem("Magma Cube");
	public static final ItemStack BAT = spawnerItem("Bat");
	public static final ItemStack WITCH = spawnerItem("Witch");
	public static final ItemStack PIG = spawnerItem("Pig");
	public static final ItemStack SHEEP = spawnerItem("Sheep");
	public static final ItemStack COW = spawnerItem("Cow");
	public static final ItemStack CHICKEN = spawnerItem("Chicken");
	public static final ItemStack SQUID = spawnerItem("Squid");
	public static final ItemStack WOLF = spawnerItem("Wolf");
	public static final ItemStack MUSHROOM_COW = spawnerItem("Mushroom Cow");
	public static final ItemStack OCELOT = spawnerItem("Ocelot");
	public static final ItemStack HORSE = spawnerItem("Horse");
	public static final ItemStack VILLAGER = spawnerItem("Villager");
	public static ItemStack spawnerItem(String name) {
		ItemStack spawner = new ItemStack(Material.MOB_SPAWNER);
		ItemMeta im = spawner.getItemMeta();
		im.setDisplayName(name);
		List<String> lore = new ArrayList<String>();
		lore.add("10 Emeralds");
		im.setLore(lore);
		spawner.setItemMeta(im);
		return spawner;
	}
}
