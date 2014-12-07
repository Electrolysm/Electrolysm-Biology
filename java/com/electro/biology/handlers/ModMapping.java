package com.electro.biology.handlers;

import com.electro.biology.bacteria.machines.tile.TileEntityIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntityincubator;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModMapping {

	public static void addMapping() {
		GameRegistry.registerTileEntity(TileEntityIdentifier.class, "TileEntityIdentifier");
		GameRegistry.registerTileEntity(TileEntityincubator.class, "TileEntityincubator");
		
	}

}
