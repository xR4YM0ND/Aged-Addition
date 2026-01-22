package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.item.ProspectorPick;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_COPPER_NUGGET = register("raw_copper_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_GOLD_NUGGET = register("raw_gold_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_IRON_NUGGET = register("raw_iron_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NICKEL_NUGGET = register("nickel_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_NICKEL_NUGGET = register("raw_nickel_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item ZINC_NUGGET = register("zinc_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_ZINC_NUGGET = register("raw_zinc_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item TIN_NUGGET = register("tin_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_TIN_NUGGET = register("raw_tin_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static final Item COAL_PIECE = register("coal_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item LAPIS_LAZULI_PIECE = register("lapis_lazuli_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item EMERALD_PIECE = register("emerald_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item DIAMOND_PIECE = register("diamond_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHERITE_SCRAP_PIECE = register("netherite_scrap_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHER_STAR_PIECE = register("nether_star_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item QUARTZ_PIECE = register("quartz_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static final Item WOODEN_PROSPECTOR_PICK = register("wooden_prospector_pick", new ProspectorPick(3, new Item.Settings().maxDamage(59)), ItemGroups.INGREDIENTS);
    public static final Item STONE_PROSPECTOR_PICK = register("stone_prospector_pick", new ProspectorPick(4, new Item.Settings().maxDamage(131)), ItemGroups.INGREDIENTS);
    public static final Item COPPER_PROSPECTOR_PICK = register("copper_prospector_pick", new ProspectorPick(5, new Item.Settings().maxDamage(190)), ItemGroups.INGREDIENTS);
    public static final Item GOLDEN_PROSPECTOR_PICK = register("golden_prospector_pick", new ProspectorPick(6, new Item.Settings().maxDamage(32)), ItemGroups.INGREDIENTS);
    public static final Item IRON_PROSPECTOR_PICK = register("iron_prospector_pick", new ProspectorPick(7, new Item.Settings().maxDamage(250)), ItemGroups.INGREDIENTS);
    public static final Item STEEL_PROSPECTOR_PICK = register("steel_prospector_pick", new ProspectorPick(8, new Item.Settings().maxDamage(641)), ItemGroups.INGREDIENTS);
    public static final Item DIAMOND_PROSPECTOR_PICK = register("diamond_prospector_pick", new ProspectorPick(9, new Item.Settings().maxDamage(1561)), ItemGroups.INGREDIENTS);
    public static final Item NETHERITE_PROSPECTOR_PICK = register("netherite_prospector_pick", new ProspectorPick(10, new Item.Settings().maxDamage(2031)), ItemGroups.INGREDIENTS);

    public static void init() {
        FuelRegistry.INSTANCE.add(COAL_PIECE, 400);
    }

    private static Item register(String id, Item item, RegistryKey<ItemGroup> itemGroup) {
        return register(AgedAdditionMain.identifierOf(id), item, itemGroup);
    }

    private static Item register(Identifier id, Item item, RegistryKey<ItemGroup> itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, id, item);
    }

}
