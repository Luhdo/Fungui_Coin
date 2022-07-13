package net.ludho.funguicoin.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ludho.funguicoin.FunguiCoin;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FUNGUICOIN = FabricItemGroupBuilder.build(
            new Identifier(FunguiCoin.MOD_ID, "funguicoin"), () -> new ItemStack(ModItems.FUNGUICOIN));
}
