import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends GameObject{
	int speed=10;
	
	public Bullet(int x, int y, int width, int height) {
		super(x, y, width, height, isAlive);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;

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
	g.drawImage(GamePanel.bulletImg,x,y,width,height,null);
}
}
