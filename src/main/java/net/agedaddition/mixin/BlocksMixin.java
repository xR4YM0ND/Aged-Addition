package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.agedaddition.block.ExperienceDroppingPillarBlock;
import net.agedaddition.block.RedstoneOrePillarBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

@Mixin(Blocks.class)
public class BlocksMixin {

    // --- NEUE STRENGTH ANPASSUNGEN (FIKTIVE ORDINAL WERTE) ---

    // STONE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 0))
    private static Block modifyStone(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // GRANITE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 1))
    private static Block modifyGranite(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // ANDESITE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 5))
    private static Block modifyAndesite(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // CALCITE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 142))
    private static Block modifyCalcite(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(60.0F, 6.0F));
    }

    // DIORITE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 3))
    private static Block modifyDiorite(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // TUFF
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 137))
    private static Block modifyTuff(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.TUFF).requiresTool().strength(60.0F, 6.0F));
    }

    // SMOOTH_BASALT
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 163))
    private static Block modifySmoothBasalt(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.STONE).strength(60.0F, 6.0F));
    }

    // BLACKSTONE
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;", ordinal = 128))
    private static Block modifyBlackstone(AbstractBlock.Settings settings, Operation<Block> original) {
        return new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F));
    }

    // DEEPSLATE (Wichtig: Target ist PillarBlock)
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/PillarBlock;", ordinal = 25))
    private static PillarBlock modifyDeepslate(AbstractBlock.Settings settings, Operation<PillarBlock> original) {
        return new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(60.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    }

    // ORES

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