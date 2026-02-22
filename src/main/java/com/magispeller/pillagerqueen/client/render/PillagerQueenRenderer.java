package com.magispeller.pillagerqueen.client.render;

import com.magispeller.pillagerqueen.client.render.model.ModModelLayers;
import com.magispeller.pillagerqueen.client.render.model.PillagerQueenModel;
import com.magispeller.pillagerqueen.common.entity.PillagerQueenEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PillagerQueenRenderer extends MobRenderer<PillagerQueenEntity, PillagerQueenModel>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation("pillagerqueen", "textures/entity/pillagerqueen.png");
	  
	public PillagerQueenRenderer(Context p_174304_)
	{
		super(p_174304_, new PillagerQueenModel(p_174304_.bakeLayer(ModModelLayers.PILLAGER_QUEEN)), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(PillagerQueenEntity p_115812_) 
	{
		return TEXTURE;
	}
}
