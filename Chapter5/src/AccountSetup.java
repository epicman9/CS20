import java.util.Scanner;

/*

Program: AccountSetup.java          Last Date of this Revision: March 7th, 2022

Purpose: Create a AccountSetup application that prompts the user for a username and password. The application should prompt the use until a password with at least eight characters is entered. The user name and password should be converted to all lower case letters and then an appropriate message displayed.

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class AccountSetup 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String username = "";
		String password = "";

		System.out.println("Enter a username: ");
		username = input.nextLine();
		
		System.out.println("Enter a password that is at least 8 characters: ");
		password = input.nextLine();
		
		while(password.length() < 8)
		{
			System.out.println("Password must be 8 characters. Enter a password that is at least 8 characters: ");
			password = input.nextLine();
		}
		password = password.toLowerCase();

		System.out.println("Your user name is " + username + " and your password is " + password);

	}

}
/* Screen Dump

Ewan Brady
Enter a password that is at least 8 characters: 
password
Your user name is Ewan Brady and your password is password

Enter a username: 
Tom
Enter a password that is at least 8 characters: 
foolery
Password must be 8 characters. Enter a password that is at least 8 characters: 
password
Your user name is Tom and your password is password

Enter a username: 
Jim
Enter a password that is at least 8 characters: 
PaSSword
Your user name is Jim and your password is password

Enter a username: 
steVe
Enter a password that is at least 8 characters: 
jobS
Password must be 8 characters. Enter a password that is at least 8 characters: 
PaSSwOrd
Your user name is steVe and your password is password

*/