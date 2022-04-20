/*

Program: CircleTester.java          Last Date of this Revision: April 20th, 2022

Purpose: Create a circle class which has a circumfrence() function, an overloaded constructor that accepts a starting radius, displayAreaFormula() function, and overrides for equals() and toString(). Edit the client code to test this class (this is that edited client code)

Author: Ewan Brady
School: CHHS
Course: Computer Programming 20
  

*/
public class CircleTester 
{
	public static void main(String[] args) 
	{
		Circle spot = new Circle(5);
		Circle spot2 = new Circle(5);
		Circle spot3 = new Circle(7);

		//spot.setRadius(3);
		System.out.println("First " + spot.toString());
		System.out.println("Second " + spot2.toString());
		System.out.println("Third " + spot3.toString());

		System.out.println("First circle circumference: " + spot.getCircumference());
		Circle.displayAreaFormula();
		System.out.println("First circle equal to second circle: " + (spot.equals(spot2)));
		System.out.println("First circle equal to third circle: " + (spot.equals(spot3)));

	}
}
/* Screen dump

First Circle has radius 5.0
Second Circle has radius 5.0
Third Circle has radius 7.0
First circle circumference: 31.4159
The formula for the area of a circle is a=Pi*r*r
First circle equal to second circle: true
First circle equal to third circle: false

*/