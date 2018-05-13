import java.awt.Color;
import java.awt.Graphics;

public class Teammate extends GameObject {
	int speed;
	
	Teammate(int x, int y, int width, int height,boolean isAlive){
		super(x,y,width,height,true);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	void update() {
		super.update();
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.teammateImg, x, y, width, height, null);
	}
}

