package Testing.testing.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class modItems
{
	public static ItemBase ingotFailed;
	
	public static void init() 
	{
		ingotFailed = register(new ItemBase("failedIngot").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

}
