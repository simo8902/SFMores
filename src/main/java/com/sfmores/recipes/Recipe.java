package com.sfmores.recipes;

import com.sfmores.blocks.SFMBlocks;
import com.sfmores.items.SFMItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipe {
	public static void initRecipes()
	{
		
		registerToolRecipe(SFMItems.uraniumPickaxe, SFMItems.uraniumAxe, SFMItems.uraniumShovel, SFMItems.uraniumSword, SFMItems.uraniumIngot);
		
		System.out.println("Registered Crafting Recipes!");
	}

	public static void registerFurnaceRecipes(){
		GameRegistry.addSmelting(SFMBlocks.uraniumOre, new ItemStack(SFMItems.uraniumIngot), 0.9f);
	}
	
	public static void registerToolRecipe(Item pickaxe, Item axe, Item shovel, Item sword, Item ingot){
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] { "III"," S "," S ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { " II"," SI"," S ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II ","IS "," S ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { " I "," S "," S ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { "I  ","S  ","S  ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { "  I","  S","  S",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { " I "," I "," S ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "I  ","I  ","S  ",'I',ingot,'S',Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "  I","  I","  S",'I',ingot,'S',Items.blaze_rod});	
	}
}
