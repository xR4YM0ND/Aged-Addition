package net.agedaddition.item.material;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import net.agedaddition.init.ItemInit;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class AgedAdditioArmorMaterials {
    
    // 1. EXTERNAL MOD ITEM (Example: "stal-alloys:steel_ingot")
    public static final RegistryEntry<ArmorMaterial> BASIC_STEEL = register("agedaddition:basic_steel", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 5);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, 
    // SUPPLIER: Looks up an item from another mod using its ID string
    () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "steel_ingot"))));

    // 2. EXTERNAL MOD ITEM (Example: "stal-alloys:bronze_ingot")
    public static final RegistryEntry<ArmorMaterial> BRONZE = register("agedaddition:bronze", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 5);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, 
    () -> Ingredient.ofItems(Registries.ITEM.get(Identifier.of("stal-alloys", "bronze_ingot"))));

    // 3. YOUR MOD ITEM (Direct reference to ItemInit)
    public static final RegistryEntry<ArmorMaterial> NICKEL_STEEL = register("agedaddition:nickel_steel", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 5);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, 
    // SUPPLIER: Directly references the static item from your ItemInit class
    () -> Ingredient.ofItems(ItemInit.NICKEL_STEEL_INGOT));

    // 4. YOUR MOD ITEM
    public static final RegistryEntry<ArmorMaterial> CHROME_STEEL = register("agedaddition:chrome_steel", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 5);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, 
    () -> Ingredient.ofItems(ItemInit.CHROME_STEEL_INGOT));

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness,
            float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(id)));

        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(id),
                new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, list, toughness, knockbackResistance));
    }

}
