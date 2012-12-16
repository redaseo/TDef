package fit.george.sp1.draft;

import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class BasicTower extends Tower {

	private static int price = 100;
	
	public static int GetPrice() {
		return price;
	}
	
	
	public BasicTower(float pX, float pY, ITiledTextureRegion pTiledTextureRegion, VertexBufferObjectManager vertexBufferObjectManager) {

		super(pX, pY, pTiledTextureRegion, vertexBufferObjectManager);
		totalCost = price;
		
	
	}

}
