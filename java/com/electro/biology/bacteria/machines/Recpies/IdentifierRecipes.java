package com.electro.biology.bacteria.machines.Recpies;

import java.util.HashMap;
import java.util.Map;

import electrolysm.api.items.RecipeStack;
import net.minecraft.item.ItemStack;


public class IdentifierRecipes {

public static final IdentifierRecipes idbase = new IdentifierRecipes();

private Map<RecipeStack,RecipeStack> map = new HashMap<RecipeStack,RecipeStack>();

public static final IdentifierRecipes id(){
	return idbase;
}
private IdentifierRecipes(){
	this.addRecipe(new ItemStack(input), new ItemStack(result));
}
public void addRecipe(ItemStack input, ItemStack output) {
	this.map.put(new RecipeStack( input), new RecipeStack(output));
}
public ItemStack getResult(ItemStack input){
	if(input == null){
		return null;
	}
	RecipeStack output = this.map.get(new RecipeStack(input));
	if(output!=null){
		return output.getStackValue();
	}
	return null;
}
}
