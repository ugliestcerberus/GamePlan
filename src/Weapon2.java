import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Weapon2 extends GameObject{
	BufferedImage weapon2Img;
	public Weapon2(int x2, int y2, int width2, int height2, boolean isAlive) throws IOException {
		super(x2, y2, width2, height2, isAlive);
		this.x=x2;
		this.y =y2;
		this.width= width2;
		this.height= height2;
		this.isAlive= isAlive;
		weapon2Img = ImageIO.read(this.getClass().getResourceAsStream("glock.png"));
	}
	
	
}
