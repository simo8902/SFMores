package com.sfmores.proxy;

import com.sfmores.blocks.SFMBlocks;
import com.sfmores.items.SFMItems;
import com.sfmores.recipes.Recipe;
import com.sfmores.worldgen.DropHandler;
import com.sfmores.worldgen.WorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		SFMBlocks.initBlocks();
		SFMItems.initItems();
		
		Recipe.initRecipes();
		Recipe.registerFurnaceRecipes();
	}
	
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
	}

	public void registerWorldGenerators(){
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}
}
