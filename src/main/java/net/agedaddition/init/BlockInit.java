package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock; // Import for blocks that drop XP
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior; // Import for setting piston behavior
import net.minecraft.block.AbstractBlock; // Used for Block.Settings
import net.minecraft.block.Blocks; // Useful for copying existing block properties
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider; // Import for setting XP drops

public class BlockInit {

    // COAL

    public static final Block ANDESITE_COAL_ORE = register("andesite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block CALCITE_COAL_ORE = register("calcite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block DIORITE_COAL_ORE = register("diorite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTINE_COAL_ORE = register("travertine_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block MARLSTONE_COAL_ORE = register("marlstone_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block ALPINE_GNEISS_COAL_ORE = register("alpine_gneiss_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block LATERIT_COAL_ORE = register("laterit_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GRANITE_COAL_ORE = register("granite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTIN_COAL_ORE = register("travertin_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TUFF_COAL_ORE = register("tuff_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // COPPER

    public static final Block ANDESITE_COPPER_ORE = register("andesite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block CALCITE_COPPER_ORE = register("calcite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block DIORITE_COPPER_ORE = register("diorite_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTIN_COPPER_ORE = register("travertin_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TUFF_COPPER_ORE = register("tuff_coal_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // IRON

    public static final Block TRAVERTINE_IRON_ORE = register("travertine_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block MARLSTONE_IRON_ORE = register("marlstone_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block ALPINE_GNEISS_IRON_ORE = register("alpine_gneiss_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block LATERIT_IRON_ORE = register("laterit_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GRANITE_IRON_ORE = register("granite_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTIN_IRON_ORE = register("travertin_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TUFF_IRON_ORE = register("tuff_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GROUTLESS_RUBBLESTONE_IRON_ORE = register("groutless_rubblestone_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block SMOOTH_BASALT_IRON_ORE = register("smooth_basalt_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block BLACKSTONE_IRON_ORE = register("blackstone_iron_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // GOLD

    public static final Block TUFF_GOLD_ORE = register("tuff_gold_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GROUTLESS_RUBBLESTONE_GOLD_ORE = register("groutless_rubblestone_gold_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block SMOOTH_BASALT_GOLD_ORE = register("smooth_basalt_gold_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block BLACKSTONE_GOLD_ORE = register("blackstone_gold_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // REDSTONE

    public static final Block LATERIT_REDSTONE_ORE = register("laterit_redstone_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GRANITE_REDSTONE_ORE = register("granite_redstone_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTIN_REDSTONE_ORE = register("travertin_redstone_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // EMERALD

    public static final Block ANDESITE_EMERALD_ORE = register("andesite_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block CALCITE_EMERALD_ORE = register("calcite_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block DIORITE_EMERALD_ORE = register("diorite_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTINE_EMERALD_ORE = register("travertine_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block MARLSTONE_EMERALD_ORE = register("marlstone_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block ALPINE_GNEISS_EMERALD_ORE = register("alpine_gneiss_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block LATERIT_EMERALD_ORE = register("laterit_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GRANITE_EMERALD_ORE = register("granite_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TRAVERTIN_EMERALD_ORE = register("travertin_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block TUFF_EMERALD_ORE = register("tuff_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GROUTLESS_RUBBLESTONE_EMERALD_ORE = register("groutless__rubblestone_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block SMOOTH_BASALT_EMERALD_ORE = register("smooth_basalt_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block BLACKSTONE_EMERALD_ORE = register("blackstone_emerald_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    // LAPIS

    public static final Block TRAVERTINE_LAPIS_ORE = register("travertine_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block MARLSTONE_LAPIS_ORE = register("marlstone_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block ALPINE_GNEISS_LAPIS_ORE = register("alpine_gneiss_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block GROUTLESS_RUBBLESTONE_LAPIS_ORE = register("groutless_rubblestone_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block SMOOTH_BASALT_LAPIS_ORE = register("smooth_basalt_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );

    public static final Block BLACKSTONE_LAPIS_ORE = register("blackstone_lapis_ore",
        new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)
        ),
        true,
        ItemGroups.NATURAL
    );





    // --- EXISTING REGISTER METHOD MODIFICATION ---

    public static Block register(String name, Block block, boolean itemVariant, net.minecraft.registry.RegistryKey<net.minecraft.item.ItemGroup> itemGroup) {
        Identifier blockIdentifier = AgedAdditionMain.identifierOf(name);
        if (itemVariant) {
            BlockItem blockitem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, blockIdentifier, blockitem);
            // Use the itemGroup parameter instead of hardcoding ItemGroups.NATURAL
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(blockitem));
        }

        return Registry.register(Registries.BLOCK, blockIdentifier, block);
    }
    
    // Original register method is now deprecated/unused, but keep it for compatibility if you need it later.
    // For new blocks, use the one with ItemGroup.
    @Deprecated
    public static Block register(String name, Block block, boolean itemVariant) {
        Identifier blockIdentifier = AgedAdditionMain.identifierOf(name);
        if (itemVariant) {
            BlockItem blockitem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, blockIdentifier, blockitem);
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(blockitem));
        }

        return Registry.register(Registries.BLOCK, blockIdentifier, block);
    }

    public static void init() {
        // You only need to call init() to ensure the static fields are loaded and registered.
        // The block registration happens when the static fields are initialized.
    }
}