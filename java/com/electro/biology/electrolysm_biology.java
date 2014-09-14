package com.electro.biology;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.electro.biology.bacteria.machines.breeder;
import com.electro.biology.bacteria.machines.harvester;
import com.electro.biology.bacteria.ItemAgar;
import com.electro.biology.bacteria.ItemPetriDish;
import com.electro.biology.bacteria.machines.incubator;
import com.electro.biology.handlers.ElectroBioWorld;
import com.electro.biology.handlers.ModBlocks;
import com.electro.biology.handlers.ModItems;
import com.electro.biology.handlers.Reference;
import com.electro.biology.handlers.RegisterHelper;
import com.electro.biology.handlers.TabElectrolysm_Biology;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class electrolysm_biology {
	
	public static CreativeTabs TabElectrolysm_Biology = new TabElectrolysm_Biology(CreativeTabs.getNextID(),"Electrolysm | Biology");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();
		ModItems.loadItems();
		ElectroBioWorld.mainRegistery();
}
}