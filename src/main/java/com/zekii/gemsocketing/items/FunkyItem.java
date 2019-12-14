package com.zekii.gemsocketing.items;

import com.zekii.gemsocketing.GemSocketing;
import net.minecraft.item.Item;

public class FunkyItem extends Item {

    public FunkyItem() {
        super(new Item.Properties().group(GemSocketing.setup.itemGroup));
        setRegistryName("funkyitem");
    }

}
