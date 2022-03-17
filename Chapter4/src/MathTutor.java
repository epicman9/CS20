import java.util.Scanner;

/*

Program: MathTutor.java          Last Date of this Revision: March 2nd, 2022

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator (*,+,-,/), and then prompts the user for an answer. The application should check the answer, display a message, and the correct answer if necessary.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class MathTutor 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)((10 - 1 + 1) * Math.random() + 1); //generate first number from 1 to 10
		int num2 = (int)((10 - 1 + 1) * Math.random() + 1); //generate second number from 1 to 10
		int operator = (int)((4 - 1 + 1) * Math.random() + 1); //generate a number from 1 to 4 to decide the operator in between two random nums
		
		double num3 = 0;
		
		if(operator == 1) //third randomnum came out as 1, so operator is addition
		{
			System.out.println("What is " + num1 + " + " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 + num2)) //checks if user got answer correct
			{
				System.out.println("Correct!");
			}
			else //tells user they got answer incorrect
			{
				System.out.println("Incorrect, the answer is " + (num1 + num2));
			}
		}
		else if(operator == 2)  //third randomnum came out as 2, so operator is subtraction
		{
			System.out.println("What is " + num1 + " - " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 - num2)) //checks if user got answer correct
			{
				System.out.println("Correct!");
			}
			else //tells user they got answer incorrect
			{
				System.out.println("Incorrect, the answer is " + (num1 - num2));
			}
		}
		else if(operator == 3) //third randomnum came out as 3, so operator is multiplication
		{
			System.out.println("What is " + num1 + " * " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 * num2)) //checks if user got answer correct
			{
				System.out.println("Correct!");
			}
			else //tells user they got answer incorrect
			{
				System.out.println("Incorrect, the answer is " + (num1 * num2));
			}
		}
		else if(operator == 4)  //third randomnum came out as 4, so operator is division
		{
			if(num1 % num2 != 0) //this loop is here because sometimes the two numbers that dont evenly divide would be generated, this re generates the random numbers until they evenly divide.
			{
				for(int whydoIhavethavethisnumber; num1 % num2 != 0;) 
				{
					num1 = (int)((10 - 1 + 1) * Math.random() + 1); //re generate first random number
					num2 = (int)((10 - 1 + 1) * Math.random() + 1); //re generate second random number
				}
			}
			
			System.out.println("What is " + num1 + " / " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 / num2)) //checks if user got answer correct
			{
				System.out.println("Correct!");
			}
			else //tells user they got answer incorrect
			{
				System.out.println("Incorrect, the answer is " + (num1 / num2));
			}
		}
		
		input.close();
	}
}
/* Screen Dump

What is 1 / 1
1
Correct!

What is 6 - 10
-4
Correct!

What is 10 + 1
0
Incorrect, the answer is 11

What is 6 / 2
3
Correct!

What is 3 * 1
3
Correct!

What is 2 + 7
9
Correct!

What is 10 + 7
17
Correct!

What is 2 - 10
-8
Correct!

What is 2 - 9
-7
Correct!

What is 3 / 1
0
Incorrect, the answer is 3

What is 9 * 3
3
Incorrect, the answer is 27

What is 1 + 9
9
Incorrect, the answer is 10

*/