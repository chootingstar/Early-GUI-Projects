import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingExample{
	public static void main(String[] args) {
		
	JFrame f = new JFrame("Button Example");
	final JTextField tf = new JTextField();
	tf.setBounds(250, 380, 250, 50);
	tf.setFont(new Font("Courier new", Font.BOLD, 20));
	
	JButton b = new JButton("Click Here");
	b.setBounds(300, 440, 100, 30);
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("Welcome to CodeSdFF.");
		}
	});
	f.add(b);
	f.add(tf);
	f.setSize(800, 800);
	f.setLayout(null);
		f.setVisible(true);
	}
	
}

//public class SwingExample {
//	JFrame f;
//	
//	SwingExample(){
//		f = new JFrame();//new instance of JFrame
//		JButton b = new JButton("click"); //creating a button
//		b.setBounds(130, 100, 100, 40);
//		
//		f.add(b); //add button in JFrame
//		
//		f.setSize(400, 500);
//		f.setLayout(null);
//		f.setVisible(true);//allows us to see the frame
//	}
//	
//	public static void main(String[] args) {
//		new SwingExample();
//		}
//
//}
