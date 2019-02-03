import javax.swing.JFrame;
import javax.swing.JLabel;

public class VoteCntGUI extends JFrame {
	public VoteCntGUI() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voto on the singers. There are two finalist 'A' and 'B'");
		lblNewLabel.setBounds(97, 128, 250, 14);
		getContentPane().add(lblNewLabel);
	}
}
