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
	JTextField jtextfield8= new JTextField();
	JTextField jtextfield9= new JTextField();
	JTextField jtextfield10= new JTextField();
	JTextField jtextfield11= new JTextField();
	JTextField jtextfield12= new JTextField();
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
		jpanel.add(jtextfield8);
		jpanel.add(jtextfield9);
		jpanel.add(jtextfield10);
		jpanel.add(jtextfield11);
		jpanel.add(jtextfield12);
		jpanel.add(jbutton);
		jtextfield1.setText("Here are the rules to remember");
		jtextfield2.setText("1. The basic is objective for this game is to score as many points as possible by shooting all enemies without dying. ");
		jtextfield3.setText("2. Each guy would only have two lives. If one of the enemies die, then the game is over.");
		jtextfield4.setText("3. Remember, you will be allowed to communicate with your teammate to increase the chance of higher scores");
		jtextfield5.setText("4. This is a mutiplayer game");
		jtextfield6.setText("5. 1st player would use A to move left, w to move ahead, d to move right, and s to move down.");
		jtextfield7.setText("6. 2nd player would use the arrow buttons to move.");
		jtextfield8.setText("7. To communicate, 1st player will press the 1,2,3,4,5 key above the letters");
		jtextfield9.setText("8. To communicate, 2nd player will press the 1,2,3,4,5 keys on the numpad.");
		jtextfield10.setText("9. To shoot, 1st player will press the space key");
		jtextfield11.setText("10, To shoot, 2nd player wil press the enter key");
		jtextfield12.setText("here's what the screen speak to you if you press each of the following numer keys: "
				+ "1. Help me out"
				+ "2. Get out of the area"
				+ "3. I'm coming to help"
				+ "4. Follow me"
				+ "5. Oh yeah");
		jbutton.setText("Let's go!");
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		if (e.getSource() == jbutton) {
			mainGameWindow = new JFrame("second screen");
			mainGameWindow = thirdscreen.gamescreen;
			mainGameWindow.setVisible(true);
		}
	
		
	}

	private void repaint() {
		// TODO Auto-generated method stub
		
	}
}
	

