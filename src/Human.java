import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Human extends GameObject {
	int speed;
	Human(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, true);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive= isAlive;
	}



	void draw(Graphics g) {
		g.drawImage(GamePanel.humanImg, x, y, 50, 50, null);
		System.out.println("drawing human at y of " + y);
	}

	public void addBullet(Bullet bullet) {

	}
	
	
	
	void update() {
		super.update();
	}

	public void add(ObjectManager manager) {
		// TODO Auto-generated method stub
		
	}
}

	
	

	