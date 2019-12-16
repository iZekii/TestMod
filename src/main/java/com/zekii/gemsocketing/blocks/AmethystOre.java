package com.zekii.gemsocketing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AmethystOre extends Block {
    public AmethystOre() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("amethyst_ore");
    }
}
