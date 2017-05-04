package Testing.testing.mobs.renderers;
import Testing.testing.mobs.entitys.*;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.util.ResourceLocation;

public class RenderTPose extends RenderLiving<EntityTPose>
{
	public RenderTPose(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn)
	{
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		setEntityTexture();
	}

	private void setEntityTexture() 
	{
		// TODO Auto-generated method stub
		
	}

	private static final ResourceLocation TPOSE_TEXTURE = new ResourceLocation("testing", "textures/entity/TPose/TPose.png");

	@Override
	protected ResourceLocation getEntityTexture(EntityTPose entity)
	{
		// TODO Auto-generated method stub
		return TPOSE_TEXTURE;
	}
}
