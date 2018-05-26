import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;


public class Teammate extends GameObject {
	int speed;
	Armour2 armour2; 
	Weapon2 weapon2;
	int armour=100;
	Teammate(int x, int y, int width, int height,boolean isAlive){
		super(x,y,width,height,true);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		try {
			armour2= new Armour2(300,300,85,85, true);
			weapon2 = new Weapon2(300, 300, 50, 50, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void update() {
		super.update();
	}
	void draw(Graphics g) {
		if(isAlive) {
		g.drawImage(GamePanel.teammateImg, x, y, width, height, null);
		g.setColor(Color.BLUE);
		}
		if(armour>100) {
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
	public void takesDamage() {
		if(armour>0) {
			armour--;
		}
		else{
			isAlive=false;
		}
			
	}
}

