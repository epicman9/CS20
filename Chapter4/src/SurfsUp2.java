import java.util.Scanner;

/*

Program: SurfsUp2.java          Last Date of this Revision: February 16th, 2022

Purpose: Modify the SurfsUp application to display "Great day for surfing!" when the waves are 6 feet or over and "Go body boarding!" when the waves are less than 6 feet.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class SurfsUp2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num = 0;
		
		System.out.println("Enter wave height: ");
		num = input.nextDouble();
		
		if(num >= 6) //checks if wave height is greater than or equal to six
		{
			System.out.println("Great day for surfing!");

		}
		else if(num >= 0) //checks if wave height is greater than equal to zero if less than six
		{
			System.out.println("Go body boarding!");

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
Go body boarding!


*/