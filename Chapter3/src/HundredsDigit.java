import java.util.Scanner;

/*

Program: HundredsDigit.java          Last Date of this Revision: February 10th, 2022

Purpose: Modify the digits application created in a review earlier in this chapter to show the hundreds-place digit of a three digit number.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;


public class HundredsDigit 
{
	public static void main(String[] args) 
	{
		double num;
		
		System.out.println("Enter a three-digit number");
		
		Scanner input = new Scanner(System.in);
		num = input.nextDouble();
		
		if(num >= 100 && num < 1000) 
		{
			int num3 = (int)(num%100)%10;
			int num2 = (int)((num%100 - num3)/10);
			int num1 = (int)((num - num%100)/100);
			
			System.out.println("Hundreds-place digit: " + num1);
			System.out.println("Tens-place digit: " + num2);	
			System.out.println("Ones-place digit: " + num3);	

		}
		else if(-num >= 100 && -num < 1000)
		{			
			int num3 = (int)((num%100)%10)*-1;
			int num2 = (int)((num%100 + num3)/-10);
			int num1 = (int)((num - num%100)/-100);
			
			System.out.println("Hundreds-place digit: " + num1);
			System.out.println("Tens-place digit: " + num2);	
			System.out.println("Ones-place digit: " + num3);	
		}
		else 
		{
			System.out.println("Number was not a three digit number");
		}
		
		input.close();
	}
}
/* Screen Dump

Enter a three-digit number
-456
Hundreds-place digit: 4
Tens-place digit: 5
Ones-place digit: 6

Enter a three-digit number
45
Number was not a three digit number

Enter a three-digit number
502
Hundreds-place digit: 5
Tens-place digit: 0
Ones-place digit: 2

*/
