package net.mcreator.elementalwands.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class WaterWandProjectileHitsPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 1));
	}
}
