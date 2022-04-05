public class Circle 
{

	private static final double PI = 3.14159;
	private double radius;
	
	/**
	 * constructor
	 * pre: none
	 * post: A circle object is created. Radius instantiated to 1.
	*/
	public Circle() 
	{
		radius = 1; //default radius
	}

	/**
	 * constructor
	 * pre: none
	 * post: A circle object is created. Radius instantiated to chosen number.
	*/
	public Circle(double rad) 
	{
		radius = rad; //default radius
	}
	
	
	/**
	 * Changes the radius of the circle.
	 * pre: none
	 * post: Radius has been changed.
	*/
	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	}
	
	
	/**
	 * Calculates the area of the circle
	 * pre: none
	 * post: The area of the circle has been returned
	*/
	public double area() 
	{
		double circleArea;
		
		circleArea = PI*radius*radius;
		return(circleArea);
	}
	
	
	/**
	 * Returns the radius of the circle.
	 * pre: none
	 * post: The radius of the circle has been returned
	*/
	public double getRadius() 
	{
		return(radius);
	}
	
	/**
	 * Returns the circumference of the circle.
	 * pre: none
	 * post: The circumference of the circle has been returned
	*/	
	public double getCircumference()
	{
		double circleCircum;
		
		circleCircum = PI*radius*2;
		return(circleCircum);
	}
	
	
	/**
	 * Returns the circumference of the circle.
	 * pre: none
	 * post: The circumference of the circle has been returned
	*/	
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	
	/**
	 * Returns the circumference of the circle.
	 * pre: none
	 * post: The circumference of the circle has been returned
	*/	
	public boolean equals(Object c)
	{
		Circle testObj = (Circle)c;
		
		if(testObj.getRadius() == radius) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public String toString() 
	{
		String circleString;
		
		circleString = "Circle has radius " + radius;
		return(circleString);
	}

}
