package com.rimvillage.entity;

import com.rimvillage.base.BaseRimVillagerEntity;
import com.rimvillage.util.ProfessionType;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.world.World;

public class LumberJackEntity extends BaseRimVillagerEntity {

    public LumberJackEntity(EntityType<? extends VillagerEntity> entityType, World worldIn, String name, Boolean isMale) {
        super(entityType, worldIn, name, isMale);
        
    }

    @Override
    protected void initEntityAI() {
        
    }

}
