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
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/satisfy/meadow/core/registry/ObjectRegistry;", ordinal = 41))
    private static Block modifyMarlstone(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // Laterit
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/satisfy/meadow/core/registry/ObjectRegistry;", ordinal = 18))
    private static Block modifyLaterit(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // Travertin
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/satisfy/meadow/core/registry/ObjectRegistry;", ordinal = 9))
    private static Block modifyTravertin(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }
}
