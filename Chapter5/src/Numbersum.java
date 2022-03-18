import java.util.Scanner;

/*

Program: Numbersum.java          Last Date of this Revision: March 4th, 2022

Purpose: Create a NumberSum application that prompts the user for a number and then displays the numbers 1 through the number entered, each on a separate line. below the numbers, the sum is displayed.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class Numbersum 
{	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		
		int bignum = 0;
		
		for(int i = 1; i <= num;) //goes up from one to integer entered
		{
			System.out.println(i); //prints how many times loop has ran
			
			bignum = bignum + i; //adds amount of times loop has ran to sum
			i++;
		}
		
		System.out.println("The sum is: " + bignum); //prints sum
		
		input.close();
	}
}
/* Screen Dump

Enter an integer: 
5
1
2
3
4
5
The sum is: 15

Enter an integer: 
20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
The sum is: 210

Enter an integer: 
30
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
The sum is: 465

Enter an integer: 
1
1
The sum is: 1

Enter an integer: 
2
1
2
The sum is: 3

*/