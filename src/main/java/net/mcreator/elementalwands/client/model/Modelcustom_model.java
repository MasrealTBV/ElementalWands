package net.mcreator.elementalwands.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elemental_wands", "modelcustom_model"),
			"main");
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-1.0F)).texOffs(0, 0)
						.addBox(-2.5F, -7.0F, -3.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(20, 0)
						.addBox(-1.5F, -4.5F, -2.3F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(15, 5).addBox(-8.5F, -9.0F, 10.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -14.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(15, 5).addBox(-9.9218F, 0.4615F, 11.537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(9.9218F, -1.9615F, -13.537F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(15, 5).addBox(-9.4218F, -7.0385F, 11.537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(9.9218F, -1.9615F, -13.537F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -3.0F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5858F, -0.5858F, 2.4142F, -1.2217F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -3.0F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5858F, -0.5858F, 2.4142F, -1.2217F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
