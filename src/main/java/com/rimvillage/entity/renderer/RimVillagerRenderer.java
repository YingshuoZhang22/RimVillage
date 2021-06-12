package com.rimvillage.entity.renderer;

import com.rimvillage.core.RimVillageCore;
import com.rimvillage.entity.RimVillagerEntity;
import com.rimvillage.entity.model.testModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
public class RimVillagerRenderer extends MobRenderer<RimVillagerEntity, testModel> {

    public RimVillagerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new testModel(), 1F);
    }

    public RimVillagerRenderer(EntityRendererManager renderManagerIn, testModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(RimVillagerEntity entity) {
        return new ResourceLocation(RimVillageCore.MOD_ID, "textures/entity/testTure.png");
    }

    
    @Override
    public void render(RimVillagerEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }
}
