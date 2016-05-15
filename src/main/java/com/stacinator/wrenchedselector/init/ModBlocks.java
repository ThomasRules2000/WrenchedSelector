package com.stacinator.wrenchedselector.init;

import com.stacinator.wrenchedselector.block.BlockWS;
import com.stacinator.wrenchedselector.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockWS selector = new BlockWS();

    public static void init()
    {
        GameRegistry.registerBlock(selector, "selector");
    }
}
