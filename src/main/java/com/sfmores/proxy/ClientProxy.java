package com.sfmores.proxy;

import com.sfmores.render.SFMBlockRenderer;
import com.sfmores.render.SFMItemRenderer;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		super.preInit(preEvent);
	}
	
	public void init(FMLInitializationEvent event){
		super.init(event);
		
		SFMBlockRenderer.registerBlockRenderer();
		SFMItemRenderer.registerItemRender();
	}
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		super.postInit(postEvent);
	}
}
