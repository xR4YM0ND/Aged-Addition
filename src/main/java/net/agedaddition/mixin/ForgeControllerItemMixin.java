package net.agedaddition.mixin;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import wraith.alloyforgery.ForgeControllerItem;
import wraith.alloyforgery.forges.ForgeDefinition;

import java.util.List;

@Mixin(value = ForgeControllerItem.class, remap = false)
public abstract class ForgeControllerItemMixin extends BlockItem {

    public ForgeControllerItemMixin(net.minecraft.block.Block block, Settings settings) {
        super(block, settings);
    }

    @Shadow
    public abstract ForgeDefinition getForgeDefinition();

    /**
     * @author AgedAddition
     * @reason Overwrite to bypass the immutable ForgeDefinition loaded during mod initialization.
     */
    @Overwrite
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        String itemId = Registries.ITEM.getId(stack.getItem()).toString();
        ForgeDefinition definition = getForgeDefinition();

        // Manual Tier Mapping based on Registry ID
        int displayTier = switch (itemId) {
            case "alloy_forgery:bricks_forge_controller" -> 1;
            case "alloy_forgery:stone_bricks_forge_controller" -> 2;
            case "alloy_forgery:prismarine_bricks_forge_controller", 
                 "alloy_forgery:deepslate_bricks_forge_controller" -> 3;
            case "alloy_forgery:polished_blackstone_forge_controller" -> 4;
            case "alloy_forgery:end_stone_bricks_forge_controller" -> 5;
            default -> definition.forgeTier();
        };

        // Adding the tooltip lines manually to ensure they reflect the switch logic
        tooltip.add(Text.translatable("tooltip.alloy_forgery.forge_tier", displayTier).formatted(Formatting.GRAY));
        
        // We still use the definition's fuel capacity unless you want to hardcode those too
        tooltip.add(Text.translatable("tooltip.alloy_forgery.fuel_capacity", definition.fuelCapacity()).formatted(Formatting.GRAY));
    }
}