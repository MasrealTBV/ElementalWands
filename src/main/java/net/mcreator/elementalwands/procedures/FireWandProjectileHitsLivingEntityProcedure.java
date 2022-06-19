package net.mcreator.elementalwands.procedures;

import net.minecraft.world.entity.Entity;

public class FireWandProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
