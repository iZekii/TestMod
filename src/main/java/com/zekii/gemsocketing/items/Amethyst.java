package com.zekii.gemsocketing.items;

import com.zekii.gemsocketing.GemSocketing;
import net.minecraft.item.Item;

public class Amethyst extends Item {

    public Amethyst() {
        super(new Item.Properties().group(GemSocketing.setup.itemGroup));
        setRegistryName("amethyst");
    }

}
