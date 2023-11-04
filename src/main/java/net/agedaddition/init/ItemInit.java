package net.agedaddition.init;

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

    public static final Item COAL_PIECE = register("coal_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item LAPIS_LAZULI_PIECE = register("lapis_lazuli_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item EMERALD_PIECE = register("emerald_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item DIAMOND_PIECE = register("diamond_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHERITE_SCRAP_PIECE = register("netherite_scrap_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHER_STAR_PIECE = register("nether_star_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static void init() {
        FuelRegistry.INSTANCE.add(COAL_PIECE, 400);
    }

    private static Item register(String id, Item item, RegistryKey<ItemGroup> itemGroup) {
        return register(new Identifier("agedaddition", id), item, itemGroup);
    }

    private static Item register(Identifier id, Item item, RegistryKey<ItemGroup> itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, id, item);
    }

}
