package com.electro.biology.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class RegisterHelper {
	
	public static void registerBlock (Block Block)
	{
		GameRegistry.registerBlock(Block, Reference.MODID + "_" + Block.getUnlocalizedName().substring(5));
	}
}
