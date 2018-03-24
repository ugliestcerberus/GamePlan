import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	static boolean isAlive = true;
	public Rectangle collisionbox = new Rectangle();


	public GameObject(int x2, int y2, int width2, int height2, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
	}

	void update() {
		collisionbox.setBounds(x, y, width, height);
	}

	void draw(Graphics g) {

	}
}
