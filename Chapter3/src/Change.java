/*

Program: Change.java          Last Date of this Revision: February 10th, 2022

Purpose: Create a Change application that prompts the user for am amount less than 1$ and then displays the minimum number of coins necessary to make the change. 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

import java.util.Scanner;

public class Change 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Enter the change in cents: ");
		num = input.nextInt();
		
		int calcnum = num;
		int quarters = (calcnum/25);
		int dimes = (calcnum - 25*quarters)/10;
		int nickels = (calcnum - 25*quarters - 10*dimes)/5;
		int pennies = (calcnum - 25*quarters - 10*dimes - 5*nickels);
		
		System.out.println("The minimum number of coins is: ");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
		input.close();
		
	}
}
/* Screen Dump

Enter the change in cents: 
1000
The minimum number of coins is: 
Quarters: 40
Dimes: 0
Nickels: 0
Pennies: 0

Enter the change in cents: 
95
The minimum number of coins is: 
Quarters: 3
Dimes: 2
Nickels: 0
Pennies: 0

Enter the change in cents: 
99
The minimum number of coins is: 
Quarters: 3
Dimes: 2
Nickels: 0
Pennies: 4

Enter the change in cents: 
80
The minimum number of coins is: 
Quarters: 3
Dimes: 0
Nickels: 1
Pennies: 0

*/