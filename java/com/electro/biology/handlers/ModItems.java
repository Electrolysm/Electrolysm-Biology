package com.electro.biology.handlers;

import net.minecraft.item.Item;

import com.electro.biology.bacteria.ItemAgar;
import com.electro.biology.bacteria.ItemPetriDish;
import com.electro.biology.bacteria.sampler;

public class ModItems {
	
	//Bacteria
	public static Item agar;
	public static Item petriDish;
	public static Item sampler;
	
	//Bacteria Samples
	public static Item GrassSample;
	public static Item TreeSample;
	public static Item iceSample;
	public static Item netherSample;
	public static Item swampSample;

	
	public static void loadItems()
	{
		//Bacteria 
		agar = new ItemAgar();
		RegisterHelper.registerItem(agar);
		petriDish = new ItemPetriDish();
		RegisterHelper.registerItem(petriDish);
		sampler = new sampler();
		RegisterHelper.registerItem(sampler);
	}

}