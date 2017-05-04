package Testing.testing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import Testing.testing.block.modBlocks;
import Testing.testing.item.modItems;
import Testing.testing.mobs.MobRegistry;
import Testing.testing.proxy.CommonProxy;

@Mod(modid = testing.modId, name = testing.name, version = testing.version,
acceptedMinecraftVersions = "[1.10.2]")
public class testing
{
	@SidedProxy(serverSide = "Testing.testing.proxy.CommonProxy", clientSide = "Testing.testing.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "testing";
	public static final String name = "Testing";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static testing instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println(name + " is loading!");
		modBlocks.init();
		modItems.init();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{
		MobRegistry.register();
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
