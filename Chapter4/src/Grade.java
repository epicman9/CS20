import java.util.Scanner;

/*

Program: Grade.java          Last Date of this Revision: March 1st, 2022

Purpose: Create a grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class Grade 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num = 0;
		
		System.out.println("Enter the percentage: ");
		num = input.nextDouble();

		if(num < 60 && num > 0) 
		{
			System.out.println("The corresponding letter grade is: F");
		}
		else if(num < 70 && num > 0) 
		{
			System.out.println("The corresponding letter grade is: D");
		}
		else if(num < 80 && num > 0)
		{
			System.out.println("The corresponding letter grade is: C");
		}
		else if(num < 90 && num > 0)
		{
			System.out.println("The corresponding letter grade is: B");
		}
		else if(num <= 100 && num > 0)
		{
			System.out.println("The corresponding letter grade is: A");
		}
		else
		{
			System.out.println("Not on the grading scale, must be between 0-100");
		}
		
		input.close();
	}
}
/* Screen Dump

Enter the percentage: 
-100
Not on the grading scale, must be between 0-100

Enter the percentage: 
200
Not on the grading scale, must be between 0-100

Enter the percentage: 
55
The corresponding letter grade is: F

Enter the percentage: 
65
The corresponding letter grade is: D

Enter the percentage: 
75
The corresponding letter grade is: C

Enter the percentage: 
85
The corresponding letter grade is: B

Enter the percentage: 
95
The corresponding letter grade is: A

*/