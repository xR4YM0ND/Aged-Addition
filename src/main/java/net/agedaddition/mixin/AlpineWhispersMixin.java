package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

import net.satisfy.alpinewhispers.core.registry.ObjectRegistry;

@Mixin(ObjectRegistry.class)
public class AlpineWhispersMixin {

    // Alpine Gneiss
    // @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/satisfy/alpinewhispers/core/registry/ObjectRegistry;", ordinal = 1))
    // private static Block modifyAlpineGneiss(AbstractBlock.Settings settings, Operation<Block> original) {
    //     return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    // }

    // Alpine Gneiss
    @WrapOperation(
        method = "lambda$static$0", // Name der synthetischen Lambda-Methode im Bytecode
        at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;", ordinal = 0),
        remap = false // WICHTIG: Synthetische Namen sind nicht gemappt
    )
    private static Block modifyAlpineGneiss(AbstractBlock.Settings settings, Operation<Block> original) {
        // Wir erstellen eine komplett neue Instanz mit deinen Wunsch-Werten
        return new Block(AbstractBlock.Settings.create()
               .mapColor(MapColor.STONE_GRAY)
               .instrument(NoteBlockInstrument.BASEDRUM)
               .requiresTool()
               .strength(60.0F, 6.0F));
    }
}
