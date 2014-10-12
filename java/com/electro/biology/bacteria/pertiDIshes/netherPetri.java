package com.electro.biology.bacteria.pertiDIshes;


import java.util.List;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.Reference;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class netherPetri extends Item {
	
	public netherPetri()
	{
		super();
		setUnlocalizedName("netherPetri");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer Par2, List Par3, boolean Par4) {
		
		if (stack.getItemDamage() == 0){
			Par3.add("Growth rate: 1");
			Par3.add("Productivity: 1"); }
		
	    if (stack.getItemDamage() == 1){
				Par3.add("Growth rate: 1");
				Par3.add("Productivity: 2"); }
	    
	    if (stack.getItemDamage() == 2){
				Par3.add("Growth rate: 1");
				Par3.add("Productivity: 3"); }
	    
	    if (stack.getItemDamage() == 3){
				Par3.add("Growth rate: 2");
				Par3.add("Productivity: 1"); }
	    
	    if (stack.getItemDamage() == 4){
				Par3.add("Growth rate: 2");
				Par3.add("Productivity: 2"); }
	    
	    if (stack.getItemDamage() == 5){
				Par3.add("Growth rate: 2");
				Par3.add("Productivity: 3"); }
	    
	    if (stack.getItemDamage() == 6){
				Par3.add("Growth rate: 3");
				Par3.add("Productivity: 1"); }
	    
	    if (stack.getItemDamage() == 7){
				Par3.add("Growth rate: 3");
				Par3.add("Productivity: 2"); }
	    
	    if (stack.getItemDamage() == 8){
				Par3.add("Growth rate: 3");
				Par3.add("Productivity: 3"); }
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
