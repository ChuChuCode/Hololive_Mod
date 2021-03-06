package com.chuchu.holo.setup;

import com.chuchu.holo.HoloMod;
import com.chuchu.holo.block.SilverOreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<SilverOreBlock> SILVER_ORE = register("silver_ore",
            () -> new SilverOreBlock(
                    AbstractBlock.Properties
                            .create(Material.ROCK)
                            .hardnessAndResistance(3, 10)
                            .harvestLevel(2)
                            //.harvestTool(ToolType.PICKAXE)
                            .sound(SoundType.STONE)));
    //public static final RegistryObject<BloOR_BELT = BLOCKS.register("conveyor_belt", () -> new conveyor_belt_block());
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(HoloMod.HOLO_GROUP)));
        return ret;
    }
}