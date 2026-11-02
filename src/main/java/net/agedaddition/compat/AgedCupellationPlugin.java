package net.agedaddition.compat;

import net.agedaddition.init.CompatInit;
import net.cupellation.api.CupellationAPI;
import net.cupellation.api.CupellationEntrypoint;
import net.cupellation.api.MoldType;
import net.cupellation.api.SmelterType;
import net.cupellation.api.strategy.MappedResultMoldStrategy;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.Set;

public class AgedCupellationPlugin implements CupellationEntrypoint {

    @Override
    public void registerSmelterTypes() {
        CupellationAPI.registerSmelterType(new SmelterType(CompatInit.LIMESTONE_BRICK_SMELTER, CompatInit.LIMESTONE_BRICK_FAUCET, CompatInit.LIMESTONE_BRICK_CASTING_BASIN, CompatInit.LIMESTONE_BRICK_CASTING_TABLE));
        CupellationAPI.registerSmelterType(new SmelterType(CompatInit.WHITE_BRICK_SMELTER, CompatInit.WHITE_BRICK_FAUCET, CompatInit.WHITE_BRICK_CASTING_BASIN, CompatInit.WHITE_BRICK_CASTING_TABLE));
    }

    // natures_spirit:calcite_shard, fire_charge, gunpowder, bone_meal, natures_spirit:chalk_powder, blaze_powder, prismarine_shard, prismarine_crystals, coal
    @Override
    public void registerMoldTypes() {
        CupellationAPI.registerMoldType(
                MoldType.builder("diamond_gemstone", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "diamond"), Identifier.of("minecraft", "diamond"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "diamond")))
                        .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("emerald_gemstone", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "emerald"), Identifier.of("minecraft", "emerald"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "emerald")))
                        .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("amethyst_shard", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "amethyst"), Identifier.of("minecraft", "amethyst_shard"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "amethyst_shard")))
                        .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("nether_quartz", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "quartz"), Identifier.of("minecraft", "quartz"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "quartz")))
                        .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("lapis", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "lapis"), Identifier.of("minecraft", "lapis_lazuli"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "lapis_lazuli")))
                        .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("dust", 144)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "redstone"), Identifier.of("minecraft", "redstone"))))
                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "redstone"),Identifier.of("minecraft", "glowstone_dust")))
                        .build());



        CupellationAPI.registerMoldType(
                MoldType.builder("hook", 432)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(
                                Identifier.of("cupellation", "iron"), Identifier.of("yo_hooks", "iron_hook_head"),
                                Identifier.of("cupellation", "gold"), Identifier.of("yo_hooks", "gold_hook_head"),
                                Identifier.of("cupellation", "diamond"), Identifier.of("yo_hooks", "diamond_hook_head"),
                                Identifier.of("cupellation", "netherite"), Identifier.of("yo_hooks", "netherite_hook_head")
                        )))
                        .craftableAsClayMold(Set.of(
                                Identifier.of("agedaddition", "stone_hook_head"),
                                Identifier.of("yo_hooks", "iron_hook_head"),
                                Identifier.of("yo_hooks", "gold_hook_head"),
                                Identifier.of("yo_hooks", "diamond_hook_head"),
                                Identifier.of("yo_hooks", "netherite_hook_head")
                        ))
                .build());

        CupellationAPI.registerMoldType(
                MoldType.builder("prospector_head", 432)
                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
                        .strategy(new MappedResultMoldStrategy(Map.of(
                                Identifier.of("cupellation", "copper"), Identifier.of("agedaddition", "copper_prospector_head"),
                                Identifier.of("cupellation", "iron"), Identifier.of("agedaddition", "iron_prospector_head"),
                                Identifier.of("cupellation", "steel"), Identifier.of("agedaddition", "steel_prospector_head"),
                                Identifier.of("cupellation", "diamond"), Identifier.of("agedaddition", "diamond_prospector_head"),
                                Identifier.of("cupellation", "damascus_steel"), Identifier.of("agedaddition", "damascus_steel_prospector_head"),
                                Identifier.of("cupellation", "netherite"), Identifier.of("agedaddition", "netherite_prospector_head"),
                                Identifier.of("cupellation", "gilded_netherite"), Identifier.of("agedaddition", "gilded_netherite_prospector_head")
                        )))
                        .craftableAsClayMold(Set.of(
                                Identifier.of("agedaddition", "stone_prospector_head"),
                                Identifier.of("agedaddition", "copper_prospector_head"),
                                Identifier.of("agedaddition", "iron_prospector_head"),
                                Identifier.of("agedaddition", "steel_prospector_head"),
                                Identifier.of("agedaddition", "diamond_prospector_head"),
                                Identifier.of("agedaddition", "damascus_steel_prospector_head"),
                                Identifier.of("agedaddition", "netherite_prospector_head"),
                                Identifier.of("agedaddition", "gilded_netherite_prospector_head")
                        ))
                        .build());

        













//        CupellationAPI.registerMoldType(
//                MoldType.builder("diamond", 144)
//                        .moldingMetalTypeId(Identifier.of("cupellation", "gold"))
//                        .strategy(new MappedResultMoldStrategy(Map.of(Identifier.of("cupellation", "diamond"), Identifier.of("minecraft", "diamond"))))
//                        .craftableAsClayMold(Set.of(Identifier.of("minecraft", "diamond")))   ///// welches item zum pressen
//                        .build());

        //CupellationAPI.registerMoldType(new MoldType("diamond", 144, false, Set.of()));
        //CupellationAPI.registerMoldType(new MoldType("dagger_blade", 864, false, Set.of()));
        //CupellationAPI.registerMoldType(new MoldType("dirk_blade", 1296, false, Set.of()));
        //CupellationAPI.registerMoldType(new MoldType("sheet", 432, false, Set.of()));
        //CupellationAPI.registerMoldType(new MoldType("rod", 288, false, Set.of()));

//        CupellationAPI.registerMoldType(new MoldType("amethyst_shard", 144, false, Set.of()));
//        CupellationAPI.registerMoldType(new MoldType("emerald_gemstone", 144, false, Set.of()));
//        CupellationAPI.registerMoldType(new MoldType("diamond_gemstone", 144, false, Set.of()));
//        CupellationAPI.registerMoldType(new MoldType("nether_quartz", 144, false, Set.of()));
//        CupellationAPI.registerMoldType(new MoldType("hook", 864, false, Set.of()));
 }
}
