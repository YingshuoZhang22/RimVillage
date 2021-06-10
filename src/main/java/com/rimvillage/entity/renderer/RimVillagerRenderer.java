package com.rimvillage.entity.renderer;

import com.rimvillage.core.RimVillageCore;
import com.rimvillage.entity.RimVillagerEntity;
import com.rimvillage.entity.model.testModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import org.antlr.v4.runtime.misc.Utils;

public class RimVillagerRender extends MobRenderer<RimVillagerEntity, testModel> {
    public RimVillagerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new testModel(), 1F);
    }

    public RimVillagerRender(EntityRendererManager renderManagerIn, testModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(RimVillagerEntity entity) {
        return new ResourceLocation(RimVillageCore.MOD_ID, "");
    }
}
