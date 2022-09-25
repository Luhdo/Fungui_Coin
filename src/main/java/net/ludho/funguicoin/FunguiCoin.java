package net.ludho.funguicoin;

import net.fabricmc.api.ModInitializer;
import net.ludho.funguicoin.block.ModBlocks;
import net.ludho.funguicoin.item.ModItems;
import net.ludho.funguicoin.world.feature.ModConfiguredFeatures;
import net.ludho.funguicoin.world.gen.ModOreGeneration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunguiCoin implements ModInitializer {
	public static final String MOD_ID = "funguicoin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

	}
}
