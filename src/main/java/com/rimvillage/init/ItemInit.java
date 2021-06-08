package com.rimvillage.init;

import com.rimvillage.core.RimVillageCore;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RimVillageCore.MOD_ID);
    // Items
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(RimVillageCore.RIMVILLAGE_GROUP)));
    public static final RegistryObject<Item> TEST_ITEM_2 = ITEMS.register("test_item_2", () -> new Item(new Item.Properties().group(RimVillageCore.RIMVILLAGE_GROUP)));
    public static final RegistryObject<Item> RIMVILLAGER_EGG = ITEMS.register("rimvillager_egg", () -> new Item(new Item.Properties().group(RimVillageCore.RIMVILLAGE_GROUP)));

    // Block Items
    public static final RegistryObject<BlockItem> RECRUIT_SIGN = ITEMS.register("recruit_sign", () -> new BlockItem(BlockInit.RECRUIT_SIGN.get(), new Item.Properties().group(RimVillageCore.RIMVILLAGE_GROUP)));
    public static final RegistryObject<BlockItem> VILLAGE_CENTER_SIGN = ITEMS.register("village_center_sign", () -> new BlockItem(BlockInit.VILLAGE_CENTER_SIGN.get(), new Item.Properties().group(RimVillageCore.RIMVILLAGE_GROUP)));

    }
