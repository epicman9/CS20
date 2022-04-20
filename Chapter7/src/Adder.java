/*

Program: Adder.java          Last Date of this Revision: April 20th, 2022

Purpose: The Adder game prompts a player for the answer to an addition problem. The Adder game creates a problem from two randomly selected integers between 0 and 20. Adder allows the player three tries to enter a correct answer. If the correct answer is entered on the first try, the player is awarded 5 points. If the correct answer is entered on the second try, 3 points are awarded. The correct answer on the third try it earns one point. if after three tries, the correct answer is still not entered, the player recieves no points and the correct answer is displayed. At the end of the game, Adder displays the player's score. 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Adder {

	private JFrame frame;
	private JTextField inp;

	boolean nextprob;
	int score;
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
		AdditionProblem problem = new AdditionProblem();
		nextprob = false;
		score = 0;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 150, 225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel prob = new JLabel(problem.getProblem());
		prob.setFont(new Font("Tahoma", Font.PLAIN, 12));
		prob.setForeground(Color.ORANGE);
		prob.setBounds(10, 11, 146, 23);
		panel.add(prob);
		
		JLabel atemp = new JLabel("Enter");
		atemp.setForeground(Color.ORANGE);
		atemp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		atemp.setBounds(10, 71, 146, 23);
		panel.add(atemp);
		
		JLabel scor = new JLabel("Total score: 0");
		scor.setForeground(Color.ORANGE);
		scor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scor.setBounds(10, 154, 114, 23);
		panel.add(scor);
		
		inp = new JTextField();
		   
		inp.addKeyListener(new KeyAdapter() 
		{
		    public void keyTyped(KeyEvent e) 
		    {
		        char c = e.getKeyChar();
		        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) 
		        {
		            e.consume();  // if it's not a number, ignore the event
		        }
		     }
		});
		inp.setBackground(Color.ORANGE);
		inp.setBounds(10, 45, 112, 20);
		panel.add(inp);
		inp.setColumns(10);
		
		JButton but = new JButton("Try again");
		but.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				boolean attempt = problem.attemptProblem((Integer.parseInt(inp.getText())));

				if(nextprob == false) 
				{
					if(attempt == true) 
					{
						atemp.setText("Correct!");
						but.setText("Next problem");
						nextprob = true;
						
						if(problem.attemptsmade == 0) //sees number of attempts made and gives apropriate score based on attempts
						{
							score = score + 5;
						}
						else if(problem.attemptsmade == 1) 
						{
							score = score + 3;
						}
						else 
						{
							score = score + 1;
						}
						
						scor.setText("Total score: " + score);

					}
					else 
					{
						if(problem.getAttempts() == 3) //checks if 3 attempts have been made and if so moves on to next problem, if not so allows more attempts
						{
							atemp.setText(problem.getAnswer());
							but.setText("Next problem");
							nextprob = true;
						}
						else 
						{
							atemp.setText("Attempts " + problem.getAttempts()); 
							but.setText("Try again");
						}
					}
				}
				else 
				{
					problem.Reroll(); //creates a new problem
					
					atemp.setText("Attempts " + problem.getAttempts()); //sets UI texts.
					but.setText("Enter");
					prob.setText(problem.getProblem());
					
					nextprob = false; //is now at a new problem.

				}
			}
		});
		but.setFont(new Font("Tahoma", Font.PLAIN, 12));
		but.setBackground(Color.ORANGE);
		but.setBounds(10, 105, 112, 23);
		panel.add(but);

	}
}
