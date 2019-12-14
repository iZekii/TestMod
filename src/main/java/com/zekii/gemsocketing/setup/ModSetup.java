package com.zekii.gemsocketing.setup;

import com.zekii.gemsocketing.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("gemsocketing") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FUNKYBLOCK);
        }
    };

    public void init() {

    }
}
