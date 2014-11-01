package com.electro.biology.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import electrolysm.api.items.Fetcher;

public class ModRecipes {
	

public static void addCrafting()
{
	GameRegistry.addRecipe(new ItemStack(ModBlocks.breeder, 1),
            "IMI", "GLG", "IRI",
            Character.valueOf('I'), Items.iron_ingot,
            Character.valueOf('M'),Fetcher.getItem("advancedMicrochip", 1),
            Character.valueOf('G'), Blocks.glass,
            Character.valueOf('L'), Blocks.redstone_lamp,
            Character.valueOf('R'), Items.redstone);
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.harvester, 1),
            "ILI", "MGM", "IBI",
            Character.valueOf('I'), Items.iron_ingot,
            Character.valueOf('M'),Fetcher.getItem("advancedMicrochip", 1),
            Character.valueOf('G'), Blocks.glass,
            Character.valueOf('L'), Blocks.redstone_lamp,
            Character.valueOf('B'), Items.bucket);
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.identifier, 1),
            "IMI", "RGR", "IMI",
            Character.valueOf('I'), Items.iron_ingot,
            Character.valueOf('M'),Fetcher.getItem("advancedMicrochip", 1),
            Character.valueOf('G'), Blocks.glass,
            Character.valueOf('R'), Items.redstone);
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.incubator, 1),
            "ILI", "MGR", "ILI",
            Character.valueOf('I'), Items.iron_ingot,
            Character.valueOf('M'),Fetcher.getItem("advancedMicrochip", 1),
            Character.valueOf('G'), Blocks.glass,
            Character.valueOf('L'), Blocks.redstone_lamp,
            Character.valueOf('R'), Items.redstone);
	
	GameRegistry.addRecipe(new ItemStack(ModItems.sampler, 1),
            "  I", " II", "I  ",
            Character.valueOf('I'), Items.iron_ingot);
	
	GameRegistry.addRecipe(new ItemStack(ModItems.petriDish, 2),
            "   ", "GAG", " G ",
            Character.valueOf('A'), ModItems.agar,
            Character.valueOf('G'), Blocks.glass);
            

  
}
}