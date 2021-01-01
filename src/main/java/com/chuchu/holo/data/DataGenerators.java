package com.chuchu.holo.data;

import com.chuchu.holo.HoloMod;
import com.chuchu.holo.data.client.ModBlockStateProvider;
import com.chuchu.holo.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid= HoloMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen,existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen,existingFileHelper));
    }
}
