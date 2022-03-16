import java.util.Scanner;

/*

Program: TimeConverter.java          Last Date of this Revision: March 16th, 2022

Purpose: Create a TimeConverter application that allows the user to choose among converting hours to minutes, days to hours, minutes to hours, or hours to days. Use methods as appropriate.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class TimeConverter 
{
	public static void hoursToMinutes() 
	{
		Scanner input = new Scanner(System.in);
		double num = 0;
		
		System.out.println("Enter a the number of hours: ");
		num = input.nextDouble();

		double newnum = num * 60;
		System.out.println(num + " hours is equal to " + newnum + " minutes.");

		input.close();
	}
	
	public static void daysToHours() 
	{
		Scanner input = new Scanner(System.in);
		double num = 0;
		
		System.out.println("Enter a the number of days: ");
		num = input.nextDouble();

		double newnum = num * 24;
		System.out.println(num + " days is equal to " + newnum + " hours.");

		input.close();
	}
	
	public static void minutesToHours() 
	{
		Scanner input = new Scanner(System.in);
		double num = 0;
		
		System.out.println("Enter a the number of minutes: ");
		num = input.nextDouble();

		double newnum = num/60;
		System.out.println(num + " minutes is equal to " + newnum + " hours.");

		input.close();
	}
	
	public static void hoursToDays() 
	{
		Scanner input = new Scanner(System.in);
		double num = 0;
		
		System.out.println("Enter a the number of hours: ");
		num = input.nextDouble();

		double newnum = num/24;
		System.out.println(num + " hours is equal to " + newnum + " days.");

		input.close();
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Choose what you want to convert: \nIf you want to convert hours to minutes enter 1. \nIf you want to convert days to hours enter 2. \nIf you want to convert minutes to hours enter 3. \nIf you want to convert hours to days enter 4.");
		num = input.nextInt();
		
		while(num < 1 || num > 4) 
		{
			System.out.println("Please enter a number from 1 to 4.");
			System.out.println("Choose what you want to convert: \nIf you want to convert hours to minutes enter 1. \nIf you want to convert days to hours enter 2. \nIf you want to convert minutes to hours enter 3. \nIf you want to convert hours to days enter 4.");
			num = input.nextInt();

		}

		if(num == 1) 
		{
			hoursToMinutes();
		}
		else if(num == 2) 
		{
			daysToHours();
		}
		else if(num == 3) 
		{
			minutesToHours();
		}
		else if(num == 4) 
		{
			hoursToDays();
		}
		
		input.close();
	}
}
/*Screen Dump

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
4
Enter a the number of hours: 
24
24.0 hours is equal to 1.0 days.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
5
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
0
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
4
Enter a the number of hours: 
12
12.0 hours is equal to 0.5 days.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
1
Enter a the number of hours: 
2
2.0 hours is equal to 120.0 minutes.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
0
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
5
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
-1
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
1
Enter a the number of hours: 
1.5
1.5 hours is equal to 90.0 minutes.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
2
Enter a the number of days: 
1.5
1.5 days is equal to 36.0 hours.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
0
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
10
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
2
Enter a the number of days: 
2
2.0 days is equal to 48.0 hours.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
-1
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
6
Please enter a number from 1 to 4.
Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
3
Enter a the number of minutes: 
20
20.0 minutes is equal to 0.3333333333333333 hours.

Choose what you want to convert: 
If you want to convert hours to minutes enter 1. 
If you want to convert days to hours enter 2. 
If you want to convert minutes to hours enter 3. 
If you want to convert hours to days enter 4.
3
Enter a the number of minutes: 
30
30.0 minutes is equal to 0.5 hours.

*/