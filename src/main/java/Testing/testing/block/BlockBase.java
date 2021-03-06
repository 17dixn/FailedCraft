package Testing.testing.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import Testing.testing.*;
import Testing.testing.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider
{
	protected String name;

	public BlockBase(Material material, String name) 
	{
		super(material);

		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);
	}
	@Override
	public void registerItemModel(Item item) 
	{
		testing.proxy.registerItemRenderer(item, 0, name);
	}
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) 
	{
		super.setCreativeTab(tab);
		return this;
	}
}