package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

import net.satisfy.bloomingnature.core.registry.ObjectRegistry;

@Mixin(ObjectRegistry.class)
public class BloomingNatureMixin {

    // Marlstone
    @WrapOperation(
        method = "lambda$static$464",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;"),
        remap = false
    )
    private static Block modifyMarlstone(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create()
               .mapColor(MapColor.STONE_GRAY)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresTool()
               .strength(60.0F, 6.0F));
    }

    // Laterit
    @WrapOperation(
        method = "lambda$static$198",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;"),
        remap = false
    )
    private static Block modifyLaterit(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create()
               .mapColor(MapColor.STONE_GRAY)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresTool()
               .strength(60.0F, 6.0F));
    }

    // Travertin
    @WrapOperation(
        method = "lambda$static$174",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;"),
        remap = false
    )
    private static Block modifyTravertin(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create()
               .mapColor(MapColor.STONE_GRAY)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresTool()
               .strength(60.0F, 6.0F));
    }
}
