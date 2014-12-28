package com.electro.biology.handlers;

import com.electro.biology.bacteria.machines.container.ContainerBreeder;
import com.electro.biology.bacteria.machines.container.ContainerHarvester;
import com.electro.biology.bacteria.machines.container.ContainerIdentifier;
import com.electro.biology.bacteria.machines.gui.GUIBreeder;
import com.electro.biology.bacteria.machines.gui.GUIHarvester;
import com.electro.biology.bacteria.machines.gui.GuiIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntityIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntitybreeder;
import com.electro.biology.bacteria.machines.tile.TileEntityharvester;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHander implements IGuiHandler {
public static int IdentifierID = 0;
public static int harvesterID = 0;
public static int breederID = 0;
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x,y,z);
		if (entity instanceof TileEntityIdentifier && ID == IdentifierID){
			return new ContainerIdentifier((TileEntityIdentifier)entity,player.inventory);
		}
		if (entity instanceof TileEntityharvester && ID == harvesterID){
			return new ContainerHarvester((TileEntityharvester)entity,player.inventory);
		}
		if (entity instanceof TileEntitybreeder && ID == breederID){
			return new ContainerBreeder((TileEntitybreeder)entity,player.inventory);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x,y,z);
		if (entity instanceof TileEntityIdentifier && ID == IdentifierID){
			return new GuiIdentifier((TileEntityIdentifier)entity,player.inventory);
		}
		if (entity instanceof TileEntityharvester && ID == harvesterID){
			return new GUIHarvester((TileEntityharvester)entity,player.inventory);
	}
	if (entity instanceof TileEntitybreeder && ID == breederID){
		return new GUIBreeder((TileEntitybreeder)entity,player.inventory);
	}
	return null;
}
}
