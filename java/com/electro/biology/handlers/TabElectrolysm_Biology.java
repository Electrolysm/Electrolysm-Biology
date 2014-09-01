package com.electro.biology.handlers;

import com.electro.biology.electrolysm_biology;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabElectrolysm_Biology extends CreativeTabs {

	String TabLabel;
	
    public TabElectrolysm_Biology(int position, String tabID)
    {
        super(position, tabID); //The constructor for your tab
        TabLabel = tabID;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getIconItemStack()
    {
        return new ItemStack(electrolysm_biology.petriDish, 1, 1);
    }

    public Item getTabIconBlock() { return electrolysm_biology.petriDish; }


    public String getTranslatedTabLabel()
    {
        return TabLabel; //The name of the tab ingame
    }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
}