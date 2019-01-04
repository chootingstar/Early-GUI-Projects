import javax.swing.JButton;
import javax.swing.JFrame;

public class Grod {
	public static void main(String[] args) {
		JFrame f = new JFrame("Grid");
	JButton b = new JButton("(0, 0)");
	b.setBounds(0, 0, 300, 300);
	JButton a = new JButton("(0, 1)");
	a.setBounds(300, 0, 300, 300);
	JButton c = new JButton("(0, 2)");
	c.setBounds(600, 0, 300, 300);
	JButton d = new JButton("(1, 0)");
	d.setBounds(0, 300, 300, 300);
	JButton e = new JButton("(1, 1)");
	e.setBounds(300, 300, 300, 300);
	JButton g = new JButton("(1, 2)");
	g.setBounds(600, 300, 300, 300);
	JButton h = new JButton("(2, 0)");
	h.setBounds(0, 600, 300, 300);
	JButton i = new JButton("(2, 1)");
	i.setBounds(300, 600, 300, 300);
	JButton j = new JButton("(2, 2)");
	j.setBounds(600, 600, 300, 300);
	
	f.add(b);
	f.add(a);
	f.add(c);
	f.add(d);
	f.add(e);
	f.add(g);
	f.add(h);
	f.add(i);
	f.add(j);
	f.setSize(900, 900);
	f.setLayout(null);
	f.setVisible(true);
}
}