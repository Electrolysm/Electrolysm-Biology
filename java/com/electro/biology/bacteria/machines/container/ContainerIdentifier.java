package com.electro.biology.bacteria.machines.container;

import com.electro.biology.bacteria.machines.tile.TileEntityIdentifier;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerIdentifier extends Container {
 
	private TileEntityIdentifier entity;

	public ContainerIdentifier(TileEntityIdentifier te, InventoryPlayer inv) {
		this.entity = te;
		this.addSlotToContainer(new Slot(te,0,8,35));
		this.addSlotToContainer(new Slot(te,1,151,35));
		
		for(int x = 0; x < 3; x++){
			for(int y =0; y < 9; y++){
				this.addSlotToContainer(new Slot(inv,y+x*9+9,8+y*18,84+x*18));
			}
		}
		for(int a = 0; a < 9; a++){
			this.addSlotToContainer(new Slot(inv,a,8+a*18,142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		
		return true;
																																						
	}

}
