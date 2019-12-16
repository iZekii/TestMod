package com.zekii.gemsocketing.items;

import com.zekii.gemsocketing.GemSocketing;
import net.minecraft.item.Item;

public class Topaz extends Item {

    public Topaz() {
        super(new Item.Properties().group(GemSocketing.setup.itemGroup));
        setRegistryName("topaz");
    }
}
