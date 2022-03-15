import java.util.Scanner;

/*

Program: CubeSum.java          Last Date of this Revision: March 15th, 2022

Purpose: Write a CubeSum application that prompts the user for a non-negative integer and then displays the sum of the cubes of the digits. Application output should look similar to:

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class CubeSum 
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
				calculation = calculation + (int)Math.pow(Math.floor((num%(Math.pow(10, i2 + 1))/Math.pow(10, i2))), 3);
				
				i2 = i2 + 1;
			}
			
			System.out.println("The sum of the cubes of the digits is: " + calculation);
			
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
123
The sum of the cubes of the digits is: 36

Enter a positive integer: 
300030001
The sum of the cubes of the digits is: 55

Enter a positive integer: 
223
The sum of the cubes of the digits is: 43

Enter a positive integer: 
-10
Must be a positive integer

Enter a positive integer: 
0
The sum of the cubes of the digits is: 0

Enter a positive integer: 
99999999
The sum of the cubes of the digits is: 5832

*/