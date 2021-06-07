package com.rimvillage.init;

import com.rimvillage.base.BaseVillagerEntity;
import com.rimvillage.core.RimVillageCore;
import com.rimvillage.entity.LumberJackEntity;

import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RimVillageCore.MOD_ID);

    // public static final RegistryObject<EntityType<BaseVillagerEntity>> LUMBERJACK_ENTITY = ENTITIES.register("lumber_jack", () -> new BaseVillagerEntity(EntityInit.ENTITIES, ));

    

}
