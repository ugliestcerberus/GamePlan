import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondScreen implements ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton easybutton = new JButton();
	JButton mediumbutton = new JButton();
	JButton hardbutton = new JButton();
	JTextField jtextfield = new JTextField();
	private JFrame mainGameWindow= new JFrame("Gamescreen");
	public ThirdScreen thirdscreen= new ThirdScreen();

	public static void main(String[] args) {
		SecondScreen secondcreen = new SecondScreen();
	}

	SecondScreen() {
		jframe.setVisible(true);
		jframe.add(jpanel);
		jframe.setSize(1000, 1000);
		jpanel.add(jtextfield);
		jtextfield.setText("Select Difficulty");
		jpanel.add(easybutton);
		jpanel.add(mediumbutton);
		jpanel.add(hardbutton);
		easybutton.setText("Easy");
		mediumbutton.setText("Medium");
		hardbutton.setText("Hard");
		easybutton.setLocation(200, 200);
		mediumbutton.setLocation(200, 300);
		hardbutton.setLocation(200, 400);
		easybutton.addActionListener(this);
		mediumbutton.addActionListener(this);
		hardbutton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		if(e.getSource()==easybutton) {

		mainGameWindow= new JFrame("gamescreen");
		mainGameWindow= thirdscreen.gamescreen;
		mainGameWindow.setVisible(true);	
		}
		else if(e.getSource()==mediumbutton) {
		mainGameWindow= new JFrame("gamescreen");
		mainGameWindow= thirdscreen.gamescreen;
		mainGameWindow.setVisible(true);
		}
		else if(e.getSource()==hardbutton) {
			System.out.println(e.getSource());

		mainGameWindow= new JFrame("gamescreen");
		mainGameWindow= thirdscreen.gamescreen;
		mainGameWindow.setVisible(true);	
		}
		}
	
	private void repaint() {
		
	}
	
}
