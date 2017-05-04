package Testing.testing.mobs;
import Testing.testing.mobs.renderers.*;
import Testing.testing.testing;
import Testing.testing.mobs.entitys.EntityTPose;
import Testing.testing.mobs.models.ModelTPose;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	public static void register()
	{
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
	}
	
	public static void registerRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTPose.class, 
				new RenderTPose(Minecraft.getMinecraft().getRenderManager(),
				new ModelTPose(), 0.5F));
	}
	
	public static void registerEntity()
	{
		EntityRegistry.registerModEntity(EntityTPose.class, "TPose", 300, testing.instance, 64, 1, true, 0xf7f7f7, 0x202421);
		EntityRegistry.addSpawn(EntityTPose.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
	}

}
