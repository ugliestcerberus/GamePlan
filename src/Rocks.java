import java.awt.Graphics;

public class Rocks extends GameObject{
public Rocks(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.rockImg, x,y,width,height, null);

		
	}
	void update() {
		super.update();
		
	}
}
