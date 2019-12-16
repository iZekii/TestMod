package com.zekii.gemsocketing.worldgen;

import com.zekii.gemsocketing.blocks.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void SetupOreGen() {
        ForgeRegistries.BIOMES.forEach(biome -> {
            // Allow Amethyst to only spawn in the over world
            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                // Amethyst
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                        Feature.ORE,
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYST_ORE.getDefaultState(), 1/*Vein Size*/),
                        Placement.COUNT_RANGE,
                        new CountRangeConfig(1, 1, 1, 128)
                        //spawns per chunk, min height, max height base, max height
                ));

                // Topaz
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                        Feature.ORE,
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TOPAZORE.getDefaultState(), 1),
                        Placement.COUNT_RANGE,
                        new CountRangeConfig(1, 1, 1, 128)
                ));
            }
        });
    }
}

