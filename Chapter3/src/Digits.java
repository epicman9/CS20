/*

Program: Digits.java          Last Date of this Revision: February 8th, 2022

Purpose: Create a Digits application that prompts the user for a two-digit number and then displays the ones-place and tens-place digits.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		double num;
		
		System.out.println("Enter a two digit number");
		
		Scanner input = new Scanner(System.in);
		num = input.nextDouble();
		
		if(num >= 10 && num < 100) 
		{
			int num1 = (int)num%10;
			int num2 = (int)((num - num1) / 10);
			
			System.out.println("Ones-place digit: " + num1);
			System.out.println("Tens-place digit: " + num2);	

		}
		else if(-num >= 10 && -num < 100)
		{			
			int num1 = (int)-num%10;
			int num2 = (int)(-(num + num1) / 10);
			
			System.out.println("Ones-place digit: " + num1);
			System.out.println("Tens-place digit: " + num2);
			
		}
		else 
		{
			System.out.println("Number was not a two digit number");
		}
		
		input.close();
	}

}
/* Screen Dump

Enter a two digit number
-46
Ones-place digit: 6
Tens-place digit: 5


Enter a two digit number
999
Number was not a two digit number


Enter a two digit number
46.7
Ones-place digit: 6
Tens-place digit: 4

*/