/*

Program: RectanglePerimeter.java          Last Date of this Revision: February 8th, 2022

Purpose: Create a RectanglePerimeter application that calculates and displays the perimeter of a rectangle with width 4 and length 13. 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
		double width = 0;
		double height = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the width of the rectangle: ");		
		width = input.nextDouble();
		
		if(width <= 0) 
		{
			System.out.println("Must be a positive number.");
		}
		else 
		{
			System.out.println("Enter the height of the rectangle: ");
			height = input.nextDouble();

			if(height <= 0) 
			{
				System.out.println("Must be a positive number.");
			}
			else 
			{
				double calculation = width*2 + height*2;
				
				System.out.println("The perimeter of the rectangle is: " + calculation);
			}	
		}
		
	}

}


/* Screen Dump
Enter the width of the rectangle: 
4
Enter the height of the rectangle: 
13
The perimeter of the rectangle is: 34.0

Enter the width of the rectangle: 
4
Enter the height of the rectangle: 
-13
Must be a positive number

Enter the width of the rectangle: 
-4
Must be a positive number.

Enter the width of the rectangle: 
5
Enter the height of the rectangle: 
10
The perimeter of the rectangle is: 30.0

*/