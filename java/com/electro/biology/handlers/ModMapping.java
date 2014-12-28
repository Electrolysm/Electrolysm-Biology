package com.electro.biology.handlers;

import com.electro.biology.bacteria.machines.tile.TileEntityIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntityharvester;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModMapping {

	public static void addMapping() {
		GameRegistry.registerTileEntity(TileEntityIdentifier.class, "TileEntityIdentifier");
		GameRegistry.registerTileEntity(TileEntityharvester.class, "TileEntityharvester");
		
	}

}
