package com.rimvillage.entity.ai;

import com.rimvillage.entity.RimVillagerEntity;
import net.minecraft.entity.ai.goal.Goal;

public class RimVillagerAi extends Goal {
    private final RimVillagerEntity rimVillager;

    public RimVillagerAi(RimVillagerEntity rimVillager){
        this.rimVillager = rimVillager;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
