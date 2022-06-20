package net.mcreator.elementalwands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FireWandProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.FIRE.defaultBlockState().canSurvive(world, new BlockPos(x, y + 1, z))) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}
