package net.agedaddition;

import net.agedaddition.init.RenderInit;
import net.agedaddition.util.CustomRarity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class AgedAdditionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, type, lines) -> {
            CustomRarity rarity = getStrongestRarity(stack);

            String rarityName = rarity.getName().substring(0, 1).toUpperCase() + rarity.getName().substring(1).toLowerCase();

            // "Rarity: " in gray
            Text label = Text.literal("Rarity: ").setStyle(Style.EMPTY.withColor(0x9D9D9D)); // gray

            // name in rarity color; COMMON should also be gray
            int nameColor = (rarity == CustomRarity.COMMON) ? 0x9D9D9D : rarity.getColorValue();
            Text name = Text.literal(rarityName).setStyle(Style.EMPTY.withColor(nameColor));

            // combine and insert
            Text tooltipText = Text.empty().append(label).append(name);


            // Inject into tooltip
            if (lines.size() >= 1) {
                lines.add(1, tooltipText);
            }
        });
        RenderInit.init();
    }

    private CustomRarity getStrongestRarity(ItemStack stack) {
        CustomRarity[] rarities = CustomRarity.values();

        // Loop backwards from ADMIN (length - 1) down to RUSTIC (1)
        for (int i = rarities.length - 1; i >= 1; i--) {
            CustomRarity r = rarities[i];
            if (stack.isIn(r.getTag())) {
                return r;
            }
        }

        // Default fallback if no tags match
        return CustomRarity.COMMON;
    }

}
