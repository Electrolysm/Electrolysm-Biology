
package com.electro.biology.handlers;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ElectroBioWorld {
	
	public static void mainRegistery(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new WorldGenElectroBio(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}

}