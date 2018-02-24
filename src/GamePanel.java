import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer = new Timer(1000 / 60, this);

	public static BufferedImage rockImg;
	public BufferedImage armourImg;
	public BufferedImage armourImg2;
	public BufferedImage walkieImg;
	public BufferedImage glockImg;
	public BufferedImage swordImg;
	public BufferedImage monsterImg;
	public BufferedImage humanImg;
	public BufferedImage teammateImg;
	
GamePanel() {
try {
	armourImg= ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.png"));
	armourImg2=ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece.png"));
	walkieImg=ImageIO.read(this.getClass().getResourceAsStream("walkietalkie.jpeg"));
	rockImg= ImageIO.read(this.getClass().getResourceAsStream("rock.png"));
	glockImg=ImageIO.read(this.getClass().getResourceAsStream("glock.jpeg"));
	monsterImg= ImageIO.read(this.getClass().getResourceAsStream("monster.ico"));
	humanImg= ImageIO.read(this.getClass().getResourceAsStream("human.jpg"));
	teammateImg= ImageIO.read(this.getClass().getResourceAsStream("teammate.jpg"));
	swordImg= ImageIO.read(this.getClass().getResourceAsStream("sword.jpeg"));
}catch(IOException e) {
e.printStackTrace();
}	
}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_A) {
			
		}
		if(e.getKeyCode()==KeyEvent.VK_W) {
			
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			
		}
			
	}

	public void keyReleased(KeyEvent e) {
		

	}

	public void actionPerformed(ActionEvent e) {

	}

	public void paintComponent(Graphics g) {
	g.drawImage(rockImg,200, 250, 75, 75, null);
	g.drawImage(rockImg, 500,200, 75, 75, null);
	g.drawImage(rockImg, 700, 250, 75, 75, null);
	g.drawImage(rockImg, 600, 450, 75, 75, null);
	g.drawImage(rockImg, 900, 600, 75, 75, null);
	g.drawImage(rockImg, 800, 550, 75, 75, null);
	g.drawImage(rockImg, 100, 100, 75, 75, null);
	g.drawImage(humanImg, 0, 800, 100, 100, null);
	g.drawImage(armourImg, 0, 800, 85, 85, null);
	g.drawImage(glockImg, 0, 800, 75, 75, null);
	g.drawImage(monsterImg, 110, 200, 50, 50, null);
	g.drawImage(swordImg, 400, 200, 50, 50, null);
	g.drawImage(teammateImg, 300, 350, 100, 100, null);
	g.drawImage(armourImg2, 300, 350, 85, 85, null);
	}
}
