package net.agedaddition;

import net.agedaddition.init.*;
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
        //BiomeInit.init();
        CompatInit.init();
    }

    public static Identifier identifierOf(String name) {
        return Identifier.of(MOD_ID, name);
    }

}
