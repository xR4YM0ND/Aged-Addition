package net.agedaddition.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "agedaddition")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class AgedAdditionConfig implements ConfigData {

    public int dietInventoryButtonX = 0;
    public int dietInventoryButtonY = 0;

    public int numismaticButtonX = 0;
    public int numismaticButtonY = 0;

    public int dietButtonX = 0;
    public int dietButtonY = 0;

}