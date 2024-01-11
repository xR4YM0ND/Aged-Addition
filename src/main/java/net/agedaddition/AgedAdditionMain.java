package net.agedaddition;

import net.agedaddition.init.BlockInit;
import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class AgedAdditionMain implements ModInitializer {

    public static final String MOD_ID = "agedaddition";

    @Override
    public void onInitialize() {
        ItemInit.init();
        BlockInit.init();
        ConfigInit.init();
    }

}
