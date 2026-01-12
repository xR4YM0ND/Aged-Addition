package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.agedaddition.block.CustomRedstoneOreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
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

    // Limestone Salt
    @WrapOperation(
        method = "lambda$static$0",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneSalt(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(0, 4);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Coal
    @WrapOperation(
        method = "lambda$static$1",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneCoal(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(0, 4);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Lapis
    @WrapOperation(
        method = "lambda$static$2",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneLapis(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(4, 9);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Gold
    @WrapOperation(
        method = "lambda$static$3",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneGold(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(5, 10);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Emerald
    @WrapOperation(
        method = "lambda$static$4",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneEmerald(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(6, 11);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Iron
    @WrapOperation(
        method = "lambda$static$5",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneIron(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(0, 5);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Copper
    @WrapOperation(
        method = "lambda$static$6",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneCopper(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(0, 4);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Diamond
    @WrapOperation(
        method = "lambda$static$7",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneDiamond(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(8, 13);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

    // Limestone Redstone
    @WrapOperation(
        method = "lambda$static$8",
        at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;"),
        remap = false
    )
    private static ExperienceDroppingBlock modifyLimestoneRedstone(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {

        IntProvider customExperience = UniformIntProvider.create(2, 7);

        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(14.0F, 100.0F);

        return original.call(customExperience, customSettings);
    }

}
