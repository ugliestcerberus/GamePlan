import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Weapon extends GameObject{
BufferedImage weaponImg;
Weapon weapon;

public Weapon(int x, int y, int width, int height, boolean isAlive) {
	super(x, y, width, height, isAlive);
	this.x=x;
	this.y=y;
	this.width= width;
	this.height= height;
	this.isAlive= isAlive;
	try {
		weaponImg= ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void moveLeft() {
	x -= 50;
}
public void moveRight() {
	x += 50;
}
public void moveUp() {
	y -= 50;
}
public void moveDown() {
	y += 50;
}
}
