package Testing.testing.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import Testing.testing.proxy.*;
import Testing.testing.testing;

public class ClientProxy extends CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, 
			new ModelResourceLocation(testing.modId + ":" + id, "inventory"));
	}
}