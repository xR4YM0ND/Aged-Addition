package net.agedaddition.mixin.client;

import com.illusivesoulworks.diet.client.screen.DynamicButton;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;

@Environment(EnvType.CLIENT)
@Mixin(DynamicButton.class)
public class DynamicButtonMixin {

    @Inject(method = "renderButton", at = @At("HEAD"), cancellable = true)
    private void renderButtonMixin(DrawContext context, int mouseX, int mouseY, float partialTicks, CallbackInfo info) {
        info.cancel();
    }
}
