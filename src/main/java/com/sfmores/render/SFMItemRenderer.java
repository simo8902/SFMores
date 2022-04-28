package com.sfmores.render;

import com.sfmores.Global;
import com.sfmores.items.SFMItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class SFMItemRenderer {
	public static void registerItemRender(){
		regItem(SFMItems.uraniumIngot);
		regItem(SFMItems.uraniumAxe);
		regItem(SFMItems.uraniumPickaxe);
		regItem(SFMItems.uraniumShovel);
		regItem(SFMItems.uraniumSword);

	}
	
	public static void regItem(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Global.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
