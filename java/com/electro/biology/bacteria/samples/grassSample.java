package com.electro.biology.bacteria.samples;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

public class grassSample extends Item {
	
	public grassSample() 
	{
		super();
		setUnlocalizedName("grassSample");
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
   
		

    @Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 7; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
