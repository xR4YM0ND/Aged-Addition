// package net.agedaddition.block;

// import net.minecraft.block.AbstractBlock;
// import net.minecraft.block.BlockState;
// import net.minecraft.block.RedstoneOreBlock;
// import net.minecraft.item.ItemStack;
// import net.minecraft.server.world.ServerWorld;
// import net.minecraft.util.math.BlockPos;
// import net.minecraft.util.math.intprovider.IntProvider;

// public class CustomRedstoneOreBlock extends RedstoneOreBlock {

//     private final IntProvider experienceDropped;

//     public CustomRedstoneOreBlock(IntProvider experienceDropped, AbstractBlock.Settings settings) {
//         super(settings);
//         this.experienceDropped = experienceDropped;
//     }

//     @Override
//     protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
//         super.onStacksDropped(state, world, pos, tool, dropExperience);
//         if (dropExperience) {
//             this.dropExperienceWhenMined(world, pos, tool, this.experienceDropped);
//         }
//     }
// }
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

// Wir erweitern RedstoneOreBlock, um die gesamte Leucht- und Klick-Logik zu erben.
public class CustomRedstoneOreBlock extends RedstoneOreBlock {

    private final IntProvider experienceDropped;

    // Wir müssen einen MapCodec-Konstruktor bereitstellen, auch wenn wir ihn hier nicht verwenden
    public CustomRedstoneOreBlock(AbstractBlock.Settings settings, IntProvider experienceDropped) {
        super(settings); // Ruft den RedstoneOreBlock-Konstruktor auf
        this.experienceDropped = experienceDropped;
    }

    // Überschreiben Sie die Methode zum Ablegen der Erfahrungspunkte
    @Override
    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            // Die Methode dropExperienceWhenMined ist in Block definiert und kann hier verwendet werden
            this.dropExperienceWhenMined(world, pos, tool, this.experienceDropped);
        }
    }
}