import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddCoins {

	private JFrame frame;
	private JTextField pen;
	private JTextField nic;
	private JTextField dim;
	private JTextField Quart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCoins window = new AddCoins();
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
	
	public static String getDollarAmount(int pennies, int nickles, int dimes, int quarters) 
	{
	
		double total = ((pennies + (nickles*5) + (dimes*10) + (quarters*25)));
		
		return ("Total: $" + (total/100));
	}
	
	
	public AddCoins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		pen = new JTextField();
		pen.setBackground(Color.ORANGE);
		pen.setBounds(90, 11, 143, 25);
		frame.getContentPane().add(pen);
		pen.setColumns(10);
		
		JLabel penlab = new JLabel("Pennies:");
		penlab.setForeground(Color.ORANGE);
		penlab.setBounds(30, 11, 50, 25);
		frame.getContentPane().add(penlab);
		
		nic = new JTextField();
		nic.setColumns(10);
		nic.setBackground(Color.ORANGE);
		nic.setBounds(90, 40, 143, 25);
		frame.getContentPane().add(nic);
		
		JLabel niclab = new JLabel("Nickles:");
		niclab.setForeground(Color.ORANGE);
		niclab.setBounds(30, 40, 50, 25);
		frame.getContentPane().add(niclab);
		
		dim = new JTextField();
		dim.setColumns(10);
		dim.setBackground(Color.ORANGE);
		dim.setBounds(90, 69, 143, 25);
		frame.getContentPane().add(dim);
		
		JLabel dimlab = new JLabel("Dimes:");
		dimlab.setForeground(Color.ORANGE);
		dimlab.setBounds(30, 69, 32, 25);
		frame.getContentPane().add(dimlab);
		
		Quart = new JTextField();
		Quart.setColumns(10);
		Quart.setBackground(Color.ORANGE);
		Quart.setBounds(90, 98, 143, 25);
		frame.getContentPane().add(Quart);
		
		JLabel quartlab = new JLabel("Quarters:");
		quartlab.setForeground(Color.ORANGE);
		quartlab.setBounds(30, 98, 50, 25);
		frame.getContentPane().add(quartlab);
		
		JLabel out = new JLabel("");
		out.setForeground(Color.ORANGE);
		out.setBounds(30, 157, 203, 42);
		frame.getContentPane().add(out);
		
		JButton but = new JButton("Enter");
		
		but.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String output = getDollarAmount(Integer.parseInt(pen.getText()), Integer.parseInt(nic.getText()), Integer.parseInt(dim.getText()), Integer.parseInt(Quart.getText()));			
				
				out.setText(output);

			}
		});
		but.setForeground(Color.BLACK);
		but.setBackground(Color.ORANGE);
		but.setBounds(30, 134, 89, 23);
		frame.getContentPane().add(but);
		frame.setBounds(100, 100, 260, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
