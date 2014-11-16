package com.electro.biology.bacteria.machines.Recpies;

import java.util.HashMap;
import java.util.Map;

import electrolysm.api.items.RecipeStack;
import net.minecraft.item.ItemStack;


public class IdentifierRecipes {

	public static final IdentifierRecipes idbase = new IdentifierRecipes();

	private Map<RecipeStack, List<RecipeStack>> map = new HashMap<RecipeStack, List<RecipeStack>>();

	public static final IdentifierRecipes id(){
		return idbase;
	}
	private IdentifierRecipes(){
		List<ItemStack> recipeList = Arrays.asList(new ItemStack(result1), new ItemStack(result2));
		this.addRecipe(new ItemStack(input), recipeList);
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
		int randomInt = random.nextInt(outputs.size());
		List<RecipeStack> outputs = this.map.get(new RecipeStack(input));
		if(outputs!=null && outputs.get(randomInt) != null){
			return outputs.get(randomInt).getStackValue();
		}
		return null;
	}
}
