/*

Chapter 5 CRT:

1. To run the same section of code multiple times

2. a while loop just runs while the condition is true but a do-while loop always runs at least once because it runs once first and then checks for the condition before it continues.

3. We did that in the AccountSetup program.

4. 
	a. A loop where the condition for it to run is always true so it runs forever, generally causing a problem in the program.
	b. syntax errors, logic errors
	c. Overflow is when there are not enough bits to store a number.

5. 59 times

6. Any value less than 120

7. A counter variable counts how many loop iterations while an accumulator accumulates the values calculated from past loops(can be inputs, some kind of calculation, any number)

8.
 		
System.out.println("Enter an integer: ");
		
int calcnum = 0;
		
for(int i = 3; i <= 10;)
{			
	calcnum = calcnum + i;
	i++;
}
		
System.out.println("The sum is: " + calcnum);
		
9. 
For choosing between a for loop or one of the while loops a for loop is better if you know you want it to run a certain amount of times, a while loop is better if you do not know. 
For choosing between while or do-while if you want it to be possible for the loop to not run at all choose while, if you want it to run at least once choose do-while

*/