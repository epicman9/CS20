/*

Program: Evens.java          Last Date of this Revision: March 4th, 2022

Purpose: Create an evens application that displays the even numbers between 1 and 20, inclusive.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class Evens 
{
	public static void main(String[] args) 
	{
		for(int i = 2; i <= 20;) //starting at two, goes up through each even number until it reaches twenty
		{
			System.out.println(i); //prints current sum of numbers

			i = i + 2;
		}
	}

}
/* Screen Dump
  
2
4
6
8
10
12
14
16
18
20



*/