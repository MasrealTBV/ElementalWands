
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementalwands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementalwands.entity.WaterWandEntity;
import net.mcreator.elementalwands.entity.ForestWandEntity;
import net.mcreator.elementalwands.entity.FireWandEntity;
import net.mcreator.elementalwands.ElementalWandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementalWandsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ElementalWandsMod.MODID);
	public static final RegistryObject<EntityType<ForestWandEntity>> FOREST_WAND = register("projectile_forest_wand",
			EntityType.Builder.<ForestWandEntity>of(ForestWandEntity::new, MobCategory.MISC).setCustomClientFactory(ForestWandEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireWandEntity>> FIRE_WAND = register("projectile_fire_wand",
			EntityType.Builder.<FireWandEntity>of(FireWandEntity::new, MobCategory.MISC).setCustomClientFactory(FireWandEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterWandEntity>> WATER_WAND = register("projectile_water_wand",
			EntityType.Builder.<WaterWandEntity>of(WaterWandEntity::new, MobCategory.MISC).setCustomClientFactory(WaterWandEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
