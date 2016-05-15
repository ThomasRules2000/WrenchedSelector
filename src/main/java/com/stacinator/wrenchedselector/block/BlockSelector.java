package com.stacinator.wrenchedselector.block;

import cpw.mods.fml.common.registry.GameData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

import java.util.Random;
import java.util.Set;

public class BlockSelector extends BlockWS
{
    public BlockSelector()
    {
        super();
        this.setBlockName("selector");
        this.setBlockTextureName("selector");

        boolean[] item = {false,false,false,false};
        int[] randomNum = new int[4];

        Set blocks = GameData.getBlockRegistry().getKeys();
        Set items = GameData.getItemRegistry().getKeys();

        int blockLength = blocks.size();
        int itemLength = items.size();
        int total = blockLength + itemLength;

        for(int i = 0; i>3;)
        {
            Random rand = new Random();
            randomNum[i] = rand.nextInt(total-1)+1;

            boolean same = false;
            for(int j = 0; j>i; j++)
            {
                if(randomNum[i] == randomNum[j])
                {
                    same = true;
                }
            }

            if(!same)
            {
                i++;
            }

            if(randomNum[i] > blockLength)
            {
                randomNum[i] -= blockLength;
                item[i] = true;
            }
        }
    }
}
