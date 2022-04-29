//roll a number from 3 random rolls of 6 and add them together. then add 1 to the index at this number in array, example you roll 18 so you add one to [18]. will have to not display indexes 0-2.
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Dicerolls {

	private JFrame frame;
	private JTextField inp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Dicerolls window = new Dicerolls();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dicerolls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 217, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 203, 610);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel titl = new JLabel("Number of rolls:");
		titl.setForeground(Color.ORANGE);
		titl.setBounds(10, 11, 97, 14);
		panel.add(titl);
		
		inp = new JTextField();
		inp.setBackground(Color.ORANGE);
		inp.setBounds(107, 8, 86, 20);
		panel.add(inp);
		inp.setColumns(10);
		
		JTextArea output = new JTextArea();
		output.setForeground(Color.ORANGE);
		output.setEditable(false);
		output.setWrapStyleWord(true);
		output.setBackground(Color.BLACK);
		output.setBounds(10, 65, 183, 285);
		panel.add(output);
		
		JButton but = new JButton("Roll!");
		but.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int inpnum = (int)Integer.parseInt(inp.getText()); //gets the number entered by the user.
				int[] rolls = new int[19];
				
				if(inpnum > 0) //checks if positive number
				{
					for(int i = 1; i <= inpnum; i++) //goes through each number in array until it reaches 0 starting at top
					{
						int calculation = (int)((6) * Math.random() + 1) + (int)((6) * Math.random() + 1) + (int)((6) * Math.random() + 1); //generate a diceroll
						
						rolls[calculation] += 1; //adds one to index of diceroll
					}
					
					String outputtext = ""; //makes string variable to later be output
					
					for(int i = 0; i <= 18; i++) //goes through each possible roll and displays it
					{
						if(i>=3) //a roll less than 3 is impossible so those indexes dont display
						{
							outputtext = outputtext + i + ": " + rolls[i] + "\n"; //adds the output for that roll to the string
						}
					}
					
					output.setText(outputtext); //sets text of text box to string created	
				}
				else 
				{
					output.setText("must be a positive number."); //informs user that must be a positive number
				}
			}
		});
		but.setBackground(Color.ORANGE);
		but.setBounds(50, 35, 89, 23);
		panel.add(but);
	}
}
