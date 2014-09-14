package com.electro.biology.bacteria.colonies;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

public class colonyTree extends Block{
	
	public colonyTree()
	{
		super(Material.leaves);
		setBlockName("colonyTree");
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setStepSound(soundTypeGrass);
		setHardness(1.0F);
		setResistance(5.0F);
	}
	 @Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	 {
		 return new ArrayList<ItemStack>();
	 }
	 @Override
	 public boolean isOpaqueCube()
	     {
	         return false;
	 }
}