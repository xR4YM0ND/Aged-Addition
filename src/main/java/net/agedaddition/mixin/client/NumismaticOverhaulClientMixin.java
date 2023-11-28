package net.agedaddition.mixin.client;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import com.glisco.numismaticoverhaul.client.NumismaticOverhaulClient;
import com.glisco.numismaticoverhaul.client.gui.PurseLayerElement;
import com.glisco.numismaticoverhaul.mixin.LayerInstanceAccessor;

import io.wispforest.owo.mixin.ui.layers.HandledScreenAccessor;
import io.wispforest.owo.ui.container.StackLayout;
import io.wispforest.owo.ui.core.Component;
import io.wispforest.owo.ui.core.OwoUIDrawContext;
import io.wispforest.owo.ui.core.Positioning;
import io.wispforest.owo.ui.core.Sizing;
import io.wispforest.owo.ui.layers.Layer;
import io.wispforest.owo.ui.layers.Layers;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.agedaddition.init.ConfigInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;

@SuppressWarnings("rawtypes")
@Environment(EnvType.CLIENT)
@Mixin(NumismaticOverhaulClient.class)
public class NumismaticOverhaulClientMixin {

    @Redirect(method = "onInitializeClient", at = @At(value = "INVOKE", target = "Lio/wispforest/owo/ui/layers/Layers;add(Ljava/util/function/BiFunction;Ljava/util/function/Consumer;[Ljava/lang/Class;)Lio/wispforest/owo/ui/layers/Layer;", ordinal = 1), remap = false)
    private Layer onInitializeClientMixin(BiFunction biFunction, Consumer consumer, Class[] classes) {

        return Layers.add(PurseLayerContainer::new, new PurseLayerElement<>((instance, component, xOffset, yOffset) -> {
            instance.aggressivePositioning = true;
            ((LayerInstanceAccessor) instance).numismatic$getLayoutUpdaters().add(() -> {
                component.positioning(Positioning.absolute(xOffset + ((HandledScreenAccessor) instance.screen).owo$getRootX() + ConfigInit.CONFIG.numismaticButtonX,
                        yOffset + ((HandledScreenAccessor) instance.screen).owo$getRootY() + ConfigInit.CONFIG.numismaticButtonY));
            });
        }), InventoryScreen.class);

    }

    private static class PurseLayerContainer extends StackLayout {

        protected PurseLayerContainer(Sizing horizontalSizing, Sizing verticalSizing) {
            super(horizontalSizing, verticalSizing);
        }

        @Override
        protected void drawChildren(OwoUIDrawContext context, int mouseX, int mouseY, float partialTicks, float delta, List<Component> children) {
            context.getMatrices().push();
            context.getMatrices().translate(0, 0, 300);
            super.drawChildren(context, mouseX, mouseY, partialTicks, delta, children);
            context.getMatrices().pop();
        }

    }
}
