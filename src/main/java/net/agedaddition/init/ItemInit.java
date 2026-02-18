package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.item.ItemWithGlint;
import net.agedaddition.item.material.AgedAdditioArmorMaterials;
import net.agedaddition.item.material.AgedAdditionToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

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
    public static final Item NETHER_STAR_PIECE = register("nether_star_piece", new ItemWithGlint(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item QUARTZ_PIECE = register("quartz_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static final Item COPPER_SHEET = register("copper_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static final Item CHROME_STEEL_INGOT = register("chrome_steel_ingot", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item CHROME_STEEL_SHEET = register("chrome_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
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

    public static final Item NICKEL_STEEL_INGOT = register("nickel_steel_ingot", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NICKEL_STEEL_SHEET = register("nickel_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NICKEL_STEEL_SWORD = register("nickel_steel_sword",
            new SwordItem(AgedAdditionToolMaterials.NICKEL_STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgedAdditionToolMaterials.NICKEL_STEEL, 3, -2.4f))),ItemGroups.COMBAT);
    public static final Item NICKEL_STEEL_SHOVEL = register("nickel_steel_shovel",
            new ShovelItem(AgedAdditionToolMaterials.NICKEL_STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgedAdditionToolMaterials.NICKEL_STEEL, 1.5f, -3.0f))),ItemGroups.TOOLS);
    public static final Item NICKEL_STEEL_PICKAXE = register("nickel_steel_pickaxe",
            new PickaxeItem(AgedAdditionToolMaterials.NICKEL_STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgedAdditionToolMaterials.NICKEL_STEEL, 1.0f, -2.8f))),ItemGroups.TOOLS);
    public static final Item NICKEL_STEEL_AXE = register("nickel_steel_axe",
            new AxeItem(AgedAdditionToolMaterials.NICKEL_STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AgedAdditionToolMaterials.NICKEL_STEEL, 6.0f, -3.1f))),ItemGroups.TOOLS);
    public static final Item NICKEL_STEEL_HOE = register("nickel_steel_hoe",
            new HoeItem(AgedAdditionToolMaterials.NICKEL_STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgedAdditionToolMaterials.NICKEL_STEEL, -2.0f, -1.0f))),ItemGroups.TOOLS);
    public static final Item NICKEL_STEEL_HELMET = register("nickel_steel_helmet",
            new ArmorItem(AgedAdditioArmorMaterials.NICKEL_STEEL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item NICKEL_STEEL_CHESTPLATE = register("nickel_steel_chestplate",
            new ArmorItem(AgedAdditioArmorMaterials.NICKEL_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item NICKEL_STEEL_LEGGINGS = register("nickel_steel_leggings",
            new ArmorItem(AgedAdditioArmorMaterials.NICKEL_STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item NICKEL_STEEL_BOOTS = register("nickel_steel_boots",
            new ArmorItem(AgedAdditioArmorMaterials.NICKEL_STEEL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))),ItemGroups.COMBAT);

    public static final Item BRONZE_SHEET = register("bronze_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item BRONZE_ROD = register("bronze_rod", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item BRONZE_SHOVEL = register("bronze_shovel",
            new ShovelItem(AgedAdditionToolMaterials.BRONZE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgedAdditionToolMaterials.BRONZE, 1.5f, -3.0f))),ItemGroups.TOOLS);
    public static final Item BRONZE_PICKAXE = register("bronze_pickaxe",
            new PickaxeItem(AgedAdditionToolMaterials.BRONZE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgedAdditionToolMaterials.BRONZE, 1.0f, -2.8f))),ItemGroups.TOOLS);
    public static final Item BRONZE_HOE = register("bronze_hoe",
            new HoeItem(AgedAdditionToolMaterials.BRONZE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgedAdditionToolMaterials.BRONZE, -2.0f, -1.0f))),ItemGroups.TOOLS);
    public static final Item BRONZE_HELMET = register("bronze_helmet",
            new ArmorItem(AgedAdditioArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BRONZE_CHESTPLATE = register("bronze_chestplate",
            new ArmorItem(AgedAdditioArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BRONZE_LEGGINGS = register("bronze_leggings",
            new ArmorItem(AgedAdditioArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BRONZE_BOOTS = register("bronze_boots",
            new ArmorItem(AgedAdditioArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))),ItemGroups.COMBAT);

    public static final Item BASIC_STEEL_SHEET = register("basic_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item BASIC_STEEL_ROD = register("basic_steel_rod", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item BASIC_STEEL_SWORD = register("basic_steel_sword",
            new SwordItem(AgedAdditionToolMaterials.BASIC_STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgedAdditionToolMaterials.BASIC_STEEL, 3, -2.4f))),ItemGroups.COMBAT);
    public static final Item BASIC_STEEL_HELMET = register("basic_steel_helmet",
            new ArmorItem(AgedAdditioArmorMaterials.BASIC_STEEL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BASIC_STEEL_CHESTPLATE = register("basic_steel_chestplate",
            new ArmorItem(AgedAdditioArmorMaterials.BASIC_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BASIC_STEEL_LEGGINGS = register("basic_steel_leggings",
            new ArmorItem(AgedAdditioArmorMaterials.BASIC_STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))),ItemGroups.COMBAT);
    public static final Item BASIC_STEEL_BOOTS = register("basic_steel_boots",
            new ArmorItem(AgedAdditioArmorMaterials.BASIC_STEEL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))),ItemGroups.COMBAT);

    public static final Item STAINLESS_STEEL_SHEET = register("stainless_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item STAINLESS_STEEL_ROD = register("stainless_steel_rod", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item STAINLESS_STEEL_SWORD = register("stainless_steel_sword",
            new SwordItem(AgedAdditionToolMaterials.STAINLESS_STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgedAdditionToolMaterials.STAINLESS_STEEL, 3, -2.4f))),ItemGroups.COMBAT);
    public static final Item STAINLESS_STEEL_SHOVEL = register("stainless_steel_shovel",
            new ShovelItem(AgedAdditionToolMaterials.STAINLESS_STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgedAdditionToolMaterials.STAINLESS_STEEL, 1.5f, -3.0f))),ItemGroups.TOOLS);
    public static final Item STAINLESS_STEEL_PICKAXE = register("stainless_steel_pickaxe",
            new PickaxeItem(AgedAdditionToolMaterials.STAINLESS_STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgedAdditionToolMaterials.STAINLESS_STEEL, 1.0f, -2.8f))),ItemGroups.TOOLS);
    public static final Item STAINLESS_STEEL_AXE = register("stainless_steel_axe",
            new AxeItem(AgedAdditionToolMaterials.STAINLESS_STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AgedAdditionToolMaterials.STAINLESS_STEEL, 6.0f, -3.1f))),ItemGroups.TOOLS);
    public static final Item STAINLESS_STEEL_HOE = register("stainless_steel_hoe",
            new HoeItem(AgedAdditionToolMaterials.STAINLESS_STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgedAdditionToolMaterials.STAINLESS_STEEL, -2.0f, -1.0f))),ItemGroups.TOOLS);

    public static final Item DIAMOND_INFUSED_ALLOY_SHEET = register("diamond_infused_alloy_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item HIGH_GRADE_STEEL_SHEET = register("high-grade_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHERITE_STEEL_SHEET = register("netherite_steel_sheet", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static final Item GOLDEN_UPGRADE_TEMPLATE = register("golden_upgrade_template",
            createSmithingTemplate("Gold", "Gold"), ItemGroups.INGREDIENTS);
    public static final Item BRONZE_UPGRADE_TEMPLATE = register("bronze_upgrade_template",
            createSmithingTemplate("Bronze", "Copper"), ItemGroups.INGREDIENTS);
    public static final Item BASIC_STEEL_UPGRADE_TEMPLATE = register("basic_steel_upgrade_template",
            createSmithingTemplate("Basic Steel", "Iron"), ItemGroups.INGREDIENTS);
    public static final Item NICKEL_STEEL_UPGRADE_TEMPLATE = register("nickel_steel_upgrade_template",
            createSmithingTemplate("Nickel Steel", "Basic Steel"), ItemGroups.INGREDIENTS);
    public static final Item CHROME_STEEL_UPGRADE_TEMPLATE = register("chrome_steel_upgrade_template",
            createSmithingTemplate("Chrome Steel", "Basic Steel"), ItemGroups.INGREDIENTS);
    public static final Item STAINLESS_STEEL_UPGRADE_TEMPLATE = register("stainless_steel_upgrade_template",
            createSmithingTemplate("Stainless Steel", "High-Grade Steel"), ItemGroups.INGREDIENTS);
    private static SmithingTemplateItem createSmithingTemplate(String materialName, String baseMaterialName) {
        List<Identifier> emptyBaseSlotTextures = List.of(
                Identifier.ofVanilla("item/empty_armor_slot_helmet"),
                Identifier.ofVanilla("item/empty_slot_sword"),
                Identifier.ofVanilla("item/empty_armor_slot_chestplate"),
                Identifier.ofVanilla("item/empty_slot_pickaxe"),
                Identifier.ofVanilla("item/empty_armor_slot_leggings"),
                Identifier.ofVanilla("item/empty_slot_axe"),
                Identifier.ofVanilla("item/empty_armor_slot_boots"),
                Identifier.ofVanilla("item/empty_slot_hoe"),
                Identifier.ofVanilla("item/empty_slot_shovel")
        );
        List<Identifier> emptyAdditionsSlotTextures = List.of(
                Identifier.ofVanilla("item/empty_slot_ingot")
        );
        return new SmithingTemplateItem(
                Text.translatable("item.agedaddition." + materialName.toLowerCase().replace(" ", "_") + "_upgrade_template.applies_to").formatted(Formatting.BLUE), // Title for "Applies to"
                //Text.translatable("item.agedaddition.smithing_template.ingredients").formatted(Formatting.BLUE), // Title for "Ingredients"
                Text.translatable("item.agedaddition." + materialName.toLowerCase().replace(" ", "_") + "_upgrade_template.ingredients").formatted(Formatting.BLUE), // Title for material "Ingredients"
                Text.translatable("upgrade.agedaddition." + materialName.toLowerCase().replace(" ", "_") + "_upgrade").formatted(Formatting.GRAY), // The Template Title
                Text.translatable("item.agedaddition.smithing_template.base_slot_description"), // Tooltip for Left Slot
                Text.translatable("item.agedaddition.smithing_template.additions_slot_description"), // Tooltip for Right Slot
                emptyBaseSlotTextures,
                emptyAdditionsSlotTextures
        );
    }



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
