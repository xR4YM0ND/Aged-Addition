package net.agedaddition.compat;

import net.cupellation.api.CupellationAPI;
import net.cupellation.api.CupellationEntrypoint;
import net.cupellation.api.MoldType;
import net.cupellation.api.SmelterType;

import java.util.Set;

public class AgedCupellationPlugin implements CupellationEntrypoint {

    @Override
    public void registerMoldTypes() {
        CupellationAPI.registerMoldType(new MoldType("hammer_head", 576, true, Set.of()));
//        CupellationAPI.registerSmelterType(new SmelterType(ModBlocks.TEST_SMELTER, ModBlocks.TEST_FAUCET, ModBlocks.TEST_BASIN, ModBlocks.TEST_TABLE));
    }
}
