package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.satisfy.hearth_and_timber.core.registry.ObjectRegistry;
import net.satisfy.hearth_and_timber.core.block.RubbleMasonryBlock; // Import needed for return type

@Mixin(ObjectRegistry.class)
public class HearthTimberMixin {

    // Groutless Rubblestone
    @WrapOperation(
        method = "lambda$static$85",
        at = @At(
            value = "NEW", 
            // Target the RubbleMasonryBlock constructor
            target = "Lnet/satisfy/hearth_and_timber/core/block/RubbleMasonryBlock;"
        ),
        remap = false // Target is non-vanilla code (Hearth and Timber registry)
    )
    private static RubbleMasonryBlock modifyGroutlessRubblestone_Constructor(
        // Arguments: Settings (AbstractBlock.Settings) + two Suppliers (Supplier<Block>)
        AbstractBlock.Settings settings,
        java.util.function.Supplier<Block> nextBlock,
        java.util.function.Supplier<Block> previousBlock,
        Operation<RubbleMasonryBlock> original
    ) {
        // 1. Modify the settings object directly
        AbstractBlock.Settings modifiedSettings = settings.strength(70.0F, 700.0F);
        
        // 2. Call the original constructor using the modified settings and the original suppliers
        return original.call(modifiedSettings, nextBlock, previousBlock);
    }
}