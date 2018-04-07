import java.awt.Graphics;

public class Armour extends GameObject{

	public Armour(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.armourImg, x, y, width, height, null);
		
	}

}
