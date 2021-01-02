package com.chuchu.holo.setup;

import com.chuchu.holo.HoloMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () ->
            new Item(new Item.Properties().group(HoloMod.HOLO_GROUP)));

    static void register() {
    }
}