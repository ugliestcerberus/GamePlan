import java.awt.Graphics;

public class Rocks extends GameObject{
public Rocks(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
Rocks rocks= new Rocks(400,400,100,100,true);
Rocks rocks1= new Rocks(450,300,50,50,true);
Rocks rocks2= new Rocks(450,100,75,75,true);
	void draw(Graphics g) {
		g.drawImage(GamePanel.rockImg, 100, 100,50,50, null);
	}
	void update() {
		super.update();
		
	}
}
