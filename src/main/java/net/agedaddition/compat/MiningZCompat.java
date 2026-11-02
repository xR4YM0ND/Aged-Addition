package net.agedaddition.compat;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.miningz.init.ItemInit;
import net.miningz.item.ProspectorPick;

public class MiningZCompat {

    public static final Item STONE_PROSPECTOR_PICK = register(
            "stone_prospector_pick",
            new ProspectorPick(7, new Item.Settings().maxDamage(100))
    );

    public static final Item STEEL_PROSPECTOR_PICK = register(
            "steel_prospector_pick",
            new ProspectorPick(22, new Item.Settings().maxDamage(500))
    );

    public static final Item DAMASCUS_STEEL_PROSPECTOR_PICK = register(
            "damascus_steel_prospector_pick",
            new ProspectorPick(27, new Item.Settings().maxDamage(1300))
    );

    public static final Item GILDED_NETHERITE_PROSPECTOR_PICK = register(
            "gilded_netherite_prospector_pick",
            new ProspectorPick(35, new Item.Settings().maxDamage(2000))
    );

    private static Item register(String name, Item item) {
        Identifier id = Identifier.of("agedaddition", name);

        ItemGroupEvents.modifyEntriesEvent(ItemInit.MININGZ_ITEM_GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void init() {}
}