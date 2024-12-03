package net.agedaddition;

import net.agedaddition.init.BlockInit;
import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.ItemInit;
import net.agedaddition.init.TagInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class AgedAdditionMain implements ModInitializer {

    public static final String MOD_ID = "agedaddition";

    @Override
    public void onInitialize() {
        ItemInit.init();
        BlockInit.init();
        ConfigInit.init();
        TagInit.init();
    }

    public static Identifier identifierOf(String name) {
        return Identifier.of("agedaddition", name);
    }

}
