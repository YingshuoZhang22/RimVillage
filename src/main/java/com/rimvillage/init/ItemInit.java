package com.rimvillage.init;

import com.rimvillage.core.RimVillageCore;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RimVillageCore.MOD_ID);
    // Items
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    // Block Items
    public static final RegistryObject<BlockItem> VILLAGE_CENTER_SIGN = ITEMS.register("village_center_sign", () -> new BlockItem(BlockInit.VILLAGE_CENTER_SIGN.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


}
