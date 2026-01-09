// package net.agedaddition.block;

// import net.minecraft.block.AbstractBlock;
// import net.minecraft.block.Block;
// import net.minecraft.block.BlockState;
// import net.minecraft.block.RedstoneOreBlock;
// import net.minecraft.item.ItemPlacementContext;
// import net.minecraft.item.ItemStack;
// import net.minecraft.server.world.ServerWorld;
// import net.minecraft.state.StateManager;
// import net.minecraft.state.property.EnumProperty;
// import net.minecraft.state.property.Properties;
// import net.minecraft.util.BlockRotation;
// import net.minecraft.util.math.BlockPos;
// import net.minecraft.util.math.Direction;
// import net.minecraft.util.math.intprovider.IntProvider;
// import net.minecraft.util.math.intprovider.UniformIntProvider;

// public class RedstoneOrePillarBlock extends RedstoneOreBlock {

//     public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;
//     private final IntProvider experience;

//     public RedstoneOrePillarBlock(IntProvider experience, AbstractBlock.Settings settings) {
//         super(settings);
//         this.experience = experience;
//         this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
//     }

//     @Override
//     protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
//         super.onStacksDropped(state, world, pos, tool, dropExperience);
//         if (dropExperience) {
//             this.dropExperienceWhenMined(world, pos, tool, this.experience);
//         }
//     }

//     public RedstoneOrePillarBlock(AbstractBlock.Settings settings) {
//         this(UniformIntProvider.create(1, 5), settings);
//     }
// }


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
        // 1. Call super constructor first. This implicitly calls appendProperties(builder)
        super(settings); 
        
        this.experience = experience;
        
        // 2. DO NOT call setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y)); here.
        // It will be handled below by the BlockState constructor (which you don't see)
        // or by overriding appendProperties correctly.
        
        // To fix the crash, we MUST override the default state set by the RedstoneOreBlock
        // constructor *after* our properties are known. Since we can't do this easily 
        // in the constructor, we rely on the `appendProperties` method to define the
        // properties, and `Block` handles setting the default state correctly from there.
        // The simple fix is to remove the explicit call to setDefaultState here.
    }
    
    // --- Experience Drop and Pillar Logic ---
    
    @Override
    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, this.experience);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        // Must call super to ensure RedstoneOreBlock.LIT is added first
        super.appendProperties(builder); 
        // Add your custom AXIS property
        builder.add(AXIS);
    }
    
    // The base Block constructor sets the default state *after* appendProperties is run.
    // The default state will be set to (LIT=false, AXIS=Y) automatically,
    // as Y is the default value for AXIS.
    
    // The rest of the pillar logic (rotate, getPlacementState) is fine.
    
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
        // Use the default state manager's default state, then add the AXIS property.
        // The initial state already has LIT=false from RedstoneOreBlock's default state.
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    // You can keep this helper constructor, though it's not strictly needed for the mixin
    public RedstoneOrePillarBlock(AbstractBlock.Settings settings) {
        this(UniformIntProvider.create(1, 5), settings);
    }
}