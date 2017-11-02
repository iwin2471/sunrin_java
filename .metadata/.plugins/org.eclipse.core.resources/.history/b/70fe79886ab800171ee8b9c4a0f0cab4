import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Exam1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JFrame frame2 = new JFrame("hello");
		
		frame.setSize(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(200,300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("hello");
		JButton button = new JButton("æ»≥Á«œººø©");
		JLabel label = new JLabel("hello");
		frame.add(button);
		button.addActionListener(new Mylistener());
		frame.setLayout(new FlowLayout());
		button.addMouseListener(new MyMouseListener());
		
		
		frame.setVisible(true);
		frame2.setVisible(true);
	}
	
}
