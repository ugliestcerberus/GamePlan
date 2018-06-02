import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer = new Timer(1000 / 60, this);
	public static BufferedImage rockImg;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int score=0;
	int currentState = MENU_STATE;
	public static BufferedImage armourImg;
	public static BufferedImage armourImg2;
	public BufferedImage walkieImg;
	public BufferedImage glockImg;
	public BufferedImage swordImg;
	public static BufferedImage bulletImg;
	public BufferedImage weapon2Img;
	Human human = new Human(0, 800, 75, 75);
	Armour armour = new Armour(0, 800, 85, 85, true);
	Teammate teammate = new Teammate(300, 300, 75, 75, true);
	Weapon weapon = new Weapon(0, 800, 75, 75, true);
	Monster monster = new Monster(0, 0, 50, 50, true);
	ObjectManager manager = new ObjectManager(human);
	public static BufferedImage monsterImg;
	public static BufferedImage humanImg;
	public static BufferedImage teammateImg;
	public static BufferedImage weaponImg;

	GamePanel() {
		timer.start();
		manager.setTeammate(teammate);
		try {
			armourImg = ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.jpg"));
			armourImg2 = ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece.png"));
			walkieImg = ImageIO.read(this.getClass().getResourceAsStream("walkietalkie.jpeg"));
			rockImg = ImageIO.read(this.getClass().getResourceAsStream("rock.png"));
			glockImg = ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
			monsterImg = ImageIO.read(this.getClass().getResourceAsStream("enemies.jpg"));
			humanImg = ImageIO.read(this.getClass().getResourceAsStream("human.jpg"));
			teammateImg = ImageIO.read(this.getClass().getResourceAsStream("teammate.jpg"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			weapon2Img = ImageIO.read(this.getClass().getResourceAsStream("glock.png"));
			weaponImg = ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		manager.addEnemy(new Monster(0, 0, 50, 50, true));
		manager.addMonster(monster);
		manager.addArmour(armour);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_A) {
			human.moveLeft();
			armour.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			human.moveUp();
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			human.moveDown();
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			human.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			teammate.moveDown();
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			teammate.moveUp();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			teammate.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			teammate.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addBullet(new Bullet(human.x, human.y, 50, 50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			manager.addBullet(new Bullet(teammate.x, teammate.y, 50, 50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			human.addBullet(new Bullet(0, 800, 50, 50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			JOptionPane.showMessageDialog(null, "Help me out, teammate!");
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			JOptionPane.showMessageDialog(null, "stay out of the area, Teammate!");
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			JOptionPane.showMessageDialog(null, "I'm coming to help, Teammate");
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			JOptionPane.showMessageDialog(null, "Follow me,Teammate");
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			JOptionPane.showMessageDialog(null, "Oh yeah teammate, we got this");
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			JOptionPane.showMessageDialog(null, "Help me out, Human!");
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			JOptionPane.showMessageDialog(null, "stay out of the area, Human!");
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			JOptionPane.showMessageDialog(null, "I'm coming to help, Human");
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			JOptionPane.showMessageDialog(null, "Follow me, Human");
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			JOptionPane.showMessageDialog(null, "Oh yeah human, we got this");
		}

		repaint();

	}

	public void keyReleased(KeyEvent e) {

	}

	public void actionPerformed(ActionEvent e) {
		this.requestFocusInWindow();
		manager.update();
		manager.checkCollision();
		repaint();
		manager.purgeObjects();
	}

	public void drawEndState() {
		if(human.isAlive||teammate.isAlive==false) {
			JOptionPane.showMessageDialog(null, "Game over.Your score was"+ score);
		}
	}
	public void paintComponent(Graphics g) {
		manager.draw(g);
		g.drawImage(glockImg, weapon.x, weapon.y, weapon.width, weapon.height, null);
		g.drawImage(weaponImg, weapon.x, weapon.y, weapon.width, weapon.height, null);
	}
}