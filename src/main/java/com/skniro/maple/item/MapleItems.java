package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleItems {
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.Maple_SIGN,MapleSignBlocks.Maple_WALL_SIGN));
    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.BAMBOO_SIGN,MapleSignBlocks.Maple_WALL_SIGN));

    public static final Item CHERRY_DOOR = registerItem("cherry_door",new TallBlockItem(Maple_block.CHERRY_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));
    public static final Item MAPLE_DOOR = registerItem("maple_door",new TallBlockItem(Maple_block.MAPLE_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));
    public static final Item BAMBOO_DOOR = registerItem("bamboo_door",new TallBlockItem(Maple_block.BAMBOO_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));

    //Foods
    public static final Item Flour = registerItem("flour",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item MapleSyrup = registerItem("maple_syrup",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item Cream = registerItem("cream",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item MILK_BOTTOM = registerItem("milk_bottom",new MilkBucketItem(new Item.Settings().maxCount(16).group(Maple.Maple_Group_Food)));


    //Tools
    public static final Item Food_Press = registerItem("food_press",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));


    //Seed
    public static final Item Rice = registerItem("rice",new AliasedBlockItem(Maple_block.RICE, (new FabricItemSettings()).group(Maple.Maple_Group_Food)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Mod Items for " + Maple.MOD_ID);
    }
}