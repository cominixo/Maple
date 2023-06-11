package com.skniro.maple;

import com.skniro.maple.mixin.TrunkPlacerTypeInvoker;
import com.skniro.maple.world.gen.CherryTrunkPlacer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.maple.block.Maple_block.MAPLE_LOG;

public class Maple implements ModInitializer {
    public static final String MOD_ID = "maple";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final TrunkPlacerType<CherryTrunkPlacer> CHERRY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("maple:cherry_trunk_placer", CherryTrunkPlacer.CODEC);

    public static final ItemGroup Maple_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "maple_group"),() -> new ItemStack(MAPLE_LOG));
    @Override
    public void onInitialize() {
        MapleContent.registerItem();
        MapleContent.registerBlock();
        MapleContent.CreativeTab();
        MapleContent.generateWorldGen();
        MapleContent.registerMapleConfigured();
    }
}