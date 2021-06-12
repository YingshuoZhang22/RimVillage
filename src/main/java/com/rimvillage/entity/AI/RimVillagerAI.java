package com.rimvillage.entity.AI;

import com.rimvillage.entity.RimVillagerEntity;
import net.minecraft.entity.ai.goal.Goal;

public class RimVillagerAI extends Goal {
    private final RimVillagerEntity rimVillager;

    public RimVillagerAI(RimVillagerEntity rimVillager){
        this.rimVillager = rimVillager;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
