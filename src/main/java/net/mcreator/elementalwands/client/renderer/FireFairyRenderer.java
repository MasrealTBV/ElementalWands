
package net.mcreator.elementalwands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementalwands.entity.FireFairyEntity;
import net.mcreator.elementalwands.client.model.Modelcustom_model;

public class FireFairyRenderer extends MobRenderer<FireFairyEntity, Modelcustom_model<FireFairyEntity>> {
	public FireFairyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FireFairyEntity, Modelcustom_model<FireFairyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elemental_wands:textures/firefairy.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FireFairyEntity entity) {
		return new ResourceLocation("elemental_wands:textures/firefairy.png");
	}
}
