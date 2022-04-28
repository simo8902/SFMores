package com.sfmores.worldgen;

import java.util.Random;

import com.sfmores.blocks.SFMBlocks;
import com.sfmores.items.SFMItems;
import com.sfmores.items.UraniumPickaxe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {

	@SubscribeEvent
	public void addBlockDrop(HarvestDropsEvent event)
	{
		if(event.state.getBlock() == SFMBlocks.uraniumOre)
		{
			Random rand = new Random();
			
			ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
			if(holding != null && holding.getItem() instanceof UraniumPickaxe)
			{
				event.drops.clear();
				event.drops.add(new ItemStack(SFMBlocks.uraniumOre, rand.nextInt(2)));
			}
		}
	}
}
