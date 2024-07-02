package net.agedaddition.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class RenderInit {

    public static final Identifier AGED_TEXTURES = new Identifier("agedaddition", "textures/gui/icons.png");

    public static void init() {

    }

}
