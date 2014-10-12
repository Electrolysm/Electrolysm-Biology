package com.electro.biology.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.electro.biology.bacteria.agar;
import com.electro.biology.bacteria.petriDish;
import com.electro.biology.bacteria.sampler;
import com.electro.biology.bacteria.pertiDIshes.endPetri;
import com.electro.biology.bacteria.pertiDIshes.grassPetri;
import com.electro.biology.bacteria.pertiDIshes.icePetri;
import com.electro.biology.bacteria.pertiDIshes.netherPetri;
import com.electro.biology.bacteria.pertiDIshes.swampPetri;
import com.electro.biology.bacteria.pertiDIshes.treePetri;
import com.electro.biology.bacteria.samples.endSample;
import com.electro.biology.bacteria.samples.grassSample;
import com.electro.biology.bacteria.samples.iceSample;
import com.electro.biology.bacteria.samples.infectedSample;
import com.electro.biology.bacteria.samples.netherSample;
import com.electro.biology.bacteria.samples.swampSample;
import com.electro.biology.bacteria.samples.treeSample;

public class ModItems {
	
	//Bacteria
	public static Item agar;
	public static Item petriDish;
	public static Item sampler;
	
	//Bacteria Samples
	public static Item grassSample;
	public static Item treeSample;
	public static Item iceSample;
	public static Item netherSample;
	public static Item swampSample;
	//public static Item infectedSample;
	public static Item endSample;
	
//Bacteria perti dish's
	public static Item grassPetri;
	public static Item treePetri;
	public static Item icePetri;
	public static Item netherPetri;
	public static Item swampPetri;
	public static Item endPetri;
	
	public static void loadItems()
	{
		//Bacteria 
		agar = new agar();
		RegisterHelper.registerItem(agar);
		petriDish = new petriDish();
		RegisterHelper.registerItem(petriDish);
		sampler = new sampler();
		RegisterHelper.registerItem(sampler);
		
		//Bacteria Samples
		grassSample = new grassSample();
		RegisterHelper.registerItem(grassSample);
		treeSample = new treeSample();
		RegisterHelper.registerItem(treeSample);
		iceSample = new iceSample();
		RegisterHelper.registerItem(iceSample);
		netherSample = new netherSample();
		RegisterHelper.registerItem(netherSample);
		swampSample = new swampSample();
		RegisterHelper.registerItem(swampSample);
		//infectedSample = new infectedSample();
		//RegisterHelper.registerItem(infectedSample);
		endSample = new endSample();
		RegisterHelper.registerItem(endSample);
		
		//Bacteria perti dish's
		grassPetri = new grassPetri();
		RegisterHelper.registerItem(grassPetri);
		treePetri = new treePetri();
		RegisterHelper.registerItem(treePetri);
		icePetri = new icePetri();
		RegisterHelper.registerItem(icePetri);
		netherPetri = new netherPetri();
		RegisterHelper.registerItem(netherPetri);
		swampPetri = new swampPetri();
		RegisterHelper.registerItem(swampPetri);
		endPetri = new endPetri();
		RegisterHelper.registerItem(endPetri);
		
	}

}