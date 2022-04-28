package com.sfmores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SFMItem extends Item {
	public SFMItem(String name)
	{
		super();
		
		this.setUnlocalizedName(name);
		// dev - remove after release
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
