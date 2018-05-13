import java.awt.Graphics;

public class Weapon2 extends GameObject{

	public Weapon2(int x2, int y2, int width2, int height2, boolean isAlive) {
		super(x2, y2, width2, height2, isAlive);
		this.x=x2;
		this.y =y2;
		this.width= width2;
		this.height= height2;
		this.isAlive= isAlive;
	}
	
	//void draw(Graphics g) {
		//g.drawImage(GamePanel.weapon2Img, x,y,50,50,null);
	//}

}
