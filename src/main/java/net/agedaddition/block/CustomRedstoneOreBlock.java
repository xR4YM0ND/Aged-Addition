package net.agedaddition.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.math.intprovider.IntProvider;

public class CustomRedstoneOreBlock extends RedstoneOreBlock {

    private final IntProvider experienceDropped;

    public CustomRedstoneOreBlock(AbstractBlock.Settings settings, IntProvider experienceDropped) {
        super(settings);
        this.experienceDropped = experienceDropped;
    }

    @Override
    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, this.experienceDropped);
        }
    }
}