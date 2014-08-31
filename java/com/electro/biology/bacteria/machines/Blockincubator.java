package com.electro.biology.bacteria.machines;

import com.electro.biology.handlers.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blockincubator extends Block{
	
	public Blockincubator()
	{
		super(Material.iron);
		setBlockTextureName(Reference.MODID + ";" + getUnlocalizedName().substring(5));
	}

}
