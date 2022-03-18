import java.util.Scanner;

/*

Program: SurfsUp3.java          Last Date of this Revision: February 16th, 2022

Purpose: Modify the SurfsUp application to display "Great day for surfing!" when the waves are 6 feet or over, "Go body boarding!" when the waves are between 3 and 6 feet, "Go form a swim." when the waves are from 0 to 3 feet, and "Whoa! What kind of surf is that?" otherwise.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class SurfsUp3 
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
		else if(num > 3) //checks if wave height is greater than three if less than six
		{
			
			System.out.println("Go body boarding!");

		}
		else if(num >= 0) //checks if wave height greater than zero if less than three
		{
			System.out.println("Go for a swim.");

		}
		else //must be greater than six or less than zero, unusual and informs user
		{
			System.out.println("Whoa! What kind of surf is that?");
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

Enter wave height: 
2.3
Go for a swim.

Enter wave height: 
-5
Whoa! What kind of surf is that?


*/