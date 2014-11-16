package com.electro.biology.bacteria.machines.tile;

import java.util.Random;

import com.electro.biology.bacteria.machines.Recpies.IdentifierRecipes;

import electrolysm.api.powerSystem.prefab.TileEntityMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityIdentifier extends TileEntityMachine implements IInventory {

	 public int timer = 0;
	 public int maxTimer = 10 * 20;
	
    @Override
    public void updateEntity() {
        super.updateEntity();
        if (worldObj.isRemote) {
            return;

        }
        
        ItemStack input = this.getStackInSlot(0);
        ItemStack result = IdentifierRecipes.id().getResult(input, new Random());
          if(input!= null && result != null){
        	  if (timer == maxTimer){
        	  	timer = 0;
        		  if(this.getStackInSlot(1) == null){
        			  this.setInventorySlotContents(1, result);
        			  this.decrStackSize(0, 1);
        		  }
        		  else{
        		  	int out= this.getStackInSlot(1).stackSize;
        			if (out + result.stackSize <= 64 && result.isItemEqual(this.getStackInSlot(1))){
        				this.setInventorySlotContents(1, new ItemStack(result.getItem(), out + result.stackSize,
        				result.getItemDamage());
					this.decrStackSize(0, 1);
				}
        		  }
        	  }
        	  else{
        	  	timer++;
        	  }
          }
          else{
          	timer = 0;
          }
   
    }

    public ItemStack[] inventory;

    public TileEntityIdentifier(int invSize) {
        super();
        inventory = new ItemStack[invSize];
    }

    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventory[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        markDirty();
        ItemStack stack = getStackInSlot(slot);

        if (stack != null) {
            if (stack.stackSize <= amount) {
                setInventorySlotContents(slot, null);
            } else {
                stack = stack.splitStack(amount);

                if (stack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }

        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        markDirty();
        ItemStack stack = getStackInSlot(slot);

        if (stack != null) {
            setInventorySlotContents(slot, null);
        }

        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        this.markDirty();
        inventory[slot] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return true;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return false;
    }

    int[] slots_bottom;
    int[] slots_top;
    int[] slots_sides;

    public int[] getAccessibleSlotsFromSide(int side) {
        if (side == 0) {
            return slots_bottom;
        } else if (side == 1) {
            return slots_top;
        } else {
            return slots_sides;
        }
    }

    public boolean canInsertItem(int slot, ItemStack item, int side) {
        return this.isItemValidForSlot(slot, item);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);

        // Read in the ItemStacks in the inventory from NBT
        NBTTagList tagList = nbtTagCompound.getTagList("Items", 10);
        inventory = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tagCompound = tagList.getCompoundTagAt(i);
            byte slotIndex = tagCompound.getByte("Slot");
            if (slotIndex >= 0 && slotIndex < inventory.length) {
                inventory[slotIndex] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);

        // Write the ItemStacks in the inventory to NBT
        NBTTagList tagList = new NBTTagList();
        for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
            if (inventory[currentIndex] != null) {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", (byte) currentIndex);
                inventory[currentIndex].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }

        nbtTagCompound.setTag("Items", tagList);
    }

    @Override
    public void closeInventory() {
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public void openInventory() {
    }
}
