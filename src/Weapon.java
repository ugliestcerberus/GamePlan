import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Weapon extends GameObject{
BufferedImage weaponImg;

public Weapon(int x, int y, int width, int height, boolean isAlive) throws IOException{
	super(x, y, width, height, isAlive);
	this.x=x;
	this.y=y;
	this.width= width;
	this.height= height;
	this.isAlive= isAlive;
	weaponImg= ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
}
}
