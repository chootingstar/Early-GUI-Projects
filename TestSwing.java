import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.*;
import java.awt.GridLayout;

public class TestSwing {
		JFrame frame = new JFrame("Array GUI"); //creates the frame to display on
JButton[][] grid;
public TestSwing(int width, int length) { //constuctor
	frame.setLayout(new GridLayout(width, length)); //setting layout
	grid = new JButton[width][length]; //allowcates to size of grid
	for (int x = 0; x < width; x++) {
		for (int y = 0; y < length; y++) {
			grid[x][y] = new JButton("(" + x + "," + y + ")"); //create a new button
			frame.add(grid[x][y]); //adds button to grid
		} 
	}
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.pack(); //sets appropriate size for the frame
	frame.setVisible(true);
}
		
	public static void main(String[] args) {
		
		
		int row, col;
		
		Scanner scaan = new Scanner(System.in);
		System.out.print("Enter Number of Row for Array (max 10): ");
		row = scaan.nextInt();
		System.out.print("Enter Number of Col for Array (max 10): ");
		col = scaan.nextInt();
		System.out.print("Enter " + (row*col) + " Array Elements: ");
		
			new TestSwing(row, col); //makes new ButtonGrid with 2 parameters
		
		scaan.close();
		
	}
}
