package com.electro.biology.handlers;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
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
		generateEnd(world, rand, chunkX * 16, chunkZ * 16);
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
    private void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {    	
    	if(world.getBiomeGenForCoords(chunkX, chunkZ) == BiomeGenBase.plains){
    		for (int i = 0; i < 0.01; i++)
        	{
            		int xCoord = chunkX + random.nextInt(16);
            		int yCoord = getSurface(world, chunkX + random.nextInt(16), chunkZ + random.nextInt(16));
            		int zCoord = chunkZ + random.nextInt(16);
            		(new WorldGenMinable(ModBlocks.colonyGrass, 3, Blocks.grass)).generate(world, random, xCoord, yCoord, zCoord);
        	}
    	}
    	if(world.getBiomeGenForCoords(chunkX, chunkZ) == BiomeGenBase.swampland){
        for (int i = 0; i < 0.1; i++)
        {
            int xCoord = chunkX + random.nextInt(16);
            int yCoord = getSurface(world, chunkX + random.nextInt(16), chunkZ + random.nextInt(16));
            int zCoord = chunkZ + random.nextInt(16);
            (new WorldGenMinable(ModBlocks.colonySwamp, 3, Blocks.grass)).generate(world, random, xCoord, yCoord, zCoord);
        }
    	}
        if(world.getBiomeGenForCoords(chunkX, chunkZ) == BiomeGenBase.forest){
            for (int i = 0; i < 5; i++)
            {
                int xCoord = chunkX + random.nextInt(16);
                int yCoord = getSurface(world, chunkX + random.nextInt(16), chunkZ + random.nextInt(16));
                int zCoord = chunkZ + random.nextInt(16);
                (new WorldGenMinable(ModBlocks.colonyTree, 3, Blocks.leaves)).generate(world, random, xCoord, yCoord, zCoord);
            }
        }
                for (int i = 0; i < 1; i++)
                {
                    int xCoord = chunkX + random.nextInt(16);
                    int yCoord = getSurface(world, chunkX + random.nextInt(16), chunkZ + random.nextInt(16));
                    int zCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ModBlocks.colonyIce, 3, Blocks.snow_layer)).generate(world, random, xCoord, yCoord, zCoord);

                }
    }

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
    	for (int i = 0; i < 25; i++)
    	{
        		int xCoord = chunkX + random.nextInt(16);
        		int yCoord = random.nextInt(256);
        		int zCoord = chunkZ + random.nextInt(16);
        		(new WorldGenMinable(ModBlocks.colonyNether, 3, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord);
    	}
	}
    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
       	for (int i = 0; i < 1; i++)
    	{
        		int xCoord = chunkX + random.nextInt(16);
        		int yCoord = getSurface(world, chunkX + random.nextInt(16), chunkZ + random.nextInt(16));
        		int zCoord = chunkZ + random.nextInt(16);
        		(new WorldGenMinable(ModBlocks.colonyEnd, 3, Blocks.end_stone)).generate(world, random, xCoord, yCoord, zCoord);
	}
	}

}
