package com.electro.biology.handlers;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenElectroBio implements IWorldGenerator {
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:	
			generateSurface(world, rand, chunkX * 16, chunkZ * 16);
		case 1:
			
		}
		
	}
    private static int getSurface(World world, int x, int z)
    {
        int height = 256;
        boolean continueQ = true;

        while (continueQ)
        {
            if (world.isAirBlock(x, height, z))
            {
                height = height - 1;
            }
            else
            {
                continueQ = false;
            }
        }

        return height + 1;
    }
	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			 int randPosY = getSurface(world, chunkX + rand.nextInt(16), chunkZ + rand.nextInt(16))+1;
			 int randPosZ = chunkZ + rand.nextInt(16);
			
			 (new WorldGenMinable(ModBlocks.colonyGrass, 10, Blocks.air)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
	}

	private void generateNether(World world, Random rand, int i, int j) {
		
	}

}
