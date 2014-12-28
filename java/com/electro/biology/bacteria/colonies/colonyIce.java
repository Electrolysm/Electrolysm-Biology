package com.electro.biology.bacteria.colonies;

import java.util.ArrayList;
import java.util.List;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class colonyIce extends Block{
	public colonyIce()
	{
		super(Material.ice);
		setBlockName("colonyIce");
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setStepSound(soundTypeSnow);
		setHardness(1.0F);
		setResistance(5.0F);
        float f = 0.5F;
        float f1 = 0.015625F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
	}
	 public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	 {
		 return new ArrayList<ItemStack>();
	 }
}