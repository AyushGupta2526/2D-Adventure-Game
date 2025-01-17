package tile_interactive;

import java.awt.Color;

import entity.Entity;
import main.GamePanel;

public class IT_DestructibleWall extends InteractiveTile{

	GamePanel gp;
	
	public IT_DestructibleWall(GamePanel gp, int col, int row) {
		super(gp, col, row);
		
		this.gp = gp;
		this.worldX = gp.tileSize*col;
		this.worldY = gp.tileSize*row;
		
		down1 = setUp("/tiles_interactive/destructiblewall", gp.tileSize, gp.tileSize);
		destructible = true;
		life = 3;
	}
	
	public boolean isCorrectItem(Entity entity) {
		boolean isCorrectItem = false;
		
		if(entity.currentWeapon.type == type_pickaxe) {
			isCorrectItem = true;
		}
		
		return isCorrectItem;
	}
	
	public void playSE() {
		gp.playSE(20);
	}
	
	public InteractiveTile getDestroyedForm() {
		InteractiveTile destroyedForm = null;
		return destroyedForm ;
	}
	
	public Color getParticleColor() {
		Color color = new Color(65, 65, 65);
		return color;
	}
	
	public int getParticleSpeed() {
		int speed = 1;
		return speed;
	}
	
	public int getParticleSize() {
		int size = 6; // 6 pixels
		return size;
	}
	
	public int getParticleMaxLife() {
		int maxLife = 20;
		return maxLife;
	}
}
