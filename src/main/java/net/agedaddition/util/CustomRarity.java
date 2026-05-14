package net.agedaddition.util;

import com.mojang.serialization.Codec;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;

public enum CustomRarity implements StringIdentifiable {
    // Ordered from Weakest to Strongest
    COMMON("common", "#9D9D9D", null),
    RUSTIC("rustic", "#8A5A3B", "rustic"),
    UNUSUAL("unusual", "#CFCFCF", "unusual"),
    RARE("rare", "#4A90E2", "rare"),
    REFINED("refined", "#6FCF97", "refined"),
    EPIC("epic", "#A259FF", "epic"),
    PRECIOUS("precious", "#FFD166", "precious"),
    ANCIENT("ancient", "#7A6F4B", "ancient"),
    EXQUISITE("exquisite", "#FF8FA3", "exquisite"),
    GILDED("gilded", "#D4AF37", "gilded"),
    VOIDFORGED("voidforged", "#5A2A82", "voidforged"),
    LEGENDARY("legendary", "#FF7A1A", "legendary"),
    MYSTIC("mystic", "#3ED1CF", "mystic"),
    ADMIN("owner", "#6B0000", "owner");

    public static final Codec<CustomRarity> CODEC = StringIdentifiable.createCodec(CustomRarity::values);

    private final String name;
    private final String hexColor;
    private final TagKey<Item> tag;

    CustomRarity(String name, String hexColor, String tagName) {
        this.name = name;
        this.hexColor = hexColor;
        this.tag = tagName == null ? null : TagKey.of(RegistryKeys.ITEM, Identifier.of("agedaddition", tagName));
    }

    public int getColorValue() {
        return Integer.parseInt(hexColor.replace("#", ""), 16);
    }

    public String getName() {
        return name;
    }

    public TagKey<Item> getTag() {
        return tag;
    }

    @Override
    public String asString() {
        return this.name;
    }
}