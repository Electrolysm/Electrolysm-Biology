package com.electro.biology.bacteria.samples;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class grassSample extends Item {
	
	public grassSample() 
	{
		super();
		setUnlocalizedName("grassSample");
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
@SideOnly(Side.CLIENT)
public void addInformation(ItemStack stack, EntityPlayer Par2, List Par3, boolean Par4) {
	if (stack.getItemDamage() == 0)Par3.add("Unidentified");
	if (stack.getItemDamage() == 1)Par3.add("Growth rate: 1 "
			+ "Productivity: 1");
}

public String getItemStackDisplayName(ItemStack stack)
{
    return ("" + StatCollector.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
}

    @Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 9; i ++) {
			list.add(new ItemStack(item, 1, i)); 
		}
    }

}