import java.awt.Graphics;

public class Armour extends GameObject{
	Armour armour;
	boolean teamate;
	public Armour(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		
	}
	void draw(Graphics g) {
		//if it is a teamate
		if(teamate) {
			g.drawImage(GamePanel.armourImg, x, y, width, height, null);			
		} else {
			g.drawImage(GamePanel.armourImg2, x, y, width, height, null);
		}
		
	}
	public void moveLeft() {
		x -= 50;
	}
	public void moveRight() {
		x += 50;
	}
	public void moveUp() {
		y -= 50;
	}
	public void moveDown() {
		y += 50;
	}

}
