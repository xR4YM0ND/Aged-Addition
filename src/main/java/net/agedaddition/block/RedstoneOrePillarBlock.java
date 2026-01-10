package net.agedaddition.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class RedstoneOrePillarBlock extends RedstoneOreBlock {

    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;
    private final IntProvider experience;

    public RedstoneOrePillarBlock(IntProvider experience, AbstractBlock.Settings settings) {

        super(settings); 
        
        this.experience = experience;
        
    }
    
    @Override
    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, this.experience);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {

        super.appendProperties(builder); 

        builder.add(AXIS);
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return changeRotation(state, rotation);
    }

    public static BlockState changeRotation(BlockState state, BlockRotation rotation) {
        return switch (rotation) {
            case COUNTERCLOCKWISE_90, CLOCKWISE_90 -> switch (state.get(AXIS)) {
                case X -> state.with(AXIS, Direction.Axis.Z);
                case Z -> state.with(AXIS, Direction.Axis.X);
                default -> state;
            };
            default -> state;
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {

        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    public RedstoneOrePillarBlock(AbstractBlock.Settings settings) {
        this(UniformIntProvider.create(1, 5), settings);
    }
}