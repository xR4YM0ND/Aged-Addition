package net.agedaddition.init;

import io.wispforest.lavender.book.LavenderBookItem;
import net.agedaddition.AgedAdditionMain;
import net.cupellation.CupellationMain;
import net.cupellation.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.stal.alloys.item.StalAlloysItems;

public class CompatInit {

    public static Block LIMESTONE_BRICK_SMELTER;
    public static Block LIMESTONE_BRICK_GLASS;
    public static Block LIMESTONE_BRICK_DRAIN;
    public static Block LIMESTONE_BRICK_FAUCET;
    public static Block LIMESTONE_BRICK_CASTING_BASIN;
    public static Block LIMESTONE_BRICK_CASTING_TABLE;
    public static Block LIMESTONE_BRICK_LEVER;

    public static Block WHITE_BRICK_SMELTER;
    public static Block WHITE_BRICK_GLASS;
    public static Block WHITE_BRICK_DRAIN;
    public static Block WHITE_BRICK_FAUCET;
    public static Block WHITE_BRICK_CASTING_BASIN;
    public static Block WHITE_BRICK_CASTING_TABLE;
    public static Block WHITE_BRICK_LEVER;

    private static Block register(String id, Block block) {
        return register(CupellationMain.identifierOf(id), block);
    }

    private static Block register(Identifier id, Block block) {
        Item item = Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemInit.AGEDADDITION_ITEM_GROUP).register(entries -> entries.add(item));

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void init() {
        // This class will ONLY be loaded if Lavender is installed
        if (FabricLoader.getInstance().isModLoaded("lavender")) {
            //LavenderBookItem.registerForBook(identifierOf("guide_book"), new Item.Settings());
            LavenderBookItem.registerForBook(AgedAdditionMain.identifierOf("guide_book"), new Item.Settings());
        }
        if (FabricLoader.getInstance().isModLoaded("stal-alloys")) {
            FuelRegistry.INSTANCE.add(StalAlloysItems.CARBON_PLATE, 24000);
        }
        if (FabricLoader.getInstance().isModLoaded("cupellation")) {
            LIMESTONE_BRICK_SMELTER = register("limestone_brick_smelter", new SmelterBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME)
                    .sounds(BlockSoundGroup.TUFF_BRICKS).requiresTool().strength(3.0f, 6.0f).luminance(Blocks.createLightLevelFromLitBlockState(13))));
            LIMESTONE_BRICK_GLASS = register("limestone_brick_glass", new TransparentBlock(
                    AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.6F).sounds(BlockSoundGroup.TUFF_BRICKS).nonOpaque().allowsSpawning(Blocks::never).requiresTool()
                            .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
            LIMESTONE_BRICK_DRAIN = register(
                    "limestone_brick_drain",
                    new SmelterDrain(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            LIMESTONE_BRICK_FAUCET = register(
                    "limestone_brick_faucet",
                    new SmelterFaucet(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS).nonOpaque()));
            LIMESTONE_BRICK_CASTING_BASIN = register(
                    "limestone_brick_casting_basin",
                    new CastingBasin(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            LIMESTONE_BRICK_CASTING_TABLE = register(
                    "limestone_brick_casting_table",
                    new CastingTable(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            LIMESTONE_BRICK_LEVER = register(
                    "limestone_brick_lever", new LeverBlock(AbstractBlock.Settings.create().noCollision().strength(1.0F).sounds(BlockSoundGroup.TUFF_BRICKS).pistonBehavior(PistonBehavior.DESTROY))
            );

            WHITE_BRICK_SMELTER = register("white_brick_smelter", new SmelterBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)
                    .sounds(BlockSoundGroup.TUFF_BRICKS).requiresTool().strength(3.0f, 6.0f).luminance(Blocks.createLightLevelFromLitBlockState(13))));
            WHITE_BRICK_GLASS = register("white_brick_glass", new TransparentBlock(
                    AbstractBlock.Settings.create().instrument(NoteBlockInstrument.HAT).strength(0.6F).sounds(BlockSoundGroup.TUFF_BRICKS).nonOpaque().allowsSpawning(Blocks::never).requiresTool()
                            .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
            WHITE_BRICK_DRAIN = register(
                    "white_brick_drain",
                    new SmelterDrain(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            WHITE_BRICK_FAUCET = register(
                    "white_brick_faucet",
                    new SmelterFaucet(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS).nonOpaque()));
            WHITE_BRICK_CASTING_BASIN = register(
                    "white_brick_casting_basin",
                    new CastingBasin(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            WHITE_BRICK_CASTING_TABLE = register(
                    "white_brick_casting_table",
                    new CastingTable(AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                            .strength(3.0F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
            WHITE_BRICK_LEVER = register(
                    "white_brick_lever", new LeverBlock(AbstractBlock.Settings.create().noCollision().strength(1.0F).sounds(BlockSoundGroup.TUFF_BRICKS).pistonBehavior(PistonBehavior.DESTROY))
            );
        }
    }

}
