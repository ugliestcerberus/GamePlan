import java.awt.Color;
import java.awt.Graphics;

public class Monster extends GameObject {

	public Monster(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		
	}
	void draw(Graphics g) {
		if(isAlive)
			g.drawImage(GamePanel.monsterImg,x,y,width,height,null);
			g.setColor(Color.BLUE);
	}
	void getX() {
		
	}
	void getY() {
		
	}
	void update() {
		super.update();
		x+=1;
		y+=1;
	}
	
}
