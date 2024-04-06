package net.agedaddition;

import net.agedaddition.init.RenderInit;
import net.agedaddition.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class AgedAdditionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.STONE_SALT_ORE_SAMPLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ALPINE_SALT_ORE_SAMPLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.THALLASIUM_ORE_SAMPLE, RenderLayer.getCutout());

        RenderInit.init();
    }

}
