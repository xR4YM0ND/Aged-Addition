package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.agedaddition.block.ExperienceDroppingPillarBlock;
import net.agedaddition.block.RedstoneOrePillarBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

@Mixin(Blocks.class)
public class BlocksMixin {

    // Deepslate Gold Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 1))
    private static ExperienceDroppingBlock initMixin1(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Iron Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 3))
    private static ExperienceDroppingBlock initMixin3(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Coal Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 5))
    private static ExperienceDroppingBlock initMixin5(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Lapis Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 8))
    private static ExperienceDroppingBlock initMixin8(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Diamond Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 10))
    private static ExperienceDroppingBlock initMixin10(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Emerald Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 12))
    private static ExperienceDroppingBlock initMixin12(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Copper Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 15))
    private static ExperienceDroppingBlock initMixin15(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(3.0F, 3.0F));
    }

    // Deepslate Redstone Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/RedstoneOreBlock;", ordinal = 1))
    private static RedstoneOreBlock initMixinRedstone(AbstractBlock.Settings settings, Operation<RedstoneOreBlock> original) {
        
        IntProvider customExperience = UniformIntProvider.create(3, 7);
        
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .requiresTool()
                .strength(6.0F, 4.0F)
                .sounds(BlockSoundGroup.DEEPSLATE);

        return new RedstoneOrePillarBlock(customExperience, customSettings);
    }

}