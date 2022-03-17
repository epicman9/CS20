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
		
		NumberFormat nf = NumberFormat.getNumberInstance(); //fixes issue where there would be lots of 0s at end by making it go to the hundredth
		
		boolean alltoplan = true; //bool to check if negative number of sheets of paper
		int num; //number of sheets of paper
		double totalcost = 0;
		double costpercopy = 0;
		
		System.out.println("Enter the number of copies to be printed: ");
		num = input.nextInt();
		
		if(num < 0) //checks if negative amount of paper, if so a seprate message will be printed when program ends
		{
			alltoplan = false;
		}
		if(num < 100) //checks if less than 100 sheets of paper
		{
			costpercopy = 0.3; //sets cost per paper to 0.3 because less than 1000 sheets of paper
			totalcost = num * costpercopy; //calculates total cost for paper
		}
		else if(num < 500) //checks if less than 500 sheets of paper
		{
			costpercopy = 0.28; //sets cost per paper to 0.28 because less than 500 sheets of paper
			totalcost = num * costpercopy; //calculates total cost for paper
		}
		else if(num < 750) //checks if less than 750 sheets of paper
		{
			costpercopy = 0.27; //sets cost per paper to 0.27 because less than 750 sheets of paper
			totalcost = num * costpercopy; //calculates total cost for paper
		}
		else if(num < 1001) //checks if less than 1001 sheets of paper
		{
			costpercopy = 0.26; //sets cost per paper to 0.26 because less than 1001 sheets of paper
			totalcost = num * costpercopy; //calculates total cost for paper
		}
		else
		{
			costpercopy = 0.25; //sets cost per paper to 0.3 because greater than or equal to 1001 sheets of paper
			totalcost = num * costpercopy; //calculates total cost for paper
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