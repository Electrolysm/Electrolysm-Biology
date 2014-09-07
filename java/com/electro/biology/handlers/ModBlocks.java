package com.electro.biology.handlers;

import net.minecraft.block.Block;

import com.electro.biology.bacteria.machines.breeder;
import com.electro.biology.bacteria.machines.harvester;
import com.electro.biology.bacteria.machines.incubator;

public class ModBlocks {
    
	//Bacteria Machines
	public static Block incubator;
	public static Block harvester;
	public static Block breeder;
	
public static void loadBlocks()
{
	//Bacteria Machines
	incubator = new incubator().setBlockName("incubator"); 
	RegisterHelper.registerBlock(incubator);
	harvester = new harvester().setBlockName("harvester");
	RegisterHelper.registerBlock(harvester);
	breeder = new breeder().setBlockName("breeder");
	RegisterHelper.registerBlock(breeder);
}

}
