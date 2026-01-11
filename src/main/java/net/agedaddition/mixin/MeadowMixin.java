package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

import net.satisfy.meadow.core.registry.ObjectRegistry;

@Mixin(ObjectRegistry.class)
public class MeadowMixin {

    // Limestone
    @WrapOperation(
        method = "lambda$static$18",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;"),
        remap = false
    )
    private static Block modifyLimestone(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create()
               .mapColor(MapColor.STONE_GRAY)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresTool()
               .strength(10.0F, 100.0F));
    }
}
