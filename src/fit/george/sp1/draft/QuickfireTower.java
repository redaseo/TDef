package fit.george.sp1.draft;

import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class QuickfireTower extends Tower {

	
	private static int price = 200;
	
	public static int GetPrice() {
		return price;
	}
	
	
	public QuickfireTower(float pX, float pY, ITiledTextureRegion pTiledTextureRegion, VertexBufferObjectManager vertexBufferObjectManager) {
		
		super(pX, pY, pTiledTextureRegion, vertexBufferObjectManager);
		totalCost = price;
		
		
	}
	
	

}
