package com.electro.biology.handlers;

import com.electro.biology.bacteria.machines.container.ContainerIdentifier;
import com.electro.biology.bacteria.machines.container.Containerincubator;
import com.electro.biology.bacteria.machines.gui.GUIincubator;
import com.electro.biology.bacteria.machines.gui.GuiIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntityIdentifier;
import com.electro.biology.bacteria.machines.tile.TileEntityincubator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHander implements IGuiHandler {
public static int IdentifierID = 0;
public static int incubatorID = 0;
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x,y,z);
		if (entity instanceof TileEntityIdentifier && ID == IdentifierID){
			return new ContainerIdentifier((TileEntityIdentifier)entity,player.inventory);
		}
		if (entity instanceof TileEntityincubator && ID == incubatorID){
			return new Containerincubator((TileEntityincubator)entity,player.inventory);
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
		if (entity instanceof TileEntityincubator && ID == incubatorID){
			return new GUIincubator((TileEntityincubator)entity,player.inventory);
		}
		return null;
	}

}
