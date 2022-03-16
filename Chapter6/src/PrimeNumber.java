import java.util.Scanner;

/*

Program: PrimeNumber.java          Last Date of this Revision: March 16th, 2022

Purpose: 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class PrimeNumber 
{
	public static boolean isPrime(int num) 
	{
	
		boolean bruv;
		
		if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0) 
		{
			bruv = true;
		}
		else 
		{
			bruv = false;
		}
		
		return bruv;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		
		System.out.println("The integer is prime: " + isPrime(num));
		
		input.close();
		
	}
}
/*Screen Dump



*/