package net.agedaddition.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.agedaddition.block.ExperienceDroppingPillarBlock;
import net.agedaddition.block.RedstoneOrePillarBlock;
import net.hibiscus.naturespirit.registration.NSMiscBlocks;
import net.hibiscus.naturespirit.registration.sets.StoneSet;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;


@Mixin(NSMiscBlocks.class)
public class NaturesSpiritMixin {


    // Travertine StoneSet (9 Parameter Konstruktor)
    @WrapOperation(
        method = "<clinit>", 
        at = @At(value = "NEW", target = "Lnet/hibiscus/naturespirit/registration/sets/StoneSet;", ordinal = 0)
    )
    private static StoneSet modifyTravertineStrength(
            Identifier id, 
            MapColor color, 
            Item slab, 
            Item base, 
            float strength, 
            boolean hasSlab, 
            boolean hasStairs, 
            boolean hasWall, 
            boolean hasButton, 
            Operation<StoneSet> original) {
        
        // Hier ändern wir die Stärke von 1.5F auf z.B. 2.5F
        return original.call(id, color, slab, base, 25.0F, hasSlab, hasStairs, hasWall, hasButton);
    }

    // Chert StoneSet (10 Parameter Konstruktor)
    @WrapOperation(
        method = "<clinit>", 
        at = @At(value = "NEW", target = "Lnet/hibiscus/naturespirit/registration/sets/StoneSet;", ordinal = 1)
    )
    private static StoneSet modifyChertStrength(
            Identifier id, 
            MapColor color, 
            Item slab, 
            Item base, 
            float strength, 
            boolean hasSlab, 
            boolean hasStairs, 
            boolean hasWall, 
            boolean hasButton, 
            boolean hasPressurePlate, 
            Operation<StoneSet> original) {
        
        // Hier ändern wir die Stärke von.9F auf z.B. 2.0F
        return original.call(id, color, slab, base, 3.0F, hasSlab, hasStairs, hasWall, hasButton, hasPressurePlate);
    }

    // Chert Gold Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 0))
    private static ExperienceDroppingBlock initMixin0(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Iron Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 1))
    private static ExperienceDroppingBlock initMixin1(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Coal Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 2))
    private static ExperienceDroppingBlock initMixin2(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Lapis Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 3))
    private static ExperienceDroppingBlock initMixin3(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Diamond Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 4))
    private static ExperienceDroppingBlock initMixin4(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Emerald Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 5))
    private static ExperienceDroppingBlock initMixin5(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(1, 2),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Copper Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "(Lnet/minecraft/util/math/intprovider/IntProvider;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 6))
    private static ExperienceDroppingBlock initMixin6(IntProvider experienceDropped, AbstractBlock.Settings settings,
            Operation<ExperienceDroppingBlock> original) {
        return new ExperienceDroppingPillarBlock(
                UniformIntProvider.create(100, 200),
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                        .requiresTool().strength(5.0F, 30.0F));
    }

    // Chert Redstone Ore
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/RedstoneOreBlock;", ordinal = 0))
    private static RedstoneOreBlock initMixinRedstone(AbstractBlock.Settings settings, Operation<RedstoneOreBlock> original) {
        
        IntProvider customExperience = UniformIntProvider.create(100, 200);
        
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .requiresTool()
                .strength(5.0F, 30.0F);

        return new RedstoneOrePillarBlock(customExperience, customSettings);
    }
}
