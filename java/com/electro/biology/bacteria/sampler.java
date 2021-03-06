package com.electro.biology.bacteria;

import com.electro.biology.electrolysm_biology;
import com.electro.biology.handlers.ModBlocks;
import com.electro.biology.handlers.ModItems;
import com.electro.biology.handlers.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;

public class sampler extends Item {
	
	public sampler()
	{
		super();
		setUnlocalizedName("sampler");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(electrolysm_biology.TabElectrolysm_Biology);
	}

    public void giveItem(EntityPlayer player, Item item) {
        if (player.inventory.getFirstEmptyStack() != (-1)) {
            player.inventory.addItemStackToInventory(new ItemStack(item));
        } else {
            player.dropPlayerItemWithRandomChoice(new ItemStack(item), false);
        }
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if (world.getBlock(x, y, z) == ModBlocks.colonyGrass)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.grassSample);
            return true;
        }
        if (world.getBlock(x, y, z) == ModBlocks.colonyEnd)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.endSample);
            return true;
        }
        if (world.getBlock(x, y, z) == ModBlocks.colonyIce)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.iceSample);
            return true;
        }
        // if (world.getBlock(x, y, z) == ModBlocks.colonyInfected)
     //   {
       //     world.setBlockToAir(x, y, z);
      //      this.giveItem(player, ModItems.infectedSample);
      //      return true;
     //   }
        if (world.getBlock(x, y, z) == ModBlocks.colonyNether)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.netherSample);
            return true;
        }  if (world.getBlock(x, y, z) == ModBlocks.colonySwamp)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.swampSample);
            return true;
        }  if (world.getBlock(x, y, z) == ModBlocks.colonyTree)
        {
            world.setBlockToAir(x, y, z);
            this.giveItem(player, ModItems.treeSample);
            return true;
        }
            if (world.getBlock(x, y, z) == ModBlocks.algae)
            {
                world.setBlockToAir(x, y, z);
                this.giveItem(player, ModItems.algaeSample);
                return true;
            }
            {
        return false;
    }

}
}