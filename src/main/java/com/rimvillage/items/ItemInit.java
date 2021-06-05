package com.rimvillage.items;

import com.rimvillage.core.RimVillageCore;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RimVillageCore.MOD_ID);

    public static final RegistryObject<Item> FIRST_RIMVILLAGE_ITEM = ITEMS.register("first_rimvillage_item", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));


}
