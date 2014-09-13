package com.electro.biology.handlers;

import net.minecraft.block.Block;

import com.electro.biology.bacteria.colonies.colonyEnd;
import com.electro.biology.bacteria.colonies.colonyGrass;
import com.electro.biology.bacteria.colonies.colonyIce;
import com.electro.biology.bacteria.colonies.colonyInfected;
import com.electro.biology.bacteria.colonies.colonyNether;
import com.electro.biology.bacteria.colonies.colonySwamp;
import com.electro.biology.bacteria.colonies.colonyTree;
import com.electro.biology.bacteria.machines.breeder;
import com.electro.biology.bacteria.machines.harvester;
import com.electro.biology.bacteria.machines.incubator;

public class ModBlocks {
    
	//Bacteria Machines
	public static Block incubator;
	public static Block harvester;
	public static Block breeder;
	
	//Bacteria Colonies
	public static Block colonyGrass;
	public static Block colonyTree;
	public static Block colonyIce;
	public static Block colonyNether;
	public static Block colonySwamp;
	public static Block colonyInfected;
	public static Block colonyEnd;
	
	
public static void loadBlocks()
{
	//Bacteria Machines
	incubator = new incubator().setBlockName("incubator"); 
	RegisterHelper.registerBlock(incubator);
	harvester = new harvester().setBlockName("harvester");
	RegisterHelper.registerBlock(harvester);
	breeder = new breeder().setBlockName("breeder");
	RegisterHelper.registerBlock(breeder);
	
	//Bacteria Colonies
	colonyGrass = new colonyGrass().setBlockName("colonyGrass");
	RegisterHelper.registerBlock(colonyGrass);
	colonyTree = new colonyTree().setBlockName("colonyTree");
	RegisterHelper.registerBlock(colonyTree);
	colonyIce = new colonyIce().setBlockName("colonyIce");
	RegisterHelper.registerBlock(colonyIce);
	colonyNether = new colonyNether().setBlockName("colonyNether");
	RegisterHelper.registerBlock(colonyNether);
	colonySwamp = new colonySwamp().setBlockName("colonySwamp");
	RegisterHelper.registerBlock(colonySwamp);
	colonyInfected = new colonyInfected().setBlockName("colonyInfected");
	RegisterHelper.registerBlock(colonyInfected);
	colonyEnd = new colonyEnd().setBlockName("colonyEnd");
	RegisterHelper.registerBlock(colonyEnd);
}

}
