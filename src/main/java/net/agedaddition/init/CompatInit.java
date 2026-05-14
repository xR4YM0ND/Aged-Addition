package net.agedaddition.init;

import io.wispforest.lavender.book.LavenderBookItem;
import net.agedaddition.AgedAdditionMain;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;

public class CompatInit {

    public static void init() {
        // This class will ONLY be loaded if Lavender is installed
        if (FabricLoader.getInstance().isModLoaded("lavender")) {
            //LavenderBookItem.registerForBook(identifierOf("guide_book"), new Item.Settings());
            LavenderBookItem.registerForBook(AgedAdditionMain.identifierOf("guide_book"), new Item.Settings());
        }
    }
}
