package com.electro.biology.bacteria;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import net.minecraft.item.Item;

public class petriDish extends Item {
	
	public petriDish()
	{
		super();
		setUnlocalizedName("petriDish");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
	}

}
