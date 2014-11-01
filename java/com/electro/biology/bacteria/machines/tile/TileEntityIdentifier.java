package com.electro.biology.bacteria.machines.tile;

import electrolysm.api.powerSystem.prefab.TileEntityMachine;
import net.minecraft.tileentity.TileEntity;

public class TileEntityIdentifier extends TileEntityMachine {

	@Override 
	public void updateEntity(){
		super.updateEntity();
		if(worldObj.isRemote == true){
			return;
		}
	}
}
