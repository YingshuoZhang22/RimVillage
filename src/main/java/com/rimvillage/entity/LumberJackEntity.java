package com.rimvillage.entity;

import com.rimvillage.base.BaseVillagerEntity;
import com.rimvillage.util.ProfessionType;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.world.World;

public class LumberJackEntity extends BaseVillagerEntity {

    public LumberJackEntity(EntityType<? extends VillagerEntity> entityType, World worldIn,
            ProfessionType professionType, String name, Boolean isMale) {
        super(entityType, worldIn, professionType, name, isMale);
        
    }

    @Override
    protected void initEntityAI() {
        
    }

}
