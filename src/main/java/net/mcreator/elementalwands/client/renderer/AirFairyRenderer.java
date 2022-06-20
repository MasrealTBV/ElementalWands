
package net.mcreator.elementalwands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementalwands.entity.AirFairyEntity;
import net.mcreator.elementalwands.client.model.Modelcustom_model;

public class AirFairyRenderer extends MobRenderer<AirFairyEntity, Modelcustom_model<AirFairyEntity>> {
	public AirFairyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AirFairyEntity, Modelcustom_model<AirFairyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elemental_wands:textures/fairyair.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AirFairyEntity entity) {
		return new ResourceLocation("elemental_wands:textures/fairyair.png");
	}
}
