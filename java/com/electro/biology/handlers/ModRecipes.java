package com.electro.biology.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	
public static void addCrafting()
{
    GameRegistry.addRecipe(new ItemStack(ModBlocks.breeder, 1),
            "DDD", "DDD", "DDD",
            Character.valueOf('D'), Blocks.dirt);
}
}