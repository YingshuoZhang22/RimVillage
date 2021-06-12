package com.rimvillage.base;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public class BaseRimVillagerEntity extends CreatureEntity {

    protected final String NAME;
    protected final boolean ISMALE;
    protected int age;
    protected BlockPos bedPosition = null;
    protected BlockPos homeFrame = null;

    public BaseRimVillagerEntity(EntityType<? extends BaseRimVillagerEntity> entityType, World worldIn, String name, Boolean isMale) {
        super(entityType, worldIn);
        this.NAME = name;
        this.ISMALE = isMale;
        this.age = 0;
        this.getAttributeManager().createInstanceIfAbsent(Attributes.MAX_HEALTH);
    }
    
    protected void initEntityAI() {
        
    }

}
