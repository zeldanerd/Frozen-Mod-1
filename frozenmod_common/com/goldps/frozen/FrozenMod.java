package com.goldps.frozen;

import com.goldps.frozen.creativetab.CreativeTab;
import com.goldps.frozen.proxy.IProxy;
import com.goldps.frozen.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MODID, version = Reference.MODVERSION, name = Reference.MODNAME)
public class FrozenMod
{
	//Proxy setup
	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	//public static IProxy proxy;
	
	//Creative Tabs
	public static CreativeTabs tabFrozenModItems = new CreativeTabs("tabFrozenModItems") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	
	public static CreativeTabs tabFrozenModBlocks = new CreativeTabs("tabFrozenModBlocks") {
		public Item getTabIconItem() {
			return new Item();
		}
	};
	
	//Event Handlers
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());

    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabFrozenModItems", "en_US", "Frozen Mod Items");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabFrozenModBlocks", "en_US", "Frozen Mod Blocks");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}