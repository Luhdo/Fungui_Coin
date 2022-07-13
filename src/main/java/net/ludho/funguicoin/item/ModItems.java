package net.ludho.funguicoin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ludho.funguicoin.FunguiCoin;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_FUNGUICOIN = registerItem("raw_funguicoin",
            new Item(new FabricItemSettings().group(ModItemGroup.FUNGUICOIN)));
    public static final Item FUNGUICOIN = registerItem("funguicoin",
            new Item(new FabricItemSettings().group(ModItemGroup.FUNGUICOIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FunguiCoin.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FunguiCoin.LOGGER.debug("Registering Mod Items for " + FunguiCoin.MOD_ID);
    }
}
