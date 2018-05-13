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
	final int MENU_STATE= 0;
	final int GAME_STATE= 1;
	final int END_STATE= 2;
	int currentState= MENU_STATE;
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
	Armour2 armour2= new Armour2(300, 300, 85, 85, true);
	Weapon weapon = new Weapon(0, 800, 75, 75, true);
	Weapon2 weapon2 = new Weapon2(300, 300, 50, 50, true);
	Monster monster= new Monster(0,0,50,50,true);
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	manager.addEnemy(new Monster(0, 0, 50, 50, true));
	manager.addEnemy(monster);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_A) {
			human.x -= 50;
			weapon.x -= 50;
			armour.x -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			human.y -= 50;
			weapon.y -=50;
			armour.y -=50;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			human.y += 50;
			weapon.y += 50;
			armour.y += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			human.x += 50;
			weapon.x += 50;
			armour.x += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			teammate.y += 50;
			weapon2.y += 50;
			armour2.y += 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			teammate.y -= 50;
			weapon2.y -= 50;
			armour2.y -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			teammate.x -= 50;
			weapon2.x -= 50;
			armour2.x -= 50;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			teammate.x += 50;
			weapon2.x += 50;
			armour2.x += 50;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			manager.addBullet(new Bullet(human.x, human.y, 50, 50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			manager.addBullet(new Bullet(teammate.x, teammate.y, 50,50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			human.addBullet(new Bullet(0, 800, 50, 50, true));
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			JOptionPane.showMessageDialog(null,"Help me out, teammate!");
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			JOptionPane.showMessageDialog(null,"stay out of the area, Teammate!");
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			JOptionPane.showMessageDialog(null,"I'm coming to help, Teammate");
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			JOptionPane.showMessageDialog(null,"Follow me,Teammate");
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			JOptionPane.showMessageDialog(null,"Oh yeah teammate, we got this");
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			JOptionPane.showMessageDialog(null,"Help me out, Human!");
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			JOptionPane.showMessageDialog(null,"stay out of the area, Human!");
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			JOptionPane.showMessageDialog(null,"I'm coming to help, Human");
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			JOptionPane.showMessageDialog(null,"Follow me, Human");
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			JOptionPane.showMessageDialog(null,"Oh yeah human, we got this");
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
		//gameobject.update();

	}

	public void paintComponent(Graphics g) {
		g.drawImage(armourImg, armour.x, armour.y, armour.width, armour.height, null);
		manager.draw(g);
		//g.drawImage(humanImg, human.x, human.y, human.width, human.height, null);
		g.drawImage(teammateImg, teammate.x, teammate.y, teammate.width, teammate.height, null);
		g.drawImage(glockImg, weapon.x, weapon.y, weapon.width, weapon.height, null);
		g.drawImage(armourImg2, armour2.x, armour2.y, armour2.width, armour2.height, null);
		g.drawImage(weapon2Img, weapon2.x, weapon2.y, weapon2.width, weapon2.height, null);
		//g.drawImage(weaponImg, weapon.x, weapon.y, weapon.width, weapon.height,null);
		g.drawImage(monsterImg, monster.x, monster.y, monster.width, monster.height, null);
		

		
	}

}
