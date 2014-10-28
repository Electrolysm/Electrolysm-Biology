package com.electro.biology.bacteria.colonies;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.world.World;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

public class algae extends Block{
	public algae()
	{
		super(Material.cake);
		setBlockName("algae");
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setStepSound(soundTypeStone);
		setHardness(1.0F);
		setResistance(5.0F);
        float f = 0.5F;
        float f1 = 0.015625F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
	}
    public int getRenderType()
    {
        return 23;
    }
@Override
public boolean isOpaqueCube()
    {
        return false;
}
}