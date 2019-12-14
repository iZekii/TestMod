package com.zekii.gemsocketing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FunkyBlock extends Block {
    public FunkyBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.SAND)
                .hardnessAndResistance(1.0f)
                .lightValue(14)
        );
        setRegistryName("funkyblock");
    }
}
