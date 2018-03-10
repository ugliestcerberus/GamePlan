import java.awt.Graphics;

public class Human extends GameObject{
Human(int x, int y, int width, int height){
super(x,y,width,height,true);
this.x=x;
this.y=y;
this.width=width;
this.height=height;
}
void draw(Graphics g) {
g.drawImage(GamePanel.humanImg, x, y, width, height, null);
}
public void addBullet(Bullet bullet) {
	
	
}
}
