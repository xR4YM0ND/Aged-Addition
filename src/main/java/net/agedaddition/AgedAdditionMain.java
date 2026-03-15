package net.agedaddition;

import net.agedaddition.init.BlockInit;
import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.ItemInit;
import net.agedaddition.init.TagInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.util.Identifier;
import net.stal.alloys.item.StalAlloysItems;

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
    }

    public static Identifier identifierOf(String name) {
        return Identifier.of("agedaddition", name);
    }

}
