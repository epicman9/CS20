import java.util.Scanner;

/*

Program: Hurricane.java          Last Date of this Revision: February 22th, 2022

Purpose: Create a HurricaneScale application that displays the wind speed of the hurricane category entered by the user. Display the speed in miles per hour (mph), knots (kts), and kilometers per hour (km/hr). 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class HurricaneScale 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Enter hurricane category from 1-5: ");
		num = input.nextInt();
				
		
		if(num == 1) 
		{
			System.out.println("Wind speeds of 74-95 mph, 64-82 kt, or 119-153 km/hr ");
		}
		else if(num == 2) 
		{
			System.out.println("Wind speeds of 96-110 mph, 83-95 kt, or 154-177 km/hr ");
		}
		else if(num == 3) 
		{
			System.out.println("Wind speeds of 111-130 mph, 96-113 kt, or 178-209 km/hr ");
		}
		else if(num == 4) 
		{
			System.out.println("Wind speeds of 131-155 mph, 114-135 kt, or 210-249 km/hr ");
		}
		else if(num == 5) 
		{
			System.out.println("Wind greater than 155 mph, 135 kt, or 249 km/hr ");
		}
		else 
		{
			System.out.println("The scale is from 1-5.");		
		}
		
		input.close();
	}
}

/* Screen Dump

Enter hurricane category from 1-5: 
1
Wind speeds of 74-95 mph, 64-82 kt, or 119-153 km/hr 

Enter hurricane category from 1-5: 
2
Wind speeds of 96-110 mph, 83-95 kt, or 154-177 km/hr 

Enter hurricane category from 1-5: 
3
Wind speeds of 111-130 mph, 96-113 kt, or 178-209 km/hr 

Enter hurricane category from 1-5: 
4
Wind speeds of 131-155 mph, 114-135 kt, or 210-249 km/hr 

Enter hurricane category from 1-5: 
5
Wind greater than 155 mph, 135 kt, or 249 km/hr 
 
Enter hurricane category from 1-5: 
6
The scale is from 1-5.

Enter hurricane category from 1-5: 
-1
The scale is from 1-5.

*/