import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SecondScreen {
JFrame jframe= new JFrame();	
JPanel jpanel= new JPanel();
JButton jbutton1= new JButton();
JButton jbutton2= new JButton();
JButton jbutton3= new JButton();
JTextField jtextfield= new JTextField();
public static void main(String[]args) {
SecondScreen secondcreen= new SecondScreen();
}
SecondScreen(){
jframe.setVisible(true);	
jframe.add(jpanel);
jframe.setSize(1000,1000);
jpanel.add(jtextfield);
jtextfield.setText("Select Difficulty");
jpanel.add(jbutton1);
jpanel.add(jbutton2);
jpanel.add(jbutton3);
jbutton1.setText("Easy");
jbutton2.setText("Medium");
jbutton3.setText("Hard");
jbutton1.setLocation(200,200);
jbutton2.setLocation(200,300);
jbutton3.setLocation(200,400);
}
}
