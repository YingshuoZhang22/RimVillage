package com.rimvillage.entity.renderer;

import com.rimvillage.core.RimVillageCore;
import com.rimvillage.entity.RimVillagerEntity;
import com.rimvillage.entity.model.testModel;
import com.rimvillage.init.EntityInit;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RimVillagerRenderer extends MobRenderer<RimVillagerEntity, testModel> {

    public RimVillagerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new testModel(), 1F);
    }

    public RimVillagerRenderer(EntityRendererManager renderManagerIn, testModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(RimVillagerEntity entity) {
        // TODO: 
        return new ResourceLocation(RimVillageCore.MOD_ID, "textures/entity/testTure.png");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ClientEventHandler {
        @SubscribeEvent
        public void onClientSetUpEvent(FMLClientSetupEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(EntityInit.RIMVILLAGER_ENTITY.get(), (EntityRendererManager manager) -> {
                return new RimVillagerRenderer(manager);
            });
        }
    }
}
