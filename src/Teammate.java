import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;


public class Teammate extends GameObject {
	int speed;
	Armour armour2; 
	Weapon2 weapon2;
	int armour=100;
	Teammate(int x, int y, int width, int height,boolean isAlive){
		super(x,y,width,height,true);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		armour2= new Armour(300,800,85,85, true);
		weapon2 = new Weapon2(300, 800, 50, 50, true);
	}
	void update() {
		super.update();
	}
	void draw(Graphics g) {
		if(isAlive) {
		g.drawImage(GamePanel.teammateImg, x, y, width, height, null);
		g.setColor(Color.BLUE);
		}
		if(armour2.isAlive) {
		armour2.draw(g);	
		}
			g.drawImage(weapon2.weapon2Img, weapon2.x, weapon2.y, weapon2.width, weapon2.height, null);
	}
	public void moveDown(){
		y += 50;
		weapon2.y += 50;
		armour2.y += 50;
	}
	public void moveRight() {
		x += 50;
		weapon2.x += 50;
		armour2.x += 50;
	}
	public void moveLeft() {
		x -= 50;
		weapon2.x -= 50;
		armour2.x -= 50;
	}
	public void moveUp() {
		y -= 50;
		weapon2.y -= 50;
		armour2.y -= 50;
	}
	
}

