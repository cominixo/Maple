package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.world.Tree.CherrySaplingGenerator;
import com.skniro.maple.world.Tree.MapleSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Maple_block {
    public static final Block MAPLE_LOG = registerBlock("maple_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",new SaplingBlock(new MapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);


    public static final Block CHERRY_LOG = registerBlock("cherry_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",new SaplingBlock(new CherrySaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);
    public static final Block POTTED_CHERRY_SAPLING = registerBlock("potted_cherry_sapling",
            new FlowerPotBlock(CHERRY_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()), Maple.Maple_Group);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block CHERRY_STAIRS = registerBlockWithoutItem("cherry_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)));
    public static final Block CHERRY_SLAB = registerBlockWithoutItem("cherry_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_FENCE_GATE = registerBlockWithoutItem("cherry_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F)));
    public static final Block CHERRY_FENCE = registerBlockWithoutItem("cherry_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModWoodBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }
}