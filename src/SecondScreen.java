import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondScreen implements ActionListener{
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton jbutton= new JButton();
	JTextField jtextfield1 = new JTextField();
	JTextField jtextfield2= new JTextField();
	JTextField jtextfield3= new JTextField();
	JTextField jtextfield4= new JTextField();
	JTextField jtextfield5= new JTextField();
	JTextField jtextfield6= new JTextField();
	JTextField jtextfield7= new JTextField();
	private JFrame mainGameWindow= new JFrame("Gamescreen");
	public ThirdScreen thirdscreen= new ThirdScreen();

	public static void main(String[] args) {
		SecondScreen secondcreen = new SecondScreen();
	}

	SecondScreen() {
		jframe.setVisible(true);
		jframe.add(jpanel);
		jframe.setSize(1000, 1000);
		jpanel.add(jtextfield1);
		jpanel.add(jtextfield2);
		jpanel.add(jtextfield3);
		jpanel.add(jtextfield4);
		jpanel.add(jtextfield5);
		jpanel.add(jtextfield6);
		jpanel.add(jtextfield7);
		jpanel.add(jbutton);
		jtextfield1.setText("Here are a few rules to remember");
		jtextfield2.setText("1. The basic is objective for this game is to shoot all enemies without dying. ");
		jtextfield3.setText("2. Each guy would only have two lives. If both enemies die, then the game is over.");
		jtextfield4.setText("3. Remember, you will be allowed to communicate with your teammate to increase the chance of higher scores");
		jtextfield5.setText("4. This is a mutiplayer game");
		jtextfield6.setText("5. 1st player would use A to move left, w to move ahead, d to move right, and s to move down.");
		jtextfield7.setText("6. 2nd player would use the arrow buttons to move.");
		jbutton.setText("Let's go!");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbutton) {
			mainGameWindow = new JFrame("second screen");
			mainGameWindow = thirdscreen.gamescreen;
			mainGameWindow.setVisible(true);
		}
	
		
	}
}
	

