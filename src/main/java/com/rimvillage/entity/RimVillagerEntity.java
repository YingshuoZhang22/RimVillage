package com.rimvillage.entity;

import com.rimvillage.base.BaseRimVillagerEntity;
import com.rimvillage.entity.AI.AiRimVillager;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class RimVillagerEntity extends BaseRimVillagerEntity {

    private static final DataParameter<Integer> MININGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> LOGGINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> FISHINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> BREEDINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> FARMINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> MANUFACTURINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> COOKINGLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> COMBATLEVEL = EntityDataManager.createKey(RimVillagerEntity.class, DataSerializers.VARINT);

    //register each skill level, initial them to 0 (initial value may changed in the future)
    @Override
    protected void registerData(){
        this.dataManager.register(MININGLEVEL, 0);
        this.dataManager.register(LOGGINGLEVEL, 0);
        this.dataManager.register(FISHINGLEVEL, 0);
        this.dataManager.register(BREEDINGLEVEL, 0);
        this.dataManager.register(FARMINGLEVEL, 0);
        this.dataManager.register(MANUFACTURINGLEVEL, 0);
        this.dataManager.register(COOKINGLEVEL, 0);
        this.dataManager.register(COMBATLEVEL, 0);
    }

    public RimVillagerEntity(EntityType<? extends BaseRimVillagerEntity> entityType, World worldIn) {
        super(entityType, worldIn, "unknown", true);
        this.goalSelector.addGoal(0, new AiRimVillager(this));
        this.getAttributeManager().createInstanceIfAbsent(Attributes.MAX_HEALTH);
    }


}
