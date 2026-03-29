package net.agedaddition.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import wraith.alloyforgery.block.ForgeControllerBlockEntity;
import wraith.alloyforgery.forges.ForgeDefinition;

@Mixin(value = ForgeControllerBlockEntity.class, remap = false)
public abstract class ForgeControllerBlockEntityMixin extends BlockEntity {

    public ForgeControllerBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    /**
     * This redirects every time the forge checks "what is my tier?".
     * It looks at the block itself to decide the number.
     */
    @Redirect(method = "canSmelt", at = @At(value = "INVOKE", target = "Lwraith/alloyforgery/forges/ForgeDefinition;forgeTier()I"))
    private int agedaddition$overrideTierLogic(ForgeDefinition definition) {
        Block block = this.getCachedState().getBlock();
        String blockId = net.minecraft.registry.Registries.BLOCK.getId(block).toString();

        return switch (blockId) {
            case "alloy_forgery:bricks_forge_controller" -> 1;
            case "alloy_forgery:stone_bricks_forge_controller" -> 2;
            case "alloy_forgery:prismarine_bricks_forge_controller", "alloy_forgery:deepslate_bricks_forge_controller" -> 3;
            case "alloy_forgery:polished_blackstone_forge_controller" -> 4;
            case "alloy_forgery:end_stone_bricks_forge_controller" -> 5;
            
            // This catches any other forge not listed above
            default -> definition.forgeTier();
        };
    }
}