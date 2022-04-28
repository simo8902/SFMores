package com.sfmores.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SFMItems {
	public static ToolMaterial URANIUMAXE = EnumHelper.addToolMaterial("URANIUMAXE", 3, 2100, 20.0F, 8.0F, 35);
	public static ToolMaterial URANIUMPICKAXE = EnumHelper.addToolMaterial("URANIUMPICKAXE", 3, 2100, 17.0F, 2.0F, 35);
	public static ToolMaterial URANIUMSHOVEL = EnumHelper.addToolMaterial("URANIUMSHOVEL", 3, 1500, 15.0F, 1.0F, 20);
	public static ToolMaterial URANIUMSWORD = EnumHelper.addToolMaterial("URANIUMSWORD", 3, 500, 5.0F, 15.0F, 20);
	
	public static Item uraniumAxe;
	public static Item uraniumPickaxe;
	public static Item uraniumSword;
	public static Item uraniumShovel;
	
	public static Item uraniumIngot;
	
	public static void initItems(){
		GameRegistry.registerItem(uraniumAxe = new UraniumAxe("uraniumAxe", URANIUMAXE), "uraniumAxe");
		GameRegistry.registerItem(uraniumPickaxe = new UraniumPickaxe("uraniumPickaxe", URANIUMPICKAXE), "uraniumPickaxe");
		GameRegistry.registerItem(uraniumSword = new UraniumSword("uraniumSword", URANIUMSWORD), "uraniumSword");
		GameRegistry.registerItem(uraniumShovel = new UraniumShovel("uraniumShovel", URANIUMSHOVEL), "uraniumShovel");

		GameRegistry.registerItem(uraniumIngot = new SFMItem("uraniumIngot"), "uraniumIngot");

	}
}
