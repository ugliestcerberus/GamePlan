import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
 boolean isAlive = true;
	public Rectangle collisionbox = new Rectangle();


	public GameObject(int x, int y, int width, int height, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
	}

	public GameObject() {
		// TODO Auto-generated constructor stub
	}

	void update() {
		collisionbox.setBounds(x, y, width, height);
	}

	void draw(Graphics g) {

	}
}
