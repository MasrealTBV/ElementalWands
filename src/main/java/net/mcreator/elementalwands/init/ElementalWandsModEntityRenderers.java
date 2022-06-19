
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementalwands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.elementalwands.client.renderer.WaterWandRenderer;
import net.mcreator.elementalwands.client.renderer.ForestWandRenderer;
import net.mcreator.elementalwands.client.renderer.FireWandRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementalWandsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ElementalWandsModEntities.FOREST_WAND.get(), ForestWandRenderer::new);
		event.registerEntityRenderer(ElementalWandsModEntities.FIRE_WAND.get(), FireWandRenderer::new);
		event.registerEntityRenderer(ElementalWandsModEntities.WATER_WAND.get(), WaterWandRenderer::new);
	}
}
