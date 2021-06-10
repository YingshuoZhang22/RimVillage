package com.rimvillage.init;

import com.rimvillage.core.RimVillageCore;

import com.rimvillage.entity.RimVillagerEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RimVillageCore.MOD_ID);

    // public static final RegistryObject<EntityType<BaseVillagerEntity>> LUMBERJACK_ENTITY = ENTITIES.register("lumber_jack", () -> new BaseVillagerEntity(EntityInit.ENTITIES, ));

    public static final RegistryObject<EntityType<RimVillagerEntity>> RIMVILLAGER_ENTITY = ENTITIES.register("rimvillager", 
            () -> EntityType.Builder.create(RimVillagerEntity::new, EntityClassification.MISC).size(1.5F, 3).build("rimvillager"));

    
}
