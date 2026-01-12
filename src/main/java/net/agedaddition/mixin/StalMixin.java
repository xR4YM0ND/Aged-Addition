package net.agedaddition.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.agedaddition.block.ExperienceDroppingPillarBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import net.stal.alloys.block.StalAlloysBlocks;

@Mixin(StalAlloysBlocks.class)
public class StalMixin {

    // Deepslate Nickel
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 1, remap = false))
    private static ExperienceDroppingBlock modifyDeepslateNickel(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(8, 13);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.DEEPSLATE)
                .requiresTool()
                .strength(92.0F, 800.0F);
        return new ExperienceDroppingPillarBlock(customExperience, customSettings);
    }

    // Deepslate Chromium
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 4, remap = false))
    private static ExperienceDroppingBlock modifyDeepslateChromium(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(13, 18);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.DEEPSLATE)
                .requiresTool()
                .strength(92.0F, 800.0F);
        return new ExperienceDroppingPillarBlock(customExperience, customSettings);
    }

    // Deepslate Carbon
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 7, remap = false))
    private static ExperienceDroppingBlock modifyDeepslateCarbon(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(9, 14);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.DEEPSLATE)
                .requiresTool()
                .strength(92.0F, 800.0F);
        return new ExperienceDroppingPillarBlock(customExperience, customSettings);
    }

    // Deepslate Zinc
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 9, remap = false))
    private static ExperienceDroppingBlock modifyDeepslateZinc(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(7, 12);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.DEEPSLATE)
                .requiresTool()
                .strength(92.0F, 800.0F);
        return new ExperienceDroppingPillarBlock(customExperience, customSettings);
    }

    // Deepslate Tin
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 11, remap = false))
    private static ExperienceDroppingBlock modifyDeepslateTin(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(6, 11);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.DEEPSLATE)
                .requiresTool()
                .strength(92.0F, 800.0F);
        return new ExperienceDroppingPillarBlock(customExperience, customSettings);
    }

    // Nickel
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 0, remap = false))
    private static ExperienceDroppingBlock modifyNickel(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(0, 4);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(8.0F, 50.0F);
        return new ExperienceDroppingBlock(customExperience, customSettings);
    }

    // Chromium
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 3, remap = false))
    private static ExperienceDroppingBlock modifyChromium(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(4, 9);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(8.0F, 50.0F);
        return new ExperienceDroppingBlock(customExperience, customSettings);
    }

    // Carbon
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 6, remap = false))
    private static ExperienceDroppingBlock modifyCarbon(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(0, 5);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(8.0F, 50.0F);
        return new ExperienceDroppingBlock(customExperience, customSettings);
    }

    // Zinc
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 8, remap = false))
    private static ExperienceDroppingBlock modifyZinc(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(0, 3);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(8.0F, 50.0F);
        return new ExperienceDroppingBlock(customExperience, customSettings);
    }

    // Tin
    @WrapOperation(method = "<clinit>", at = @At(value = "NEW", target = "Lnet/minecraft/block/ExperienceDroppingBlock;", ordinal = 10, remap = false))
    private static ExperienceDroppingBlock modifyTin(IntProvider experienceDropped, AbstractBlock.Settings settings, Operation<ExperienceDroppingBlock> original) {
        IntProvider customExperience = UniformIntProvider.create(0, 2);
        AbstractBlock.Settings customSettings = AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .requiresTool()
                .strength(8.0F, 50.0F);
        return new ExperienceDroppingBlock(customExperience, customSettings);
    }

}