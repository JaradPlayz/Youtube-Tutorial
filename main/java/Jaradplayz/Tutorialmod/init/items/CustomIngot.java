package Jaradplayz.Tutorialmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item 
{
	public CustomIngot(String Name)
	{
		setUnlocalizedName(Name);
		setRegistryName(Name);
		setCreativeTab(CreativeTabs.MISC);
	}
}
