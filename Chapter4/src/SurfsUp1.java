import java.util.Scanner;

/*

Program: SurfsUp1.java          Last Date of this Revision: February 16th, 2022

Purpose: Create a SurfsUp application that prompts the user for the wave height and then displays "Great day for surfing!" when the waves are 6 feet and over. 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class SurfsUp1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num = 0;
		
		System.out.println("Enter wave height: ");
		num = input.nextDouble();
		
		if(num >= 6) 
		{
			System.out.println("Great day for surfing!");

		}
		
		input.close();
	}
}
/* Screen Dump

Enter wave height: 
6
Great day for surfing!

Enter wave height: 
6.111
Great day for surfing!

Enter wave height: 
4.2

*/