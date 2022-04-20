/*

Program: mysaving.java          Last Date of this Revision: April 20th, 2022

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection. The MySavings application should include a PiggyBank object that can add coins to the piggy bank, remove coins, and return the total amount in the bank.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class PiggyBank 
{
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;

	
	/**
	 * constructor
	 * pre: none
	 * post: A piggybank object is created. coin amounts instantiated to zero.
	*/
	public PiggyBank() 
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: pennies increases or decreases by 1.
	*/
	public void changePenny(boolean remove) 
	{
		if(remove == false)
		{
			pennies = pennies + 1;
		}
		else if(pennies > 0)
		{
			pennies = pennies - 1;
		}
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: nickels increases or decreases by 1.
	*/
	public void changeNickel(boolean remove) 
	{
		if(remove == false)
		{
			nickels = nickels + 1;
		}
		else if(nickels > 0)
		{
			nickels = nickels - 1;
		}	
		
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: dimes increases or decreases by 1.
	*/
	public void changeDime(boolean remove) 
	{
		if(remove == false)
		{
			dimes = dimes + 1;
		}
		else if(dimes > 0)
		{
			dimes = dimes - 1;
		}	
	
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: Quarters increases or decreases by 1.
	*/
	public void changeQuarter(boolean remove) 
	{
		if(remove == false)
		{
			quarters = quarters + 1;
		}
		else  if(quarters > 0)
		{
			quarters = quarters - 1;
		}	
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: Returns total money in piggybank
	*/
	public String getTotal() 
	{
		double total = ((25 * quarters + 10 * dimes + 5 * nickels + pennies)); //calculates total cents in bank
		return ("Total money in bank: " + total/100 + "$"); //output and divides cents by 100 to get dollars
	}
}
