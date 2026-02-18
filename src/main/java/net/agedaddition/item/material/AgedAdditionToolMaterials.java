package net.agedaddition.item.material;

import net.agedaddition.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class AgedAdditionToolMaterials implements ToolMaterial {

    public static final ToolMaterial BRONZE = new AgedAdditionToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 250, 6.0f, 2.0f, 15,
            () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "bronze_ingot"))), "bronze");

    public static final ToolMaterial BASIC_STEEL = new AgedAdditionToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 500, 7.0f, 2.0f, 10,
            () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "steel_ingot"))), "basic_steel");

    public static final ToolMaterial NICKEL_STEEL = new AgedAdditionToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 750, 8.0f, 3.0f, 12,
            () -> Ingredient.ofItems(ItemInit.NICKEL_STEEL_INGOT), "nickel_steel");

    public static final ToolMaterial CHROME_STEEL = new AgedAdditionToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1000, 9.0f, 4.0f, 18,
            () -> Ingredient.ofItems(ItemInit.CHROME_STEEL_INGOT), "chrome_steel");

    public static final ToolMaterial STAINLESS_STEEL = new AgedAdditionToolMaterials(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 250, 6.0f, 2.0f, 15,
            () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "stainless_steel_ingot"))), "stainless_steel");

    // VANILLA = () -> Ingredient.ofItems(Items.FLINT), "nickel_steel");
    // AGED_ADDITION = () -> Ingredient.ofItems(ItemInit.COAL_PIECE), "chrome_steel");
    // EXTERNAL_MODS = () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "bronze_ingot"))), "bronze");
    // EXTERNAL_MODS_OLD = Ingredient.ofItems(Registries.ITEM.get(Identifier.of("modid:item_id"))), "chrome_steel");

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient; // MUST BE Supplier<Ingredient>
    private final String name;

    // The 6th parameter here must be Supplier<Ingredient>
    private AgedAdditionToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient, String name) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.name = name;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // This is where the magic happens: .get() executes the lambda
        return this.repairIngredient.get();
    }

    @Override
    public String toString() {
        return this.name;
    }
}