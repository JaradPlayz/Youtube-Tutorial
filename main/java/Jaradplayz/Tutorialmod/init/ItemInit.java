package Jaradplayz.Tutorialmod.init;

import Jaradplayz.Tutorialmod.Reference;
import Jaradplayz.Tutorialmod.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
	public static Item tutorial_ingot;
	
	public static void init()
	{
		tutorial_ingot = new CustomIngot("tutorial_ingot");
	}
	
	public static void register()
	{
		registerItem(tutorial_ingot);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
 