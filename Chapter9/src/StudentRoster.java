/*

Program: StudentRoster.java          Last Date of this Revision: April 26th, 2022

Purpose: Create a StudentRoster application that prompts the user for the number of students in the class and then prompts the user for each students name and stores the names in array. after all the names gave been entered, the application should display the title "Student Roster" and then list all the names in the array.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
import java.util.Scanner;

public class StudentRoster 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter an integer: ");
		num = input.nextInt() + 1; //takes the integer entered and adds one to account for the fact that 0 dosnt work in the students asking loop for some reason
		
		if(num >= 2) //ensures there is at least 1 student. the reason it is 2 is because num has 1 added to it.
		{
			String[] names;
			names = new String[num];
			
			for(int i = 0; i <= names.length-1; i++) //asks for each students name. 0 diddnt work for some reason so I put the output below the input and just had the input skip 0 and the output skip the final number. the one added to the input allows for this.
			{
				names[i] = input.nextLine();	
				if(i != names.length-1) 
				{				
					System.out.println("Enter the name of a student that hasnt already been entered");
				}

			}
			
			System.out.println("Student Roster");

			for(int i = 0; i <= names.length-1; i++) //goes through each student and prints their name
			{
				if(i != 0) 
				{
					System.out.println(names[i]);	
				}
			}			
		}
		else 
		{
			System.out.println("Must have at least one student.");

		}
		
	
	}
}
/* Screen dump

Enter an integer: 
3
Enter the name of a student that hasnt already been entered
bill
Enter the name of a student that hasnt already been entered
tom
Enter the name of a student that hasnt already been entered
tim
Student Roster
bill
tom
tim

Enter an integer: 
-2
Must have at least one student.

Enter an integer: 
0
Must have at least one student.

Enter an integer: 
1
Enter the name of a student that hasnt already been entered
bob
Student Roster
bob

Enter an integer: 
5
Enter the name of a student that hasnt already been entered
tim
Enter the name of a student that hasnt already been entered
tom
Enter the name of a student that hasnt already been entered
jim
Enter the name of a student that hasnt already been entered
timmy
Enter the name of a student that hasnt already been entered
timmothy
Student Roster
tim
tom
jim
timmy
timmothy

*/