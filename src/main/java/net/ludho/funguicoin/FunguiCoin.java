package net.ludho.funguicoin;

import net.fabricmc.api.ModInitializer;
import net.ludho.funguicoin.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunguiCoin implements ModInitializer {
	public static final String MOD_ID = "funguicoin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
