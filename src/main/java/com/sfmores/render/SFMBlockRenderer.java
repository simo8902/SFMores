package com.sfmores.render;

import com.sfmores.Global;
import com.sfmores.blocks.SFMBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class SFMBlockRenderer {
	public static void registerBlockRenderer(){
		regBlock(SFMBlocks.uraniumOre);
	}
	
	public static void regBlock(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Global.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
