package com.electro.biology.bacteria.machines.gui;

import org.lwjgl.opengl.GL11;

import com.electro.biology.bacteria.machines.container.Containerincubator;
import com.electro.biology.bacteria.machines.tile.TileEntityincubator;
import com.electro.biology.handlers.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GUIincubator extends GuiContainer {

	public TileEntityincubator entity;
	public GUIincubator(TileEntityincubator te, InventoryPlayer inv) {
		super(new Containerincubator(te, inv));
		entity = te;
	}

	private ResourceLocation GuiTexture=new ResourceLocation(Reference.MODID,"textures/gui/incubatorGUI.png");
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1F,1F,1F,1F);
		this.mc.renderEngine.bindTexture(this.GuiTexture);
		int x = (this.width - this.xSize)/2;
		int y = (this.height - this.ySize)/2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
        int progress = ((int)((entity.timer * 117) / entity.maxTimer));
        this.drawTexturedModalRect(x + 27, y + 27, 4, 172, progress , 46);
}

}
