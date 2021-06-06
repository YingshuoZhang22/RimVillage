package com.rimvillage.init;
 
import com.rimvillage.core.RimVillageCore;
import com.rimvillage.blocks.BlockRecruitSign;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RimVillageCore.MOD_ID);
    // blocks
    public static final RegistryObject<BlockRecruitSign> RECRUIT_SIGN = BLOCKS.register("recruit_sign", () -> new BlockRecruitSign(AbstractBlock.Properties.from(Blocks.OAK_FENCE.getBlock())));
    public static final RegistryObject<Block> VILLAGE_CENTER_SIGN = BLOCKS.register("village_center_sign", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_FENCE.getBlock())));

    
}
