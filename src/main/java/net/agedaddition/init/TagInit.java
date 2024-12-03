package net.agedaddition.init;

import net.agedaddition.AgedAdditionMain;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagInit {

    public static final TagKey<Block> PROSPECTOR_BLOCKS = TagKey.of(RegistryKeys.BLOCK, AgedAdditionMain.identifierOf("prospector_blocks"));

    public static void init() {
    }
}
