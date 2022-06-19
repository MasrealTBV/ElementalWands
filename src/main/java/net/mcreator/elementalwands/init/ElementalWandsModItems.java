
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementalwands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.elementalwands.item.WaterWandItem;
import net.mcreator.elementalwands.item.ForestWandItem;
import net.mcreator.elementalwands.item.FireWandItem;
import net.mcreator.elementalwands.ElementalWandsMod;

public class ElementalWandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElementalWandsMod.MODID);
	public static final RegistryObject<Item> FOREST_WAND = REGISTRY.register("forest_wand", () -> new ForestWandItem());
	public static final RegistryObject<Item> FIRE_WAND = REGISTRY.register("fire_wand", () -> new FireWandItem());
	public static final RegistryObject<Item> WATER_WAND = REGISTRY.register("water_wand", () -> new WaterWandItem());
}
