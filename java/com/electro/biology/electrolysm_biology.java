package com.electro.biology;

import net.minecraft.block.Block;

import com.electro.biology.bacteria.machines.Blockincubator;
import com.electro.biology.handlers.Reference;
import com.electro.biology.handlers.RegisterHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class electrolysm_biology {
    //Bacteria Machines
	public static Block incubator;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Bacteria Machines
		incubator = new Blockincubator().setBlockName("incubator"); 
		RegisterHelper.registerBlock(incubator);
}
}