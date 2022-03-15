import java.util.Scanner;

/*

Program: DigitSum.java          Last Date of this Revision: March 15th, 2022

Purpose: Write a DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits. Application output should look similar to:

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class DigitSum 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num;

		System.out.println("Enter a positive integer: ");
		num = input.nextInt();

		if(num >= 0)
		{
		
			int digitnum = 0;
			for (int i = 0; Math.pow(10, i) <= num;) 
			{
				digitnum = digitnum + 1;
				i = i + 1;
			}
			

			int calculation = 0;
			int prevnum = 0;
			for (int i2 = 0; i2 < digitnum;) 
			{
				calculation = calculation + (int)Math.floor((num%(Math.pow(10, i2 + 1))/Math.pow(10, i2)));
				
				i2 = i2 + 1;
			}
			
			System.out.println("The sum of the digits is: " + calculation);
			
		}
		else 
		{
			System.out.println("Must be a positive integer");
		}

		input.close();
	}
}
/*Screen Dump

Enter a positive integer: 
1234
The sum of the digits is: 10

Enter a positive integer: 
100000001
The sum of the digits is: 2

Enter a positive integer: 
9009009
The sum of the digits is: 27

Enter a positive integer: 
0
The sum of the digits is: 0

Enter a positive integer: 
-1000
Must be a positive integer

*/