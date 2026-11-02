package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.compat.MiningZCompat;
import net.agedaddition.item.ItemWithGlint;
import net.agedaddition.item.material.AgedAdditioArmorMaterials;
import net.agedaddition.item.material.AgedAdditionToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class ItemInit {

    public static final RegistryKey<ItemGroup> AGEDADDITION_ITEM_GROUP =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, AgedAdditionMain.identifierOf("item_group"));

    // --- NUGGETS ---
    public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_COPPER_NUGGET = register("raw_copper_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_GOLD_NUGGET = register("raw_gold_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_IRON_NUGGET = register("raw_iron_nugget", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    // --- PIECES ---
    public static final Item COAL_PIECE = register("coal_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item LAPIS_LAZULI_PIECE = register("lapis_lazuli_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item EMERALD_PIECE = register("emerald_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item DIAMOND_PIECE = register("diamond_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHERITE_SCRAP_PIECE = register("netherite_scrap_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item NETHER_STAR_PIECE = register("nether_star_piece", new ItemWithGlint(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item QUARTZ_PIECE = register("quartz_piece", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    // --- SPECIAL ---
    public static final Item COAL_COKE = register("coal_coke", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    // --- STONE ---
    public static final Item STONE_PROSPECTOR_HEAD = register("stone_prospector_head", new Item(new Item.Settings()));
    public static final Item STONE_HOOK_HEAD = register("stone_hook_head", new Item(new Item.Settings()));
    // --- COPPER ---
    public static final Item COPPER_PROSPECTOR_HEAD = register("copper_prospector_head", new Item(new Item.Settings()));
    public static final Item COPPER_AXE_HEAD = register("copper_axe_head", new Item(new Item.Settings()));
    public static final Item COPPER_PICKAXE_HEAD = register("copper_pickaxe_head", new Item(new Item.Settings()));
    public static final Item COPPER_SHOVEL_HEAD = register("copper_shovel_head", new Item(new Item.Settings()));
    public static final Item COPPER_HOE_HEAD = register("copper_hoe_head", new Item(new Item.Settings()));
    public static final Item COPPER_SWORD_BLADE = register("copper_sword_blade", new Item(new Item.Settings()));
    public static final Item COPPER_SWORD = register("copper_sword",
            new SwordItem(AgedAdditionToolMaterials.COPPER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgedAdditionToolMaterials.COPPER, 2, -2.4f))), ItemGroups.COMBAT);
    public static final Item COPPER_SHOVEL = register("copper_shovel",
            new ShovelItem(AgedAdditionToolMaterials.COPPER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgedAdditionToolMaterials.COPPER, 1.0f, -3.0f))), ItemGroups.TOOLS);
    public static final Item COPPER_PICKAXE = register("copper_pickaxe",
            new PickaxeItem(AgedAdditionToolMaterials.COPPER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgedAdditionToolMaterials.COPPER, 1.0f, -2.8f))), ItemGroups.TOOLS);
    public static final Item COPPER_AXE = register("copper_axe",
            new AxeItem(AgedAdditionToolMaterials.COPPER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AgedAdditionToolMaterials.COPPER, 5.0f, -3.1f))), ItemGroups.TOOLS);
    public static final Item COPPER_HOE = register("copper_hoe",
            new HoeItem(AgedAdditionToolMaterials.COPPER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgedAdditionToolMaterials.COPPER, -2.0f, -1.0f))), ItemGroups.TOOLS);
    public static final Item COPPER_HORSE_ARMOR = register("copper_horse_armor",
            new AnimalArmorItem(AgedAdditioArmorMaterials.COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)),ItemGroups.TOOLS);
    public static final Item COPPER_HELMET = register("copper_helmet",
            new ArmorItem(AgedAdditioArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(12))), ItemGroups.COMBAT);
    public static final Item COPPER_CHESTPLATE = register("copper_chestplate",
            new ArmorItem(AgedAdditioArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(12))), ItemGroups.COMBAT);
    public static final Item COPPER_LEGGINGS = register("copper_leggings",
            new ArmorItem(AgedAdditioArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(12))), ItemGroups.COMBAT);
    public static final Item COPPER_BOOTS = register("copper_boots",
            new ArmorItem(AgedAdditioArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(12))), ItemGroups.COMBAT);
    // --- IRON ---
    public static final Item IRON_PROSPECTOR_HEAD = register("iron_prospector_head", new Item(new Item.Settings()));
    // --- STEEL ---
    public static final Item STEEL_PROSPECTOR_HEAD = register("steel_prospector_head", new Item(new Item.Settings()));
    public static final Item STEEL_AXE_HEAD = register("steel_axe_head", new Item(new Item.Settings()));
    public static final Item STEEL_PICKAXE_HEAD = register("steel_pickaxe_head", new Item(new Item.Settings()));
    public static final Item STEEL_SHOVEL_HEAD = register("steel_shovel_head", new Item(new Item.Settings()));
    public static final Item STEEL_HOE_HEAD = register("steel_hoe_head", new Item(new Item.Settings()));
    public static final Item STEEL_SWORD_BLADE = register("steel_sword_blade", new Item(new Item.Settings()));
    // --- DIAMOND ---
    public static final Item DIAMOND_PROSPECTOR_HEAD = register("diamond_prospector_head", new Item(new Item.Settings()));
    // --- DAMASCUS STEEL ---
    public static final Item DAMASCUS_STEEL_UPGRADE_TEMPLATE = register("damascus_steel_upgrade_smithing_template",
            createSmithingTemplate("Damascus Steel", "Diamond"), ItemGroups.INGREDIENTS);
    public static final Item DAMASCUS_STEEL_PROSPECTOR_HEAD = register("damascus_steel_prospector_head", new Item(new Item.Settings()));
    public static final Item DAMASCUS_STEEL_AXE_HEAD = register("damascus_steel_axe_head", new Item(new Item.Settings()));
    public static final Item DAMASCUS_STEEL_PICKAXE_HEAD = register("damascus_steel_pickaxe_head", new Item(new Item.Settings()));
    public static final Item DAMASCUS_STEEL_SHOVEL_HEAD = register("damascus_steel_shovel_head", new Item(new Item.Settings()));
    public static final Item DAMASCUS_STEEL_HOE_HEAD = register("damascus_steel_hoe_head", new Item(new Item.Settings()));
    public static final Item DAMASCUS_STEEL_SWORD_BLADE = register("damascus_steel_sword_blade", new Item(new Item.Settings()));
    // --- NETHERITE ---
    public static final Item NETHERITE_PROSPECTOR_HEAD = register("netherite_prospector_head", new Item(new Item.Settings()));
    // --- GILDED NETHERITE ---
    public static final Item GILDED_NETHERITE_PROSPECTOR_HEAD = register("gilded_netherite_prospector_head", new Item(new Item.Settings()));
    public static final Item GILDED_NETHERITE_AXE_HEAD = register("gilded_netherite_axe_head", new Item(new Item.Settings()));
    public static final Item GILDED_NETHERITE_PICKAXE_HEAD = register("gilded_netherite_pickaxe_head", new Item(new Item.Settings()));
    public static final Item GILDED_NETHERITE_SHOVEL_HEAD = register("gilded_netherite_shovel_head", new Item(new Item.Settings()));
    public static final Item GILDED_NETHERITE_HOE_HEAD = register("gilded_netherite_hoe_head", new Item(new Item.Settings()));
    public static final Item GILDED_NETHERITE_SWORD_BLADE = register("gilded_netherite_sword_blade", new Item(new Item.Settings()));



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
                Text.translatable("item.agedaddition." + materialName.toLowerCase().replace(" ", "_") + "_upgrade_template.ingredients").formatted(Formatting.BLUE), // Title for material "Ingredients"
                Text.translatable("upgrade.agedaddition." + materialName.toLowerCase().replace(" ", "_") + "_upgrade").formatted(Formatting.GRAY), // The Template Title
                Text.translatable("item.agedaddition.smithing_template.base_slot_description"), // Tooltip for Left Slot
                Text.translatable("item.agedaddition.smithing_template.additions_slot_description"), // Tooltip for Right Slot
                emptyBaseSlotTextures,
                emptyAdditionsSlotTextures
        );
    }

    private static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, AGEDADDITION_ITEM_GROUP, FabricItemGroup.builder().icon(() -> new ItemStack(COAL_PIECE)).displayName(Text.translatable("itemgroup.agedaddition.item_group")).build());
    }

    private static Item register(String id, Item item) {
        return register(id, item, AGEDADDITION_ITEM_GROUP);
    }

    private static Item register(String id, Item item, RegistryKey<ItemGroup> vanillaGroup) {
        Identifier identifier = AgedAdditionMain.identifierOf(id);

        ItemGroupEvents.modifyEntriesEvent(AGEDADDITION_ITEM_GROUP).register(entries -> entries.add(item));

        if (vanillaGroup != AGEDADDITION_ITEM_GROUP) {
            ItemGroupEvents.modifyEntriesEvent(vanillaGroup).register(entries -> entries.add(item));
        }

        return Registry.register(Registries.ITEM, identifier, item);
    }

    public static void init() {
        FuelRegistry.INSTANCE.add(COAL_COKE, 20800);
        registerItemGroup();
        if (FabricLoader.getInstance().isModLoaded("miningz")) {
            MiningZCompat.init();
        }
    }
}
