/*

Program: mysaving.java          Last Date of this Revision: April 20th, 2022

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection. The MySavings application should include a PiggyBank object that can add coins to the piggy bank, remove coins, and return the total amount in the bank.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mysaving {

	boolean removing = false;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mysaving window = new mysaving();
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
	public mysaving() {
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
		PiggyBank bank = new PiggyBank();
		
		JPanel back = new JPanel();
		back.setBackground(Color.BLACK);
		back.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(back);
		back.setLayout(null);
		
		
		JLabel tot = new JLabel("Total money in bank: 0.0$");
		tot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tot.setForeground(Color.ORANGE);
		tot.setBounds(232, 63, 177, 29);
		back.add(tot);
		
		JButton pen = new JButton("Penny");
		pen.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bank.changePenny(removing);
				tot.setText(bank.getTotal());
			}
		});
		pen.setBackground(Color.ORANGE);
		pen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pen.setBounds(20, 35, 89, 23);
		back.add(pen);
		
		JLabel coinLabel = new JLabel("Add a:");
		coinLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		coinLabel.setForeground(Color.ORANGE);
		coinLabel.setBounds(10, 11, 99, 23);
		back.add(coinLabel);
		
		JButton nic = new JButton("Nickel");
		nic.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bank.changeNickel(removing);
				tot.setText(bank.getTotal());

			}
		});
		nic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nic.setBackground(Color.ORANGE);
		nic.setBounds(20, 69, 89, 23);
		back.add(nic);
		
		
		JButton dim = new JButton("Dime");
		dim.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bank.changeDime(removing);
				tot.setText(bank.getTotal());

			}
		});
		dim.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dim.setBackground(Color.ORANGE);
		dim.setBounds(20, 103, 89, 23);
		back.add(dim);
		
		JButton quart = new JButton("Quarter");
		quart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bank.changeQuarter(removing);
				tot.setText(bank.getTotal());

			}
		});
		quart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		quart.setBackground(Color.ORANGE);
		quart.setBounds(20, 137, 89, 23);
		back.add(quart);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(174, 0, 10, 261);
		back.add(panel);
		
		JButton swi = new JButton("Take money out of bank");
		swi.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				removing = !removing;
				if(removing == true) 
				{
					swi.setText("Put money into bank");
					coinLabel.setText("Remove a:");
				}
				else 
				{
					swi.setText("Take money out of bank");
					coinLabel.setText("Add a:");
				}
				tot.setText(bank.getTotal());

			}
		});
		swi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		swi.setBackground(Color.ORANGE);
		swi.setBounds(232, 138, 177, 23);
		back.add(swi);

	}
}
