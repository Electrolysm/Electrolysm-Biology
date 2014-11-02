package com.electro.biology;

import com.electro.biology.handlers.*;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.electro.biology.bacteria.machines.breeder;
import com.electro.biology.bacteria.machines.harvester;
import com.electro.biology.bacteria.agar;
import com.electro.biology.bacteria.petriDish;
import com.electro.biology.bacteria.machines.incubator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:Electrolysm@1.2.42")
public class electrolysm_biology {
	
	public static CreativeTabs TabElectrolysm_Biology = new TabElectrolysm_Biology(CreativeTabs.getNextID(),"Electrolysm | Biology");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();
		ModItems.loadItems();
		ElectroBioWorld.mainRegistery();
        FMLCommonHandler.instance().bus().register(new electrolysm_biology());

    }
	  @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
		  ModRecipes.addCrafting();
		  ModMapping.addMapping();
}
}