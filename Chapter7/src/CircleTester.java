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