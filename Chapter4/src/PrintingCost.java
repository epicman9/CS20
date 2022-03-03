import java.text.NumberFormat;
import java.util.Scanner;

/*

Program: PrintingCost.java          Last Date of this Revision: March 1st, 2022

Purpose: Create a printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/

public class PrintingCost 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		
		boolean alltoplan = true;
		int num;
		double totalcost = 0;
		double costpercopy = 0;
		
		System.out.println("Enter the number of copies to be printed: ");
		num = input.nextInt();
		
		if(num < 0) 
		{
			alltoplan = false;
		}
		if(num < 100) 
		{
			costpercopy = 0.3;
			totalcost = num * costpercopy;
		}
		else if(num < 500)
		{
			costpercopy = 0.28;
			totalcost = num * costpercopy;
		}
		else if(num < 750)
		{
			costpercopy = 0.27;
			totalcost = num * costpercopy;
		}
		else if(num < 1001)
		{
			costpercopy = 0.26;
			totalcost = num * costpercopy;
		}
		else
		{
			costpercopy = 0.25;
			totalcost = num * costpercopy;
		}
		
		if(alltoplan == true) 
		{
			System.out.println("Price per copy is: $" + costpercopy);
			System.out.println("Total cost is: $" + nf.format(totalcost));
		}
		else 
		{
			System.out.println("It is not physically possible to print out negative sheets of paper.");

		}


		
		input.close();
	}
}

/* Screen Dump

Enter the number of copies to be printed: 
-1000
It is not physically possible to print out negative sheets of paper.

Enter the number of copies to be printed: 
1001
Price per copy is: $0.25
Total cost is: $250.25

Enter the number of copies to be printed: 
501
Price per copy is: $0.27
Total cost is: $135.27

Enter the number of copies to be printed: 
255
Price per copy is: $0.28
Total cost is: $71.4

Enter the number of copies to be printed: 
56
Price per copy is: $0.3
Total cost is: $16.8

Enter the number of copies to be printed: 
752
Price per copy is: $0.26
Total cost is: $195.52

*/