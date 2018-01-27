import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdScreen {
	JFrame gamescreen = new JFrame();
	JPanel jpanel = new JPanel();
	JButton walkietalkie = new JButton();
	JLabel jlabel= new JLabel();
	
	rockImg= ImageIO.read(this.getClass.getResourceAsStream("rock.jpg"));

	public static void main(String[] args) {
		ThirdScreen thirdscreen = new ThirdScreen();
	}

	ThirdScreen() {
		gamescreen.setVisible(true);
		gamescreen.add(jpanel);
		jpanel.add(walkietalkie);
		gamescreen.setSize(1000, 1000);
		jlabel.setText("Lives");
	}
}
