package net.ludho.funguicoin.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ludho.funguicoin.FunguiCoin;
import net.ludho.funguicoin.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block FUNGUI_PIECE = registerBlock("fungui_piece",
            new Block(FabricBlockSettings.of(Material.METAL).luminance(1).strength(4f).requiresTool()),
            ModItemGroup.FUNGUICOIN);

    public static final Block FUNGUICOIN_ORE = registerBlock("funguicoin_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),
            ModItemGroup.FUNGUICOIN);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(FunguiCoin.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(FunguiCoin.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        FunguiCoin.LOGGER.debug("Registering ModBlocks for " + FunguiCoin.MOD_ID);
    }
}