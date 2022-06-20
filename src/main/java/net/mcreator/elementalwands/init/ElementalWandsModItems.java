
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementalwands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.elementalwands.item.WaterWandItem;
import net.mcreator.elementalwands.item.WaterShardItem;
import net.mcreator.elementalwands.item.ForestWandItem;
import net.mcreator.elementalwands.item.ForestShardItem;
import net.mcreator.elementalwands.item.FireWandItem;
import net.mcreator.elementalwands.item.FireShardItem;
import net.mcreator.elementalwands.item.AirWandItem;
import net.mcreator.elementalwands.item.AirShardItem;
import net.mcreator.elementalwands.ElementalWandsMod;

public class ElementalWandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElementalWandsMod.MODID);
	public static final RegistryObject<Item> FOREST_WAND = REGISTRY.register("forest_wand", () -> new ForestWandItem());
	public static final RegistryObject<Item> FIRE_WAND = REGISTRY.register("fire_wand", () -> new FireWandItem());
	public static final RegistryObject<Item> WATER_WAND = REGISTRY.register("water_wand", () -> new WaterWandItem());
	public static final RegistryObject<Item> AIR_WAND = REGISTRY.register("air_wand", () -> new AirWandItem());
	public static final RegistryObject<Item> FOREST_SHARD = REGISTRY.register("forest_shard", () -> new ForestShardItem());
	public static final RegistryObject<Item> FIRE_SHARD = REGISTRY.register("fire_shard", () -> new FireShardItem());
	public static final RegistryObject<Item> WATER_SHARD = REGISTRY.register("water_shard", () -> new WaterShardItem());
	public static final RegistryObject<Item> AIR_SHARD = REGISTRY.register("air_shard", () -> new AirShardItem());
	public static final RegistryObject<Item> FIRE_FAIRY = REGISTRY.register("fire_fairy_spawn_egg",
			() -> new ForgeSpawnEggItem(ElementalWandsModEntities.FIRE_FAIRY, -13312, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
