package net.agedaddition;

import net.agedaddition.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.stal.alloys.item.StalAlloysItems;
import io.wispforest.lavender.book.LavenderBookItem;

public class AgedAdditionMain implements ModInitializer {

    public static final String MOD_ID = "agedaddition";

    @Override
    public void onInitialize() {
        ItemInit.init();
        BlockInit.init();
        ConfigInit.init();
        TagInit.init();
        //BiomeInit.init();
        FuelRegistry.INSTANCE.add(StalAlloysItems.CARBON_PLATE, 24000);
        //LavenderBookItem.registerForBook(identifierOf("guide_book"), new Item.Settings());
        if (FabricLoader.getInstance().isModLoaded("lavender")) {
            LavenderInit.registerGuideBook();
        }
    }

    public static Identifier identifierOf(String name) {
        return Identifier.of("agedaddition", name);
    }

}
