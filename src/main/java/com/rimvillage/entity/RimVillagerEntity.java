package com.rimvillage.entity;

import com.rimvillage.base.BaseRimVillagerEntity;
import com.rimvillage.util.ProfessionType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.world.World;

public class RimVillagerEntity extends BaseRimVillagerEntity {

    private int miningLevel;            //miner
    private int loggingLevel;           //Lumberjack
    private int fishingLevel;           //Fisherman
    private int breedingLevel;          //Rancher
    private int farmingLevel;           //Farmer
    private int manufacturingLevel;     //artisan
    private int cookingLevel;           //chef
    private int combatLevel;            //guard

    public RimVillagerEntity(EntityType<? extends VillagerEntity> entityType, World worldIn, ProfessionType professionType, String name, Boolean isMale) {
        super(entityType, worldIn, name, isMale);
    }
}
