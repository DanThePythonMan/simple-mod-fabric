package net.danthepythonman.tutorialmod.block;

import net.danthepythonman.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));
//    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
//            new ExperienceDroppingBlock( UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f)));
//    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
//            new ExperienceDroppingBlock( UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(0.5f)));
//    public static final Block END_RUBY_ORE = registerBlock("end_ruby_ore",
//            new ExperienceDroppingBlock( UniformIntProvider.create(20, 50), FabricBlockSettings.copyOf(Blocks.STONE).strength(4f)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public  static  void  registerModBlocks(){
        TutorialMod.LOGGER.info("Registering ModBlocks for "+TutorialMod.MOD_ID);
    }

}
