package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.item.material.AgedAdditioArmorMaterials;
import net.agedaddition.item.material.AgedAdditionToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
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

    public static final Item CHROME_STEEL_SWORD = register("chrome_steel_sword",
            new SwordItem(AgedAdditionToolMaterials.CHROME_STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgedAdditionToolMaterials.CHROME_STEEL, 3, -2.4f))),ItemGroups.COMBAT);
    public static final Item CHROME_STEEL_SHOVEL = register("chrome_steel_shovel",
            new ShovelItem(AgedAdditionToolMaterials.CHROME_STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgedAdditionToolMaterials.CHROME_STEEL, 1.5f, -3.0f))),ItemGroups.TOOLS);
    public static final Item CHROME_STEEL_PICKAXE = register("chrome_steel_pickaxe",
            new PickaxeItem(AgedAdditionToolMaterials.CHROME_STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgedAdditionToolMaterials.CHROME_STEEL, 1.0f, -2.8f))),ItemGroups.TOOLS);
    public static final Item CHROME_STEEL_AXE = register("chrome_steel_axe",
            new AxeItem(AgedAdditionToolMaterials.CHROME_STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AgedAdditionToolMaterials.CHROME_STEEL, 6.0f, -3.1f))),ItemGroups.TOOLS);
    public static final Item CHROME_STEEL_HOE = register("chrome_steel_hoe",
            new HoeItem(AgedAdditionToolMaterials.CHROME_STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgedAdditionToolMaterials.CHROME_STEEL, -2.0f, -1.0f))),ItemGroups.TOOLS);
//    public static final Item CHROME_STEEL_HORSE_ARMOR = register("chrome_steel_horse_armor",
//            new AnimalArmorItem(AgedAdditioArmorMaterials.CHROME_STEEL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)),ItemGroups.TOOLS);

    public static final Item CHROME_STEEL_HELMET = register("chrome_steel_helmet",
            new ArmorItem(AgedAdditioArmorMaterials.CHROME_STEEL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item CHROME_STEEL_CHESTPLATE = register("chrome_steel_chestplate",
            new ArmorItem(AgedAdditioArmorMaterials.CHROME_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item CHROME_STEEL_LEGGINGS = register("chrome_steel_leggings",
            new ArmorItem(AgedAdditioArmorMaterials.CHROME_STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item CHROME_STEEL_BOOTS = register("chrome_steel_boots",
            new ArmorItem(AgedAdditioArmorMaterials.CHROME_STEEL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))),ItemGroups.COMBAT);

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
