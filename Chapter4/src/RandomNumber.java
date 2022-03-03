import java.util.Scanner;

/*

Program: RandomNumber.java          Last Date of this Revision: March 1st, 2022

Purpose: Create a RandomNumber application that prompts the user for a minimum and a maximum, then displays a random integer in between the minimum and the maximum

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class RandomNumber 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double min = 0;
		double max = 0;

		System.out.println("Enter the minimum value: ");
		min = input.nextDouble();
		System.out.println("Enter the maximum value: ");
		max = input.nextDouble();
		
		int finalnum = 0;
		boolean printfinalnum = true;
		
		if(Math.abs(max) < 1 && Math.abs(min) < 1 && min < max && min < 0 && max > 0) 
		{
			finalnum = 0; //I have this section in here because in this scenario the only integer between them is 0
		}
		else if(min < max && max >= 0 && (Math.floor(max) != Math.floor(min)))
		{
			finalnum = (int)((max - min + 1) * Math.random() + min);
		}
		else if(max <= 0 && min < max && (Math.floor(max) != Math.floor(min))) 
		{
			finalnum = (int)((max - min - 1) * Math.random() + min);
		}
		else if((Math.floor(max) == Math.floor(min)))
		{
			System.out.println("Must have an integer between minimum and maximum");
			printfinalnum = false;
		}
		else 
		{
			System.out.println("Maximum must be greater than minimum."); 
			printfinalnum = false;
		}
		
		
		/*
		The loop below this comment is to fix an issue where this would happen
		 
		Enter the minimum value: 
		0.1
		Enter the maximum value: 
	 	1.01
	 	Random number: 0
	 	
	 	this is an issue because the only integer between these two values is 1, and thus the program should output 1.
		*/
		if(finalnum == 0 && min > 0 || finalnum == 0 && max < 0) 
		{
			for(int fixingnum = 0; finalnum == 0;) 
			{
				if(min < max && max >= 1 && (Math.floor(max) != Math.floor(min))) 
				{
					fixingnum = (int)((max - min + 1) * Math.random() + min);
					
				}
				else if(max <= -1 && min < max && (Math.floor(max) != Math.floor(min))) 
				{
					fixingnum = (int)((max - min - 1) * Math.random() + min);

				}
				finalnum = fixingnum;

			}
		}
		
		if(printfinalnum == true) 
		{
			System.out.println("Random number: " + finalnum);			
		}
		
		input.close();
	}

}
/* Screen Dump

Enter the minimum value: 
0.1
Enter the maximum value: 
1.00001
Random number: 1

Enter the minimum value: 
-0.99
Enter the maximum value: 
0.99
Random number: 0

Enter the minimum value: 
0.1
Enter the maximum value: 
0.99
Must have an integer between minimum and maximum

Enter the minimum value: 
-10
Enter the maximum value: 
10
Random number: -4

Enter the minimum value: 
-10
Enter the maximum value: 
10
Random number: 8

Enter the minimum value: 
-50000000
Enter the maximum value: 
5000000
Random number: -26145111

Enter the minimum value: 
10
Enter the maximum value: 
200
Random number: 165

Enter the minimum value: 
-200
Enter the maximum value: 
-10
Random number: -96

Enter the minimum value: 
-10
Enter the maximum value: 
-200
Maximum must be greater than minimum.

Enter the minimum value: 
500
Enter the maximum value: 
10
Maximum must be greater than minimum.

*/