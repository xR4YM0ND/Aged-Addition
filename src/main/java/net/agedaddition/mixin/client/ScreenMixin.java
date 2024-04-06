package net.agedaddition.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.agedaddition.access.ScreenAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;

@Environment(EnvType.CLIENT)
@Mixin(Screen.class)
public class ScreenMixin implements ScreenAccess {

    @Override
    public <T extends Element & Drawable> T addAnotherDrawable(T drawableElement) {
        return addDrawableChild(drawableElement);
    }

    @Shadow
    protected <T extends Element & Drawable> T addDrawableChild(T drawableElement) {
        return null;
    }
}
