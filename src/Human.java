import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Human extends GameObject {
	int speed;
	Armour armour;
	Weapon weapon;
	int armour3=100;
	Human(int x, int y, int width, int height) {
		super(x, y, width, height, true);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		armour= new Armour(0, 800, 85, 85, true);
		weapon= new Weapon(0, 800, 75, 75, true);
	}
	void update() {
		super.update();
	}
	void draw(Graphics g) {
	if(isAlive) {
	g.drawImage(GamePanel.humanImg, x, y, 50, 50, null);
	g.setColor(Color.BLUE);
	}
	if(armour3>100) {
	armour.draw(g);	
	}
	g.drawImage(weapon.weaponImg, weapon.x, weapon.y, weapon.width, weapon.height, null);
}			
	
	
	public void addBullet(Bullet bullet) {

	}
	public void moveDown(){
		y += 50;
		weapon.y += 50;
		armour.y += 50;
	}
	public void moveRight() {
		x += 50;
		weapon.x += 50;
		armour.x += 50;
	}
	public void moveLeft() {
		x -= 50;
		weapon.x -= 50;
		armour.x -= 50;
	}
	public void moveUp() {
		y -= 50;
		weapon.y -= 50;
		armour.y -= 50;
	}
	public void takesDamage() {
		if(armour3>0) {
			armour3--;
		}
		else{
			isAlive=false;
		}
			
	}
}

	
	

	