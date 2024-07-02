package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {

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
