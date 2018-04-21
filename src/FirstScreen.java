import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class FirstScreen extends JComponent implements ActionListener, Runnable {
	private int widthOfScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private int heightOfScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	private JFrame mainGameWindow = new JFrame("NewGame");// Makes window with title "NewGame"
	private JPanel jpanel = new JPanel();
	private JButton playbutton = new JButton("Play");
	public SecondScreen secondscreen = new SecondScreen();
	private Timer paintTicker = new Timer(20, this); // Ticks every 20 milliseconds (50 times per second); calls on
														// actionPerformed() when it ticks.

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new FirstScreen());

	}

	public void run() {
		mainGameWindow.setTitle("NewGame");
		mainGameWindow.setSize(widthOfScreen, heightOfScreen);
		mainGameWindow.add(this);// Adds the paint method
		mainGameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGameWindow.setVisible(true);
		paintTicker.start();
		mainGameWindow.add(jpanel);
		jpanel.add(playbutton);
		playbutton.addActionListener(this);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Welcome to my game, Battle for Survival", 200, 200);
		g2.setColor(Color.BLUE);
		g2.setColor(Color.red);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		if (e.getSource() == playbutton) {
			mainGameWindow = new JFrame("second screen");
			mainGameWindow = secondscreen.jframe;
			mainGameWindow.setVisible(true);
		}
	}
}
