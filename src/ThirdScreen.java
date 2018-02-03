import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdScreen {
	JFrame gamescreen = new JFrame();
	JPanel jpanel = new JPanel();
	JButton walkietalkie = new JButton();
	JLabel jlabel = new JLabel();
	public BufferedImage rockImg;
	public BufferedImage armourImg;
	public BufferedImage armourImg2;
	public BufferedImage walkieImg;
	public BufferedImage glockImg;
	public BufferedImage swordImg;
	public BufferedImage enemyImg;

	public static void main(String[] args) {
		ThirdScreen thirdscreen = new ThirdScreen();
	}

	ThirdScreen() {
		gamescreen.setVisible(true);
		gamescreen.add(jpanel);
		jpanel.add(walkietalkie);
		gamescreen.setSize(1000, 1000);
		jlabel.setText("Lives");
		try {
			armourImg= ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.jpg"));
			armourImg2=ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece\\.png"));
			walkieImg=ImageIO.read(this.getClass().getResourceAsStream("walkietalkie.jpg"));
			rockImg= ImageIO.read(this.getClass().getResourceAsStream("rock.jpg"));
			glockImg=ImageIO.read(this.getClass().getResourceAsStream("glock.jpeg"));
			swordImg= ImageIO.read(this.getClass().getResourceAsStream("sword.jpeg"));
			enemyImg= ImageIO.read(this.getClass().getResourceAsStream("enemy.png"));
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
