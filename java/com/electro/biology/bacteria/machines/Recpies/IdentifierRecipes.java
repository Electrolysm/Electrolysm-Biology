package com.electro.biology.bacteria.machines.Recpies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.electro.biology.handlers.ModItems;

import electrolysm.api.items.RecipeStack;
import net.minecraft.item.ItemStack;


public class IdentifierRecipes {

	public static final IdentifierRecipes idbase = new IdentifierRecipes();

	private Map<RecipeStack, List<RecipeStack>> map = new HashMap<RecipeStack, List<RecipeStack>>();

	public static final IdentifierRecipes id(){
		return idbase;
	}
	private IdentifierRecipes(){
		List<ItemStack> recipeList = Arrays.asList(new ItemStack(ModItems.grassSample, 1, 1), new ItemStack(ModItems.grassSample, 1, 2), 
				new ItemStack(ModItems.grassSample, 1, 3), new ItemStack(ModItems.grassSample, 1, 4), new ItemStack(ModItems.grassSample, 1, 5),
				new ItemStack(ModItems.grassSample, 1, 6), new ItemStack(ModItems.grassSample, 1, 7), new ItemStack(ModItems.grassSample, 1, 8),
				new ItemStack(ModItems.grassSample, 1, 9));
		this.addRecipe(new ItemStack(ModItems.grassSample, 1, 0), recipeList);
	}
	public void addRecipe(ItemStack input, List<ItemStack> outputs) {
		List<RecipeStack> list = new ArrayList<RecipeStack>();
		for(int i = 0; i < outputs.size(); i++){
			list.add(new RecipeStack(outputs.get(i)));
		}
		this.map.put(new RecipeStack( input), list);
	}
	public ItemStack getResult(ItemStack input, Random random){
		if(input == null){
			return null;
		}
		List<RecipeStack> outputs = this.map.get(new RecipeStack(input));
		int randomInt = random.nextInt(outputs.size());
		if(outputs!=null && outputs.get(randomInt) != null){
			return outputs.get(randomInt).getStackValue();
		}
		return null;
	}
}
