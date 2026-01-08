package net.agedaddition.init;

import java.util.List;

import net.agedaddition.AgedAdditionMain;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class BiomeInit {
    
    // String-Arrays müssen mit deklariert werden
    private static final List<String>ORES = List.of(
        "carbon", "chromium", "coal", "copper", "diamond", 
        "emerald", "gold", "iron", "lapis", "nickel", 
        "quartz", "redstone", "salt", "tin", "zinc"
    );

    private static final List<String>VARIANTS = List.of("_large", "_medium", "_small");

    public static void init() {
        for (String ore : ORES) {
            for (String variant : VARIANTS) {
                // Name der JSON-Datei ohne.json Endung
                String featureName = "ore_" + ore + variant;
                
                // Erstellt den Key: agedaddition:ore_carbon_large
                RegistryKey<PlacedFeature> featureKey = RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE, 
                    AgedAdditionMain.identifierOf(featureName)
                );

                // Fügt das Feature allen Overworld-Biomen hinzu
                BiomeModifications.addFeature(
                    BiomeSelectors.foundInOverworld(), 
                    GenerationStep.Feature.UNDERGROUND_ORES, 
                    featureKey
                );
            }
        }
    }
}