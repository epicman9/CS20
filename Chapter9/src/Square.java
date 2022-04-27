import java.util.Scanner;
/*

Program: Square.java          Last Date of this Revision: April 27th, 2022

Purpose: Create a Squares application that stores the square of an element's index in an integer array of 5 elements. For example, the third element, which has index 2, should store 4. The application should then display the value of each element in the array.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
import java.util.Scanner;


public class Square 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter an the size of the array you want: ");
		num = input.nextInt();
		
		
		int[] nums = new int[num];
		
		for(int i = 0; i <= nums.length-1;) 
		{
			nums[i] = i*i;
			i++;
		}
		
		for(int i = 0; i <= nums.length-1; i++) 
		{
			System.out.println(nums[i]);	

		}		
	}
}
/* Screen Dump

0
1
4
9
16

*/