package net.agedaddition.item.material;

import net.agedaddition.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AgedAdditionToolMaterials implements ToolMaterial {

    public static final ToolMaterial NICKEL_STEEL = new AgedAdditionToolMaterials(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 29, 1.5f, 0.0f, 0, Ingredient.ofItems(Items.FLINT), "nickel_steel");
    public static final ToolMaterial CHROME_STEEL = new AgedAdditionToolMaterials(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 7.0f, 2.0f, 14, Ingredient.ofItems(ItemInit.COAL_PIECE), "chrome_steel");
    public static final ToolMaterial TEST = new AgedAdditionToolMaterials(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 7.0f, 2.0f, 14, Ingredient.ofItems(Registries.ITEM.get(Identifier.of("modid:item_id"))), "chrome_steel");

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;
    private final String name;

    private AgedAdditionToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient, String name) {
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
        return this.repairIngredient;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
