package net.agedaddition.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class HideVanillaRarityMixin {

    /**
     * This intercepts the call to get the item's rarity.
     * By forcing it to return COMMON, the name color will always be white.
     */
    @Inject(method = "getRarity", at = @At("HEAD"), cancellable = true)
    private void agedaddition$forceCommonRarity(CallbackInfoReturnable<Rarity> cir) {
        cir.setReturnValue(Rarity.COMMON);
    }
}