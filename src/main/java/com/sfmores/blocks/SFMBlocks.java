package com.sfmores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SFMBlocks {
	public static Block uraniumOre;
	
	public static void initBlocks()
	{
		GameRegistry.registerBlock(uraniumOre = new SFMBlock("uraniumOre", Material.iron, 5, 10), "uraniumOre");
	}
}
