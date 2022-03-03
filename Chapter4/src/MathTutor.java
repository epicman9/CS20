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
		
		int num1 = (int)((10 - 1 + 1) * Math.random() + 1);
		int num2 = (int)((10 - 1 + 1) * Math.random() + 1);
		int operator = (int)((4 - 1 + 1) * Math.random() + 1);
		
		double num3 = 0;
		
		if(operator == 1) 
		{
			System.out.println("What is " + num1 + " + " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 + num2)) 
			{
				System.out.println("Correct!");
			}
			else 
			{
				System.out.println("Incorrect, the answer is " + (num1 + num2));
			}
		}
		else if(operator == 2) 
		{
			System.out.println("What is " + num1 + " - " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 - num2)) 
			{
				System.out.println("Correct!");
			}
			else 
			{
				System.out.println("Incorrect, the answer is " + (num1 - num2));
			}
		}
		else if(operator == 3) 
		{
			System.out.println("What is " + num1 + " * " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 * num2)) 
			{
				System.out.println("Correct!");
			}
			else 
			{
				System.out.println("Incorrect, the answer is " + (num1 * num2));
			}
		}
		else if(operator == 4) 
		{
			if(num1 % num2 != 0) //this loop is here because sometimes the two numbers that dont evenly divide would be generated..
			{
				for(int whydoIhavethavethisnumber; num1 % num2 != 0;) 
				{
					num1 = (int)((10 - 1 + 1) * Math.random() + 1);
					num2 = (int)((10 - 1 + 1) * Math.random() + 1);
				}
			}
			
			System.out.println("What is " + num1 + " / " + num2);
			num3 = input.nextInt();
			
			if(num3 == (num1 / num2)) 
			{
				System.out.println("Correct!");
			}
			else 
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