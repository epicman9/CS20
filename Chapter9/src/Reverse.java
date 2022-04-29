import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reverse {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reverse window = new Reverse();
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
	public Reverse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 421, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 413, 273);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Integer to count down from:");
		title.setForeground(Color.ORANGE);
		title.setBounds(10, 11, 166, 24);
		panel.add(title);
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		textField.setBounds(179, 13, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea tA = new JTextArea();
		tA.setEditable(false);
		tA.setForeground(Color.ORANGE);
		tA.setBackground(Color.BLACK);
		tA.setBounds(10, 80, 381, 182);
		panel.add(tA);
		
		tA.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Do it");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int countnum = (int)Integer.parseInt(textField.getText()); //gets the number entered by the user.
				
				if(countnum <= 182 && countnum > 0) //makes sure it is within range of 0 to 182
				{
					int[] countdown = new int[countnum]; //makes array of the size entered by user
					
					String countdowntext = ""; //makes string variable
					
					for(int i = countdown.length; i >= 0; i--) //goes through each number in array until it reaches 0 starting at top
					{
						countdowntext = countdowntext + i; //adds number to the count down
						
						if(i != 0) //checks that not at final number in array
						{
							countdowntext = countdowntext + ", "; //adds comma for next number
						}
					}
					
					tA.setText(countdowntext); //sets text of text box to string created
				}
				else if(countnum > 182) //tells user too high
				{
					tA.setText("Cannot count down from numbers greater than 182");	
				}
				else //tells user too low
				{
					tA.setText("must be a positive integer.");	
				}

			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(10, 46, 68, 23);
		panel.add(btnNewButton);
		
		
	}
}
