package com.rimvillage.init;

import com.rimvillage.entity.renderer.RimVillagerRenderer;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {
    
    
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.RIMVILLAGER_ENTITY.get(), RimVillagerRenderer::new);
    }
}
