package net.agedaddition.init;

import com.illusivesoulworks.diet.client.screen.DynamicButton;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class RenderInit {

    public static final Identifier AGED_TEXTURES = new Identifier("agedaddition", "textures/gui/icons.png");

    public static void init() {
        if (FabricLoader.getInstance().isModLoaded("diet")) {
            ScreenEvents.AFTER_INIT.register(new Identifier("agedaddition", "diet_button_removal"), (client, screen, scaledWidth, scaledHeight) -> {
                if (screen instanceof InventoryScreen) {
                    for (int i = 0; i < ((InventoryScreen) screen).children().size(); i++) {
                        if (((InventoryScreen) screen).children().get(i) instanceof DynamicButton) {
                            ((InventoryScreen) screen).children().remove(i);
                            break;
                        }
                    }
                }
            });
        }
    }

}
