import java.awt.Graphics;

public class Human extends GameObject {
	int speed;
	Human(int x, int y, int width, int height) {
		super(x, y, width, height, true);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.humanImg, x, y, width, height, null);
		//g.drawRect(x,y,width,height);
	}

	public void addBullet(Bullet bullet) {

	}

	void update() {
		super.update();
	}
}
