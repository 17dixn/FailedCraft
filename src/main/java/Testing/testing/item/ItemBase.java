package Testing.testing.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import Testing.testing.testing;
import Testing.testing.proxy.*;

public class ItemBase extends Item implements ItemModelProvider
{
	protected String name;
 
	public ItemBase(String name) 
	{
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	@Override
	public void registerItemModel(Item item) 
	{
		testing.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}

}
