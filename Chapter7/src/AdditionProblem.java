public class AdditionProblem 
{
	int num1 = 0;
	int num2 = 0;
	int attemptsmade = 0;
	
	/**
	 * constructor
	 * pre: none
	 * post: A circle object is created. Radius instantiated to 1.
	*/
	public AdditionProblem() 
	{
		num1 = (int)((20 - 1 + 1) * Math.random() + 1); //generate first number from 1 to 20
		num2 = (int)((20 - 1 + 1) * Math.random() + 1); //generate second number from 1 to 20
		attemptsmade = 0;
	}
	
	public boolean attemptProblem(int attempt) 
	{
		if(num1+num2 == attempt) //checks if attempted answer is equal to actual answer
		{
			return true;
		}
		else 
		{
			attemptsmade = attemptsmade + 1;
			return false;
		}
	}
	
	public int getNum1() //returns num1
	{
		return num1;
	}
	
	public int getNum2() //returns num2
	{
		return num2;
	}
	
	public int getAttempts() //returns num3
	{
		return attemptsmade;
	}
	
	public String getProblem() //returns string displaying problem
	{
		return ("What is " + num1 + " + " + num2);
	}
	
	public String getAnswer() //returns string telling the answer
	{
		return ("The answer is " + (num1 + num2));
	}

	public void Reroll() 
	{
		num1 = (int)((20 - 1 + 1) * Math.random() + 1); //generate first number from 1 to 20
		num2 = (int)((20 - 1 + 1) * Math.random() + 1); //generate second number from 1 to 20
		attemptsmade = 0;
	}

}
