package com.zekii.gemsocketing.setup;

import com.zekii.gemsocketing.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    // Make the creative tab
    public ItemGroup itemGroup = new ItemGroup("gemsocketing") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.AMETHYST_ORE);
        }
    };

    public void init() {

    }
}
