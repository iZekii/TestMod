package com.zekii.gemsocketing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;


public class TopazOre extends Block {

    private Random random_gen = new Random();
    private int xp_amount = random_gen.nextInt(4) + 3;  // Gives 3-7 xp

    public TopazOre() {
        super(Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
            .hardnessAndResistance(3.0f)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("topaz_ore");
    }

    public boolean hasSilkTouch(ItemStack held) {
        ListNBT enchantments = held.getEnchantmentTagList();
        for (int i = 0; i < enchantments.size(); i++) {
            CompoundNBT enchant = enchantments.getCompound(i);
            if (enchant.getString("id").equals("minecraft:silk_touch")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isRemote()){
            if (!hasSilkTouch(player.getHeldItemMainhand())) {
                dropXpOnBlockBreak(world, pos, this.xp_amount);
            }
        }
        super.onBlockHarvested(world, pos, state, player);
    }
}
