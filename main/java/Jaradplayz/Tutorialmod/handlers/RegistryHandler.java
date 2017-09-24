package Jaradplayz.Tutorialmod.handlers;

import Jaradplayz.Tutorialmod.init.Blockinit;
import Jaradplayz.Tutorialmod.init.ItemInit;

public class RegistryHandler 
{
	public static void Client()
	{
		ItemInit.register();
		Blockinit.registerRenders();
	}
	
	public static void Common()
	{
		ItemInit.init();
		Blockinit.init();
		Blockinit.register();
	}
}
