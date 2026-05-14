package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.item.ItemWithGlint;
import net.agedaddition.item.material.AgedAdditioArmorMaterials;
import net.agedaddition.item.material.AgedAdditionToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.cupellation.item.MoldItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import java.util.ArrayList;
import java.util.Set;
import net.minecraft.registry.RegistryKeys;

import java.util.List;

public class ItemInit {

    public static final RegistryKey<ItemGroup> AGEDADDITION_ITEM_GROUP =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, AgedAdditionMain.identifierOf("item_group"));

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

    public static final Item GOLDEN_UPGRADE_TEMPLATE = register("golden_upgrade_template",
            createSmithingTemplate("Golden", "Iron"), ItemGroups.INGREDIENTS);

	public static final Item CHROME_STEEL_UPGRADE_TEMPLATE = register("chrome_steel_upgrade_template",
            createSmithingTemplate("Chrome Steel", "Basic Steel"), ItemGroups.INGREDIENTS);
    public static final Item CHROME_STEEL_INGOT = register("chrome_steel_ingot", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
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

	public static final Item NICKEL_STEEL_UPGRADE_TEMPLATE = register("nickel_steel_upgrade_template",
            createSmithingTemplate("Nickel Steel", "Basic Steel"), ItemGroups.INGREDIENTS);
    public static final Item NICKEL_STEEL_INGOT = register("nickel_steel_ingot", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

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

    public static final Item BRONZE_UPGRADE_TEMPLATE = register("bronze_upgrade_template",
            createSmithingTemplate("Bronze", "Copper"), ItemGroups.INGREDIENTS);
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

	public static final Item BASIC_STEEL_UPGRADE_TEMPLATE = register("basic_steel_upgrade_template",
            createSmithingTemplate("Basic Steel", "Iron"), ItemGroups.INGREDIENTS);
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

	public static final Item STAINLESS_STEEL_UPGRADE_TEMPLATE = register("stainless_steel_upgrade_template",
            createSmithingTemplate("Stainless Steel", "High-Grade Steel"), ItemGroups.INGREDIENTS);
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


    // ==========================================
    // CUPELLATION MOLDS
    // ==========================================
    // explicitly defined so you can tweak MB values or blacklists individually

    public static final Item SHARD_MOLD = register("shard_mold",
            new MoldItem(null, 144, "shard", Set.of(), new Item.Settings()));

    public static final Item DAGGER_BLADE_MOLD = register("dagger_blade_mold",
            new MoldItem(null, 864, "dagger_blade", Set.of(), new Item.Settings()));

    public static final Item DIRK_BLADE_MOLD = register("dirk_blade_mold",
            new MoldItem(null, 1296, "dirk_blade", Set.of(), new Item.Settings()));

    public static final Item SHEET_MOLD = register("sheet_mold",
            new MoldItem(null, 432, "sheet", Set.of(), new Item.Settings()));

    public static final Item ROD_MOLD = register("rod_mold",
            new MoldItem(null, 288, "rod", Set.of(), new Item.Settings()));


    // ==========================================
    // MOLDABLE ITEMS (OUTPUTS)
    // ==========================================
    // Grouping them by metal makes it easy to read and precise to control.

    // --- COPPER ---
    public static final Item COPPER_SHEET = register("copper_sheet", new Item(new Item.Settings()));
    public static final Item COPPER_ROD = register("copper_rod", new Item(new Item.Settings()));
    public static final Item COPPER_AXE_HEAD = register("copper_axe_head", new Item(new Item.Settings()));
    public static final Item COPPER_PICKAXE_HEAD = register("copper_pickaxe_head", new Item(new Item.Settings()));
    public static final Item COPPER_SHOVEL_HEAD = register("copper_shovel_head", new Item(new Item.Settings()));
    public static final Item COPPER_HOE_HEAD = register("copper_hoe_head", new Item(new Item.Settings()));
    public static final Item COPPER_SWORD_BLADE = register("copper_sword_blade", new Item(new Item.Settings()));
    // --- BRONZE ---
    public static final Item BRONZE_SHEET = register("bronze_sheet", new Item(new Item.Settings()));
    public static final Item BRONZE_ROD = register("bronze_rod", new Item(new Item.Settings()));
    public static final Item BRONZE_DAGGER_BLADE = register("bronze_dagger_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_DIRK_BLADE = register("bronze_dirk_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_AXE_HEAD = register("bronze_axe_head", new Item(new Item.Settings()));
    public static final Item BRONZE_PICKAXE_HEAD = register("bronze_pickaxe_head", new Item(new Item.Settings()));
    public static final Item BRONZE_SHOVEL_HEAD = register("bronze_shovel_head", new Item(new Item.Settings()));
    public static final Item BRONZE_HOE_HEAD = register("bronze_hoe_head", new Item(new Item.Settings()));
    public static final Item BRONZE_SWORD_BLADE = register("bronze_sword_blade", new Item(new Item.Settings()));
    // --- GOLD / GOLDEN ---
    public static final Item GOLDEN_SHEET = register("golden_sheet", new Item(new Item.Settings()));
    public static final Item GOLDEN_ROD = register("golden_rod", new Item(new Item.Settings()));
    // --- ROSE GOLD ---
    public static final Item ROSE_GOLD_SHEET = register("rose_gold_sheet", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_ROD = register("rose_gold_rod", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_AXE_HEAD = register("rose_gold_axe_head", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_PICKAXE_HEAD = register("rose_gold_pickaxe_head", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_SHOVEL_HEAD = register("rose_gold_shovel_head", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_HOE_HEAD = register("rose_gold_hoe_head", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_SWORD_BLADE = register("rose_gold_sword_blade", new Item(new Item.Settings()));
    // --- AURIUM ---
    public static final Item AURIUM_ROD = register("aurium_rod", new Item(new Item.Settings()));
    public static final Item AURIUM_AXE_HEAD = register("aurium_axe_head", new Item(new Item.Settings()));
    public static final Item AURIUM_PICKAXE_HEAD = register("aurium_pickaxe_head", new Item(new Item.Settings()));
    public static final Item AURIUM_SHOVEL_HEAD = register("aurium_shovel_head", new Item(new Item.Settings()));
    public static final Item AURIUM_HOE_HEAD = register("aurium_hoe_head", new Item(new Item.Settings()));
    public static final Item AURIUM_SWORD_BLADE = register("aurium_sword_blade", new Item(new Item.Settings()));
    // --- IRON ---
    public static final Item IRON_ROD = register("iron_rod", new Item(new Item.Settings()));
    // --- BASIC STEEL ---
    public static final Item BASIC_STEEL_SHEET = register("basic_steel_sheet", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_ROD = register("basic_steel_rod", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_AXE_HEAD = register("basic_steel_axe_head", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_PICKAXE_HEAD = register("basic_steel_pickaxe_head", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_SHOVEL_HEAD = register("basic_steel_shovel_head", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_HOE_HEAD = register("basic_steel_hoe_head", new Item(new Item.Settings()));
    public static final Item BASIC_STEEL_SWORD_BLADE = register("basic_steel_sword_blade", new Item(new Item.Settings()));
    // --- NICKEL STEEL ---
    public static final Item NICKEL_STEEL_SHEET = register("nickel_steel_sheet", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_ROD = register("nickel_steel_rod", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_AXE_HEAD = register("nickel_steel_axe_head", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_PICKAXE_HEAD = register("nickel_steel_pickaxe_head", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_SHOVEL_HEAD = register("nickel_steel_shovel_head", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_HOE_HEAD = register("nickel_steel_hoe_head", new Item(new Item.Settings()));
    public static final Item NICKEL_STEEL_SWORD_BLADE = register("nickel_steel_sword_blade", new Item(new Item.Settings()));
    // --- CHROME STEEL ---
    public static final Item CHROME_STEEL_SHEET = register("chrome_steel_sheet", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_ROD = register("chrome_steel_rod", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_AXE_HEAD = register("chrome_steel_axe_head", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_PICKAXE_HEAD = register("chrome_steel_pickaxe_head", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_SHOVEL_HEAD = register("chrome_steel_shovel_head", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_HOE_HEAD = register("chrome_steel_hoe_head", new Item(new Item.Settings()));
    public static final Item CHROME_STEEL_SWORD_BLADE = register("chrome_steel_sword_blade", new Item(new Item.Settings()));
    // --- DIAMOND INFUSED ---
    public static final Item DIAMOND_INFUSED_ALLOY_SHEET = register("diamond_infused_alloy_sheet", new Item(new Item.Settings()));
    public static final Item DIAMOND_INFUSED_ALLOY_ROD = register("diamond_infused_alloy_rod", new Item(new Item.Settings()));
    // --- HIGH-GRADE STEEL ---
    public static final Item HIGH_GRADE_STEEL_SHEET = register("high-grade_steel_sheet", new Item(new Item.Settings()));
    public static final Item HIGH_GRADE_STEEL_ROD = register("high-grade_steel_rod", new Item(new Item.Settings()));
    // --- STAINLESS STEEL ---
    public static final Item STAINLESS_STEEL_SHEET = register("stainless_steel_sheet", new Item(new Item.Settings()));
    public static final Item STAINLESS_STEEL_ROD = register("stainless_steel_rod", new Item(new Item.Settings()));
    // --- NETHERITE STEEL
    public static final Item NETHERITE_STEEL_SHEET = register("netherite_steel_sheet", new Item(new Item.Settings()));
    public static final Item NETHERITE_STEEL_ROD = register("netherite_steel_rod", new Item(new Item.Settings()));

    // ==========================================
    // CUPELLATION COMPATIBILITY LISTS
    // ==========================================
    public static final List<Item> MOLDS = List.of(
            SHARD_MOLD, DAGGER_BLADE_MOLD, DIRK_BLADE_MOLD, SHEET_MOLD, ROD_MOLD
    );

    public static final List<Item> MOLDABLES = List.of(
            // Copper
            COPPER_SHEET, COPPER_ROD, COPPER_AXE_HEAD, COPPER_PICKAXE_HEAD, COPPER_SHOVEL_HEAD, COPPER_HOE_HEAD, COPPER_SWORD_BLADE,
            // Bronze
            BRONZE_SHEET, BRONZE_ROD, BRONZE_DAGGER_BLADE, BRONZE_DIRK_BLADE, BRONZE_AXE_HEAD, BRONZE_PICKAXE_HEAD, BRONZE_SHOVEL_HEAD, BRONZE_HOE_HEAD, BRONZE_SWORD_BLADE,
            // Gold
            GOLDEN_SHEET, GOLDEN_ROD,
            // Rose Gold
            ROSE_GOLD_SHEET, ROSE_GOLD_ROD, ROSE_GOLD_AXE_HEAD, ROSE_GOLD_PICKAXE_HEAD, ROSE_GOLD_SHOVEL_HEAD, ROSE_GOLD_HOE_HEAD, ROSE_GOLD_SWORD_BLADE,
            // Aurium
            AURIUM_ROD, AURIUM_AXE_HEAD, AURIUM_PICKAXE_HEAD, AURIUM_SHOVEL_HEAD, AURIUM_HOE_HEAD, AURIUM_SWORD_BLADE,
            // Iron
            IRON_ROD,
            // Basic Steel
            BASIC_STEEL_SHEET, BASIC_STEEL_ROD, BASIC_STEEL_AXE_HEAD, BASIC_STEEL_PICKAXE_HEAD, BASIC_STEEL_SHOVEL_HEAD, BASIC_STEEL_HOE_HEAD, BASIC_STEEL_SWORD_BLADE,
            // Nickel Steel
            NICKEL_STEEL_SHEET, NICKEL_STEEL_ROD, NICKEL_STEEL_AXE_HEAD, NICKEL_STEEL_PICKAXE_HEAD, NICKEL_STEEL_SHOVEL_HEAD, NICKEL_STEEL_HOE_HEAD, NICKEL_STEEL_SWORD_BLADE,
            // Chrome Steel
            CHROME_STEEL_SHEET, CHROME_STEEL_ROD, CHROME_STEEL_AXE_HEAD, CHROME_STEEL_PICKAXE_HEAD, CHROME_STEEL_SHOVEL_HEAD, CHROME_STEEL_HOE_HEAD, CHROME_STEEL_SWORD_BLADE,
            // Diamond Infused
            DIAMOND_INFUSED_ALLOY_SHEET, DIAMOND_INFUSED_ALLOY_ROD,
            // High-Grade Steel
            HIGH_GRADE_STEEL_SHEET, HIGH_GRADE_STEEL_ROD,
            // Stainless Steel
            STAINLESS_STEEL_SHEET, STAINLESS_STEEL_ROD,
            // Netherite Steel
            NETHERITE_STEEL_SHEET, NETHERITE_STEEL_ROD
    );

    public static void init() {
        FuelRegistry.INSTANCE.add(COPPER_NUGGET, 400);
        registerItemGroup();
    }

    private static void registerItemGroup() {
        Registry.register(
                Registries.ITEM_GROUP,
                AGEDADDITION_ITEM_GROUP,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(COAL_PIECE)) // Or use: new ItemStack(Items.COPPER_INGOT))
                        .displayName(Text.translatable("itemgroup.agedaddition.item_group"))
                        .build()
        );
    }

    // Registration methods
    //private static Item register(String id, Item item) {
      //  return register(AgedAdditionMain.identifierOf(id), item);
    //}

    //private static Item register(Identifier id, Item item) {
    //    ItemGroupEvents.modifyEntriesEvent(AGEDADDITION_ITEM_GROUP).register(entries -> entries.add(item));
    //    return Registry.register(Registries.ITEM, id, item);
    //}

    //private static Item register(String id, Item item, RegistryKey<ItemGroup> itemGroup) {
    //    return register(AgedAdditionMain.identifierOf(id), item, itemGroup);
    //}

    //private static Item register(Identifier id, Item item, RegistryKey<ItemGroup> itemGroup) {
    //    ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
    //    return Registry.register(Registries.ITEM, id, item);
    //}



    // Helper for items that should ONLY be in your custom tab
    private static Item register(String id, Item item) {
        return register(id, item, AGEDADDITION_ITEM_GROUP);
    }

    // Helper for items that go into a Vanilla group AND your custom group
    private static Item register(String id, Item item, RegistryKey<ItemGroup> vanillaGroup) {
        Identifier identifier = AgedAdditionMain.identifierOf(id);

        // 1. Always add to your Custom Mod Tab
        ItemGroupEvents.modifyEntriesEvent(AGEDADDITION_ITEM_GROUP).register(entries -> entries.add(item));

        // 2. If the provided group isn't your custom one (e.g., it's COMBAT), add it there too
        if (vanillaGroup != AGEDADDITION_ITEM_GROUP) {
            ItemGroupEvents.modifyEntriesEvent(vanillaGroup).register(entries -> entries.add(item));
        }

        return Registry.register(Registries.ITEM, identifier, item);
    }
}
