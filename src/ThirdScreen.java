import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdScreen {
	JFrame gamescreen = new JFrame();
	GamePanel jpanel = new GamePanel();
	JButton walkietalkie = new JButton();
	JLabel jlabel = new JLabel();
	public BufferedImage rockImg;
	public BufferedImage armourImg;
	public BufferedImage armourImg2;
	public BufferedImage walkieImg;
	public BufferedImage glockImg;
	public BufferedImage swordImg;
	public BufferedImage monsterImg;
	public BufferedImage humanImg;
	public BufferedImage teammateImg;

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
		
		jpanel.repaint();
	}
}
