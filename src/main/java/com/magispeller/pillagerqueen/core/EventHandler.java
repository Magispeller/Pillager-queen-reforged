package com.magispeller.pillagerqueen.core;

import com.magispeller.pillagerqueen.common.entity.PillagerQueenEntity;
import com.magispeller.pillagerqueen.core.registry.ModEntities;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler 
{
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) 
    {
    	event.put(ModEntities.PILLAGER_QUEEN.get(), PillagerQueenEntity.createAttributes().build());
    }
}
