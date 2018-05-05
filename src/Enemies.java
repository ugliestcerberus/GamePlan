import java.awt.Color;
import java.awt.Graphics;

import javax.imageio.ImageIO;

public class Enemies extends GameObject{

	public Enemies(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		
	}
	void update() {
	super.update();
	}
	
	void draw(Graphics g) {
		if(isAlive)
		g.drawImage(GamePanel.monsterImg,x,y,width,height,null);
		g.setColor(Color.BLUE);
	}
	
	public void add(ObjectManager manager) {
		
	}
}
