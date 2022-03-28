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

/*

Program: PrimeNumberGUI.java          Last Date of this Revision: March 17th, 2022

Purpose: Create a PrimeNumber application that has a GUI where you can enter any number and it will tell you if it is prime.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/


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
	
	public static boolean isPrime(int num) 
	{
	
		boolean bruv;
		
		if (num <= 1) //prime numbers are greater than one, so checks if less than or equal to one
		{
			bruv = false; //sets return variable to false
		}
		else if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0 || num == 2 || num == 3 || num == 5 || num == 7 || num == 11) //checks if number evenly divides by any numbers and that it is not 2, 3, 5, 7, or 11
		{
			bruv = true; //sets return variable to true
		}
		else //otherwise it is not prime
		{
			bruv = false; //sets return variable to false
		}
		
		return bruv;
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Back = new JPanel();
		Back.setBounds(0, 0, 357, 186);
		Back.setBackground(Color.BLACK);
		frame.getContentPane().add(Back);
		Back.setLayout(null);
		
		JLabel tex = new JLabel("Enter an integer: ");
		tex.setForeground(Color.ORANGE);
		tex.setBackground(Color.WHITE);
		tex.setBounds(53, 15, 100, 14);
		Back.add(tex);
		
		JLabel out = new JLabel("");
		out.setForeground(Color.ORANGE);
		out.setBounds(59, 99, 208, 42);
		Back.add(out);
		
		JButton but = new JButton("Enter");
		
		but.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				int num = 0;
				
				num = (int)Integer.parseInt(inp.getText()); //gets input
				
				out.setText("The integer is prime: " + isPrime(num)); //puts weather input is prime in output label when button pressed

			}
		});
		but.setBackground(Color.ORANGE);
		but.setBounds(242, 11, 89, 23);
		Back.add(but);
		
		inp = new JTextField();
		inp.setBounds(146, 12, 86, 20);
		Back.add(inp);
		inp.setColumns(10);
		//.
	}
}