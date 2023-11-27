package net.agedaddition.init;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.agedaddition.config.AgedAdditionConfig;

public class ConfigInit {

    public static AgedAdditionConfig CONFIG = new AgedAdditionConfig();

    public static void init() {
        AutoConfig.register(AgedAdditionConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(AgedAdditionConfig.class).getConfig();
    }
}
