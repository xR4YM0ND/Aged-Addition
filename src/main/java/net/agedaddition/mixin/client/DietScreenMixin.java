package net.agedaddition.mixin.client;

import com.illusivesoulworks.diet.client.screen.DietScreen;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.RenderInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
@Mixin(DietScreen.class)
public abstract class DietScreenMixin extends Screen {

    @Shadow
    @Mutable
    @Final
    private int xSize;
    @Shadow
    private int ySize;

    public DietScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("TAIL"))
    protected void initMixin(CallbackInfo info) {
        this.ySize -= 38;
        this.clearChildren();
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void renderMixin(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo info) {
        int y = this.height / 2 - this.ySize / 2;
        int x = this.width / 2 - this.xSize / 2;
        if (this.isPointWithinBounds(ConfigInit.CONFIG.dietButtonX, ConfigInit.CONFIG.dietButtonY, 14, 14, (double) mouseX, (double) mouseY)) {
            context.drawTooltip(this.textRenderer, Text.translatable("container.inventory"), mouseX, mouseY);
        }
        context.drawTexture(RenderInit.AGED_TEXTURES, x + ConfigInit.CONFIG.dietButtonX, y + ConfigInit.CONFIG.dietButtonY, 0, 9, 14, 14);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (this.client != null && this.isPointWithinBounds(ConfigInit.CONFIG.dietButtonX, ConfigInit.CONFIG.dietButtonY, 14, 14, (double) mouseX, (double) mouseY)) {
            MinecraftClient.getInstance().setScreen(new InventoryScreen(this.client.player));
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private boolean isPointWithinBounds(int x, int y, int width, int height, double pointX, double pointY) {
        int i = this.width / 2 - this.xSize / 2;
        int j = this.height / 2 - this.ySize / 2;
        return (pointX -= (double) i) >= (double) (x - 1) && pointX < (double) (x + width + 1) && (pointY -= (double) j) >= (double) (y - 1) && pointY < (double) (y + height + 1);
    }
}
