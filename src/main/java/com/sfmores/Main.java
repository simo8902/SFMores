package com.sfmores;

import com.sfmores.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Global.MOD_ID, name = Global.MOD_NAME, version = Global.VERSION)
public class Main {

	
	@SidedProxy(clientSide = Global.NG_CLIENT_PROXY, serverSide = Global.NG_COMMON_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		 this.proxy.preInit(preEvent);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.proxy.init(event);   
		proxy.registerWorldGenerators();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		this.proxy.postInit(postEvent);
	}
}
