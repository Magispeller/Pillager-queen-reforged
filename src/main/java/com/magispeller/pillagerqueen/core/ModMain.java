package com.magispeller.pillagerqueen.core;

import com.magispeller.pillagerqueen.core.registry.ModEntities;
import com.magispeller.pillagerqueen.core.registry.ModItems;
import com.magispeller.pillagerqueen.core.registry.ModSounds;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MOD_ID)
public class ModMain
{
	public static final String MOD_ID = "pillagerqueen";
	public static IEventBus MOD_EVENT_BUS;
	
	public ModMain() 
	{
		MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
		ModSounds.SOUND_EVENTS.register(MOD_EVENT_BUS);
		ModItems.ITEMS.register(MOD_EVENT_BUS);
		ModEntities.ENTITY_TYPES.register(MOD_EVENT_BUS);
	}
}
