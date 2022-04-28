package com.sfmores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SFMBlock  extends Block {
	public SFMBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(resistance);
	
	}
}
