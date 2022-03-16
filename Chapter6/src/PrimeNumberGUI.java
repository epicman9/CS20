import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeNumberGUI {

	private JFrame frame;
	private JTextField inp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumberGUI window = new PrimeNumberGUI();
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
	public PrimeNumberGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Back = new JPanel();
		Back.setBackground(Color.BLACK);
		Back.setBounds(0, 0, 424, 231);
		frame.getContentPane().add(Back);
		Back.setLayout(null);
		
		JLabel tex = new JLabel("Enter an integer: ");
		tex.setForeground(Color.ORANGE);
		tex.setBackground(Color.WHITE);
		tex.setBounds(80, 15, 89, 14);
		Back.add(tex);
		
		JButton but = new JButton("Enter");
		but.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				
				
				
			}
		});
		but.setBackground(Color.ORANGE);
		but.setBounds(261, 11, 89, 23);
		Back.add(but);
		
		inp = new JTextField();
		inp.setBounds(165, 12, 86, 20);
		Back.add(inp);
		inp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Output");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBounds(180, 100, 71, 14);
		Back.add(lblNewLabel);
	}
}
