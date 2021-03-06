import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ThirdScreen {
	JFrame gamescreen = new JFrame();
	GamePanel jpanel = new GamePanel();
	JButton walkietalkie = new JButton();
	JLabel jlabel = new JLabel();
	JTextField livescounter= new JTextField();
	public BufferedImage rockImg;
	public BufferedImage armourImg;
	public BufferedImage armourImg2;
	public BufferedImage walkieImg;
	public BufferedImage glockImg;
	public BufferedImage weapon2Img;
	public BufferedImage monsterImg;
	public BufferedImage humanImg;
	public BufferedImage teammateImg;
	static int width;
	public ImageIcon walkie;
	public static void main(String[] args)  {
		ThirdScreen thirdscreen = new ThirdScreen();	
	}
	ThirdScreen() {
		gamescreen.setVisible(true);
		gamescreen.add(jpanel); 
		jpanel.add(walkietalkie);
		walkietalkie.addActionListener(jpanel);
		jpanel.addKeyListener(jpanel);
		jpanel.requestFocusInWindow();
		gamescreen.setSize(900, 900);
		jlabel.setText("Lives");
		try {
			armourImg= ImageIO.read(this.getClass().getResourceAsStream("firstarmourpiece.jpg"));
			armourImg2=ImageIO.read(this.getClass().getResourceAsStream("secondarmourpiece.png"));
			glockImg=ImageIO.read(this.getClass().getResourceAsStream("glocks.png"));
			monsterImg= ImageIO.read(this.getClass().getResourceAsStream("enemies.jpg"));
			humanImg= ImageIO.read(this.getClass().getResourceAsStream("human.jpg"));
			teammateImg= ImageIO.read(this.getClass().getResourceAsStream("teammate.jpg"));
			weapon2Img= ImageIO.read(this.getClass().getResourceAsStream("glock.png"));
			walkietalkie.setBounds(1500, 0, 100, 100);
			
	}catch(IOException e) {
		e.printStackTrace();
	}		
		jpanel.repaint();
	}
}