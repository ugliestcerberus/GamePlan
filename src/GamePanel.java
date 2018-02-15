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

	public BufferedImage rockImg;
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
	armourImg= ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.jpg"));
	armourImg2=ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece.png"));
	walkieImg=ImageIO.read(this.getClass().getResourceAsStream("walkietalkie.jpeg"));
	rockImg= ImageIO.read(this.getClass().getResourceAsStream("rock.jpg"));
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
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			
		}
	}

	public void keyReleased(KeyEvent e) {
		

	}

	public void actionPerformed(ActionEvent e) {

	}

	public void paintComponent(Graphics g) {
	g.drawImage(armourImg, 100, 100, 50, 50, null);
	g.drawImage(armourImg2, 120, 120, 50, 50, null);
	g.drawImage(rockImg,200,200, 100,100, null);
	g.drawImage(glockImg, 56, 56, 70, 70, null);
	g.drawImage(humanImg, 60, 60, 80, 80, null);
	g.drawImage(monsterImg, 110, 110, 75, 75,null);
	g.drawImage(swordImg, 85,85,110,110,null);
	g.drawImage(teammateImg, 90, 90, 110, 110,null);
	g.drawImage(walkieImg, 150, 150, 40, 40,null);
	
	}
}
