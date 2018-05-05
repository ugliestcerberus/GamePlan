import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends GameObject{
	int speed=20;
	
	public Bullet(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.isAlive= isAlive;
		

}
void update() {
	super.update();
	y=y-speed;
	if(y<0) {
		isAlive= false;
	}
}
void draw(Graphics g) {
	g.setColor(Color.YELLOW);
	g.drawRect(x, y, width, height);
	g.drawImage(GamePanel.bulletImg,x,y,width,height,null);
}
}
