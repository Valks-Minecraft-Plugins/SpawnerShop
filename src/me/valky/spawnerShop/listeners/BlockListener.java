package me.valky.spawnerShop.listeners;

import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
	@EventHandler
	private void blockPlace(BlockPlaceEvent e) {
		if (e.getBlock().getType() != Material.MOB_SPAWNER) return;
		CreatureSpawner cs = (CreatureSpawner) e.getBlock().getState();
		switch (e.getItemInHand().getItemMeta().getDisplayName()) {
		case "Creeper":
			cs.setSpawnedType(EntityType.CREEPER);
			break;
		case "Skeleton":
			cs.setSpawnedType(EntityType.SKELETON);
			break;
		case "Spider":
			cs.setSpawnedType(EntityType.SPIDER);
			break;
		case "Zombie":
			cs.setSpawnedType(EntityType.ZOMBIE);
			break;
		case "Slime":
			cs.setSpawnedType(EntityType.SLIME);
			break;
		case "Ghast":
			cs.setSpawnedType(EntityType.GHAST);
			break;
		case "Pig Zombie":
			cs.setSpawnedType(EntityType.PIG_ZOMBIE);
			break;
		case "Enderman":
			cs.setSpawnedType(EntityType.ENDERMAN);
			break;
		case "Cave Spider":
			cs.setSpawnedType(EntityType.CAVE_SPIDER);
			break;
		case "Silverfish":
			cs.setSpawnedType(EntityType.SILVERFISH);
			break;
		case "Blaze":
			cs.setSpawnedType(EntityType.BLAZE);
			break;
		case "Magma Cube":
			cs.setSpawnedType(EntityType.MAGMA_CUBE);
			break;
		case "Bat":
			cs.setSpawnedType(EntityType.BAT);
			break;
		case "Witch":
			cs.setSpawnedType(EntityType.WITCH);
			break;
		case "Pig":
			cs.setSpawnedType(EntityType.PIG);
			break;
		case "Sheep":
			cs.setSpawnedType(EntityType.SHEEP);
			break;
		case "Cow":
			cs.setSpawnedType(EntityType.COW);
			break;
		case "Chicken":
			cs.setSpawnedType(EntityType.CHICKEN);
			break;
		case "Squid":
			cs.setSpawnedType(EntityType.SQUID);
			break;
		case "Wolf":
			cs.setSpawnedType(EntityType.WOLF);
			break;
		case "Mushroom Cow":
			cs.setSpawnedType(EntityType.MUSHROOM_COW);
			break;
		case "Ocelot":
			cs.setSpawnedType(EntityType.OCELOT);
			break;
		case "Horse":
			cs.setSpawnedType(EntityType.HORSE);
			break;
		case "Villager":
			cs.setSpawnedType(EntityType.VILLAGER);
			break;
		default:
			break;
		}
	}
}
