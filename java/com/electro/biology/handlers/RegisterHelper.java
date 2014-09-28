package com.electro.biology.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RegisterHelper {
	
	public static void registerBlock (Block Block)
	{
		GameRegistry.registerBlock(Block, Reference.MODID + "_" + Block.getUnlocalizedName().substring(5));
		
	}
		public static void registerItem (Item item){
		
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
		}
			}
		
