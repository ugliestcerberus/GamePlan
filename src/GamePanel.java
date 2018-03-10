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
	public static BufferedImage bulletImg;
	Human human = new Human(500, 1000, 75, 75);
	Teammate teammate = new Teammate(300, 300, 50, 50);
	Rocks rocks1 = new Rocks(100, 100, 50, 50, true);
	Rocks rocks2 = new Rocks(200, 250, 75, 75, true);
	Rocks rocks3 = new Rocks(500, 200, 75, 75, true);
	Rocks rocks4 = new Rocks(700, 250, 75, 75, true);
	Rocks rocks5 = new Rocks(600, 450, 75, 75, true);
	Rocks rocks6 = new Rocks(900, 600, 75, 75, true);
	Rocks rocks7 = new Rocks(800, 550, 75, 75, true);
	Rocks rocks8 = new Rocks(100, 100, 75, 75, true);

	public static BufferedImage monsterImg;
	public static BufferedImage humanImg;
	public static BufferedImage teammateImg;

	GamePanel() {
		try {
			armourImg = ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.png"));
			armourImg2 = ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece.png"));
			walkieImg = ImageIO.read(this.getClass().getResourceAsStream("walkietalkie.jpeg"));
			rockImg = ImageIO.read(this.getClass().getResourceAsStream("rock.png"));
			glockImg = ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
			monsterImg = ImageIO.read(this.getClass().getResourceAsStream("enemies.jpg"));
			humanImg = ImageIO.read(this.getClass().getResourceAsStream("human.jpg"));
			teammateImg = ImageIO.read(this.getClass().getResourceAsStream("teammate.jpg"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			swordImg = ImageIO.read(this.getClass().getResourceAsStream("BlackSword.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A) {
			human.x += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			human.y += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			human.y -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			human.x -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			teammate.x += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			teammate.y += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			teammate.x += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			teammate.x -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			human.addBullet(new Bullet(0, 800, 50, 50));
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {

		}
		if(e.getKeyCode() == KeyEvent.VK_2) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_3) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_4) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_5) {
			
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
		}

	}

	public void keyReleased(KeyEvent e) {

	}

	public void actionPerformed(ActionEvent e) {

	}

	public void paintComponent(Graphics g) {
		g.drawImage(humanImg, 0, 800, 100, 100, null);
		g.drawImage(armourImg, 0, 800, 85, 85, null);
		g.drawImage(glockImg, 0, 800, 75, 75, null);
		g.drawImage(monsterImg, 110, 200, 50, 50, null);
		g.drawImage(teammateImg, 300, 350, 100, 100, null);
		g.drawImage(armourImg2, 300, 350, 85, 85, null);
		g.drawImage(swordImg, 300, 350, 110, 110, null);
		rocks1.draw(g);
		rocks2.draw(g);
		rocks3.draw(g);
		rocks4.draw(g);
		rocks5.draw(g);
		rocks6.draw(g);
		rocks7.draw(g);
		rocks8.draw(g);
		human.draw(g);
		System.out.println("lk");
	}
}
