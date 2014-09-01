package com.electro.biology;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.electro.biology.bacteria.machines.breeder;
import com.electro.biology.bacteria.machines.harvester;
import com.electro.biology.bacteria.ItemAgar;
import com.electro.biology.bacteria.ItemPetriDish;
import com.electro.biology.bacteria.machines.incubator;
import com.electro.biology.handlers.Reference;
import com.electro.biology.handlers.RegisterHelper;
import com.electro.biology.handlers.TabElectrolysm_Biology;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class electrolysm_biology {
	
	public static CreativeTabs TabElectrolysm_Biology = new TabElectrolysm_Biology(CreativeTabs.getNextID(),"Electrolysm | Biology");
    //Bacteria Machines
	public static Block incubator;
	public static Block harvester;
	public static Block breeder;
	
	//Bacteria
	public static Item agar;
	public static Item petriDish;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Bacteria Machines
		incubator = new incubator().setBlockName("incubator"); 
		RegisterHelper.registerBlock(incubator);
		harvester = new harvester().setBlockName("harvester");
		RegisterHelper.registerBlock(harvester);
		breeder = new breeder().setBlockName("breeder");
		RegisterHelper.registerBlock(breeder);
		
		//Bacteria 
		agar = new ItemAgar();
		RegisterHelper.registerItem(agar);
		petriDish = new ItemPetriDish();
		RegisterHelper.registerItem(petriDish);
}
}