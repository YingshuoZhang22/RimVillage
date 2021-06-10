package com.rimvillage.base;

import net.minecraft.entity.Entity;

import com.rimvillage.util.ProfessionType;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.villager.VillagerType;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public class BaseRimVillagerEntity extends VillagerEntity {

    protected final String NAME;
    protected final boolean ISMALE;
    protected int age;
    protected BlockPos bedPosition = null;
    protected BlockPos homeFrame = null;

    public BaseRimVillagerEntity(EntityType<? extends VillagerEntity> entityType, World worldIn, String name, Boolean isMale) {
        super(entityType, worldIn);
        this.NAME = name;
        this.ISMALE = isMale;
        this.age = 0;
    }
    
    protected void initEntityAI() {
        
    }

}