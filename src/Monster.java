import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Monster extends GameObject {
	int speed;
	
	public Monster(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		speed= new Random().nextInt(3)-1;
	}
	
	void draw(Graphics g) {
		if(isAlive)
			g.drawImage(GamePanel.monsterImg,x,y,width,height,null);
			g.setColor(Color.BLUE);
	}
	
	void update() {
		super.update();
		x+=speed;
		y+=3;		
	}
}
