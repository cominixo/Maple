package com.skniro.maple.world;

import com.skniro.maple.block.Maple_block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;



public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> Maple_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_PLACED;

    static{
        Maple_TREE_PLACED = PlacedFeatures.register("maple_tree_placed", ModConfiguredFeatures.Maple_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
        CHERRY_TREE_PLACED = PlacedFeatures.register("cherry_tree_placed", ModConfiguredFeatures.CHERRY_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
