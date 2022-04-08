import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Adder {

	private JFrame frame;
	private JTextField inp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adder window = new Adder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Adder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel prob = new JLabel("What is ___ + ___");
		prob.setFont(new Font("Tahoma", Font.PLAIN, 12));
		prob.setForeground(Color.ORANGE);
		prob.setBounds(10, 11, 146, 23);
		panel.add(prob);
		
		JLabel atemp = new JLabel("Attempts: ");
		atemp.setForeground(Color.ORANGE);
		atemp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		atemp.setBounds(10, 71, 146, 23);
		panel.add(atemp);
		
		JLabel scor = new JLabel("Total score:");
		scor.setForeground(Color.ORANGE);
		scor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scor.setBounds(10, 227, 146, 23);
		panel.add(scor);
		
		JButton but = new JButton("Next problem");
		but.setFont(new Font("Tahoma", Font.PLAIN, 12));
		but.setBackground(Color.ORANGE);
		but.setBounds(10, 105, 112, 23);
		panel.add(but);
		
		inp = new JTextField();
		inp.setBackground(Color.ORANGE);
		inp.setBounds(10, 45, 112, 20);
		panel.add(inp);
		inp.setColumns(10);
	}
}
