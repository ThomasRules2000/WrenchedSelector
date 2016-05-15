package com.stacinator.wrenchedselector;

import com.stacinator.wrenchedselector.init.ModBlocks;
import com.stacinator.wrenchedselector.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class WrenchedSelector
{
    @Mod.Instance(Reference.MOD_ID)
    public static WrenchedSelector instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        //Init Block
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Main Code
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
