package com.rimvillage.init;

import java.rmi.registry.Registry;

import com.rimvillage.core.RimVillageCore;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RimVillageCore.MOD_ID);
    // blocks
    public static final RegistryObject<Block> VILLAGE_CENTER_SIGN = BLOCKS.register("village_center_sign", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_FENCE.getBlock())));

}
