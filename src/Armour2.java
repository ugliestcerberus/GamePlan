import java.awt.Graphics;

public class Armour2 extends GameObject{

	public Armour2(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.armourImg2, x, y, width, height, null);
		
	}

}
