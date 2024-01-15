package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.agedaddition.block.SampleBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class BlockInit {

    public static final Block STONE_SALT_ORE = register("stone_salt_ore", 
        new ExperienceDroppingBlock(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(0, 1)), true);

    public static final Block STONE_SALT_ORE_SAMPLE = register("stone_salt_ore_sample", 
        new SampleBlock(AbstractBlock.Settings.create().strength(1.0f, 1.0f).nonOpaque()), true);

    public static final Block ALPINE_SALT_ORE_SAMPLE = register("alpine_salt_ore_sample", 
        new SampleBlock(AbstractBlock.Settings.create().strength(1.0f, 1.0f).nonOpaque()), true);

    public static Block register(String name, Block block, boolean shouldhaveitem){

        Identifier blockIdentifier = new Identifier(AgedAdditionMain.MOD_ID, name);
        if(shouldhaveitem){
            BlockItem blockitem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, blockIdentifier, blockitem);
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(blockitem));
        }
        
        return Registry.register(Registries.BLOCK, blockIdentifier, block);
    }

    public static void init(){}
}
