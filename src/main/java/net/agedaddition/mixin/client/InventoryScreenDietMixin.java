package net.agedaddition.mixin.client;

import com.illusivesoulworks.diet.client.screen.DietScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.agedaddition.init.ConfigInit;
import net.agedaddition.init.RenderInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
@Mixin(InventoryScreen.class)
public abstract class InventoryScreenDietMixin extends AbstractInventoryScreen<PlayerScreenHandler> {

    public InventoryScreenDietMixin(PlayerScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
        super(screenHandler, playerInventory, text);
    }

    @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
    private void mouseClickedMixin(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> info) {
        if (this.client != null && this.focusedSlot == null
                && this.isPointWithinBounds(ConfigInit.CONFIG.dietInventoryButtonX, ConfigInit.CONFIG.dietInventoryButtonY, 9, 9, (double) mouseX, (double) mouseY)) {
            MinecraftClient.getInstance().setScreen(new DietScreen(true));
            info.setReturnValue(true);
        }
    }

    @Inject(method = "drawBackground", at = @At("TAIL"))
    protected void drawBackgroundMixin(DrawContext context, float delta, int mouseX, int mouseY, CallbackInfo info) {
        if (this.isPointWithinBounds(ConfigInit.CONFIG.dietInventoryButtonX, ConfigInit.CONFIG.dietInventoryButtonY, 9, 9, (double) mouseX, (double) mouseY)) {
            context.drawTexture(RenderInit.AGED_TEXTURES, this.x + ConfigInit.CONFIG.dietInventoryButtonX, this.y + ConfigInit.CONFIG.dietInventoryButtonY, 9, 0, 9, 9);
            context.drawTooltip(this.textRenderer, Text.translatable("screen.diet"), mouseX, mouseY);
        } else {
            context.drawTexture(RenderInit.AGED_TEXTURES, this.x + ConfigInit.CONFIG.dietInventoryButtonX, this.y + ConfigInit.CONFIG.dietInventoryButtonY, 0, 0, 9, 9);
        }
    }

}
