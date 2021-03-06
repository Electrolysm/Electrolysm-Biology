package com.electro.biology.bacteria.machines;

import java.util.List;
import java.util.Random;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.bacteria.machines.tile.TileEntityharvester;
import com.electro.biology.handlers.GUIHander;
import com.electro.biology.handlers.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class harvester extends BlockContainer{
	public IIcon frontIcon;
	public harvester()
	{
		super(Material.iron);
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(10.0F);
	}
	
	@Override 
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg)
	{
		blockIcon = reg.registerIcon(Reference.MODID + ":machine");
		frontIcon = reg.registerIcon(Reference.MODID + ":harvesterFront");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side,int meta){
		if (side == meta){
			return frontIcon;
		} else {
			return blockIcon;
		}
	}
	
	@Override
    public void getSubBlocks(Item id, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(this, 1, 3));
    }
    
    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }

    private void setDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            Block l = par1World.getBlock(par2, par3, par4 - 1);
            Block i1 = par1World.getBlock(par2, par3, par4 + 1);
            Block j1 = par1World.getBlock(par2 - 1, par3, par4);
            Block k1 = par1World.getBlock(par2 + 1, par3, par4);
            byte b0 = 3;

            if (l.isOpaqueCube() && !i1.isOpaqueCube())
            {
                b0 = 3;
            }

            if (i1.isOpaqueCube() && !l.isOpaqueCube())
            {
                b0 = 2;
            }

            if (j1.isOpaqueCube() && !k1.isOpaqueCube())
            {
                b0 = 5;
            }

            if (k1.isOpaqueCube() && !j1.isOpaqueCube())
            {
                b0 = 4;
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TileEntityharvester(2);
	}
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, 
    		int side, float xSide, float ySide, float zSide){
    	if(!player.isSneaking()){
    		player.openGui(electrolysm_biology.GUIInstance, GUIHander.harvesterID, world, x, y, z);
    		return true;
    	}
    	return false;
    }

}


