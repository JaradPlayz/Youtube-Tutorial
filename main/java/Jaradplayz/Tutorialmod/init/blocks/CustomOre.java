package Jaradplayz.Tutorialmod.init.blocks;

import net.minecraft.block.Block;

public class CustomOre extends CustomBlock 
{

	public CustomOre(String name, Float hardness, Float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
}
