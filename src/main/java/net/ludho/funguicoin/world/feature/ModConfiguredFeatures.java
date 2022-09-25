package net.ludho.funguicoin.world.feature;

import java.util.List;

import net.ludho.funguicoin.FunguiCoin;
import net.ludho.funguicoin.block.ModBlocks;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_FUNGUICOIN_ORES = List
            .of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.FUNGUICOIN_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> FUNGUICOIN_ORE = ConfiguredFeatures
            .register("funguicoin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_FUNGUICOIN_ORES, 6));

    public static void registerConfiguredFeatures() {
        FunguiCoin.LOGGER.debug("Registering the ModConfiguredFeatures for " + FunguiCoin.MOD_ID);
    }
}
