import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstScreen {
	static JFrame jframe = new JFrame();
	static JTextField jtextfield = new JTextField();
	static JButton jbutton = new JButton();

	public static void main(String[] args) {
		jframe.setVisible(true);
		jframe.setSize(1750, 1000);
		jframe.add(jtextfield);
		jframe.add(jbutton);
		jtextfield.setText("Welcome to my Game, Battle for Survival");
		jtextfield.setLocation(500, 0);
		jbutton.setSize(50, 50);
		jbutton.setText("Play");
		jbutton.setLocation(100, 100);
	}
}