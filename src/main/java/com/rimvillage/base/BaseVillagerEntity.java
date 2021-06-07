package com.rimvillage.base;

import net.minecraft.entity.Entity;

import com.rimvillage.util.ProfessionType;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.villager.VillagerType;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public abstract class BaseVillagerEntity extends VillagerEntity {

    protected final String name;
    protected final boolean isMale;
    protected int age;
    protected final ProfessionType professionType;
    protected BlockPos bedPosition = null;
    protected BlockPos homeFrame = null;

    public BaseVillagerEntity(EntityType<? extends VillagerEntity> entityType, World worldIn, ProfessionType professionType, String name, Boolean isMale) {
        super(entityType, worldIn);
        this.name = name;
        this.isMale = isMale;
        this.age = 0;
        this.professionType = professionType;
    }
    
    protected abstract void initEntityAI();

}
