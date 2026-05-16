package net.agedaddition.compat;

import net.agedaddition.init.CompatInit;
import net.cupellation.api.CupellationAPI;
import net.cupellation.api.CupellationEntrypoint;
import net.cupellation.api.MoldType;
import net.cupellation.api.SmelterType;

import java.util.Set;

public class AgedCupellationPlugin implements CupellationEntrypoint {

    @Override
    public void registerSmelterTypes() {
        CupellationAPI.registerSmelterType(new SmelterType(CompatInit.LIMESTONE_BRICK_SMELTER, CompatInit.LIMESTONE_BRICK_FAUCET, CompatInit.LIMESTONE_BRICK_CASTING_BASIN, CompatInit.LIMESTONE_BRICK_CASTING_TABLE));
        CupellationAPI.registerSmelterType(new SmelterType(CompatInit.WHITE_BRICK_SMELTER, CompatInit.WHITE_BRICK_FAUCET, CompatInit.WHITE_BRICK_CASTING_BASIN, CompatInit.WHITE_BRICK_CASTING_TABLE));
    }

    @Override
    public void registerMoldTypes() {
        CupellationAPI.registerMoldType(new MoldType("shard", 144, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("dagger_blade", 864, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("dirk_blade", 1296, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("sheet", 432, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("rod", 288, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("gemstone", 144, false, Set.of()));
        CupellationAPI.registerMoldType(new MoldType("hook", 864, false, Set.of()));
 }
}
