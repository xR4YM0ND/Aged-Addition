package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class RenderInit {

    public static final Identifier AGED_TEXTURES = AgedAdditionMain.identifierOf("textures/gui/icons.png");

    public static void init() {
        BlockRenderLayerMap.INSTANCE.putBlock(CompatInit.LIMESTONE_BRICK_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CompatInit.LIMESTONE_BRICK_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CompatInit.WHITE_BRICK_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CompatInit.WHITE_BRICK_LEVER, RenderLayer.getCutout());
    }

}
