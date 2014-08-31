package com.electro.biology.bacteria.machines;

import com.electro.biology.handlers.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Blockincubator extends Block{
	public IIcon frontIcon;
	public Blockincubator()
	{
		super(Material.iron);
		
	}
@Override 
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister reg)
{
	blockIcon = reg.registerIcon(Reference.MODID + ":incubator");
}
}
