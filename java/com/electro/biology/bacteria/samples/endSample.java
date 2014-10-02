package com.electro.biology.bacteria.samples;


import java.util.List;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class endSample extends Item {
	
	public endSample()
	{
		super();
		setUnlocalizedName("endSample");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
	}
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack Par1, EntityPlayer Par2, List Par3, boolean Par4) {
	    	Par3.add("Ender Bacteria Sample");
	    }

	    public String getItemStackDisplayName(ItemStack par1)
	    {
	        return ("" + StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(par1) + ".name")).trim();
	    }
}


