package net.agedaddition;

import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class AgedAdditionMain implements ModInitializer {

    @Override
    public void onInitialize() {
        ItemInit.init();
        ConfigInit.init();
    }

}
