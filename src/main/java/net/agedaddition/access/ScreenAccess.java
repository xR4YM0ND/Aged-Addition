package net.agedaddition.access;

import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.Element;

public interface ScreenAccess {

    <T extends Element & Drawable> T addAnotherDrawable(T drawableElement);
}
