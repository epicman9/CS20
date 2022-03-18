import java.util.Scanner;

/*

Program: OddSum.java          Last Date of this Revision: March 4th, 2022

Purpose: Create a OddSum application that prompts the user for a number then sums the odd numbers from 1 to the number entered. 

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class OddSum 
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		
		int bignum = 0;
		
		for(int i = 1; i <= num;) //goes from 1 to the number entered, skipping even numbers
		{
			System.out.println(i);
			
			bignum = bignum + i; //adds current loop number to sum
			i = i + 2;
		}
		
		System.out.println("The sum is: " + bignum); //displays sum
		
		input.close();
	}
}
/* Screen Dump

Enter an integer: 
9
1
3
5
7
9
The sum is: 25

Enter an integer: 
16
1
3
5
7
9
11
13
15
The sum is: 64

Enter an integer: 
6
1
3
5
The sum is: 9

Enter an integer: 
20
1
3
5
7
9
11
13
15
17
19
The sum is: 100


*/