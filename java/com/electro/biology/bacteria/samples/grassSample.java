package com.electro.biology.bacteria.samples;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import net.minecraft.item.Item;

public class grassSample extends Item {
	
	public grassSample()
	{
		super();
		setUnlocalizedName("grassSample");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
	}

}
