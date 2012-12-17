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

		int [][] damage_levels = {{100, 2, 3}, {100, 2, 3}, {50, 2, 3}, {50, 2, 3}};
		int [][] distance_levels = {{50, 25}, {50, 25}, {50, 25}, {50, 25}};
		
		upgradeDamagePrice = damage_levels;
		upgradeDistancePrice = distance_levels;
		
		MAX_DAMAGE_LEVELS = upgradeDamagePrice.length;
		MAX_DISTANCE_LEVELS = upgradeDistancePrice.length;
		
		animation_speed = 200;
		attackRate = 0.4f;
		distance = 100;
		pRangeCircle.calculateCircle(distance);
		
	}

}
