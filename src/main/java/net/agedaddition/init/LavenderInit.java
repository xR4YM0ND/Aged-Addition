package net.agedaddition.init;

import io.wispforest.lavender.book.LavenderBookItem;
import net.agedaddition.AgedAdditionMain;
import net.minecraft.item.Item;

public class LavenderInit {
    public static void registerGuideBook() {
        // This class will ONLY be loaded if Lavender is installed
        LavenderBookItem.registerForBook(AgedAdditionMain.identifierOf("guide_book"), new Item.Settings());
    }
}
