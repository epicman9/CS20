public class CircleTester 
{
	public static void main(String[] args) 
	{
		Circle spot = new Circle();
		
		spot.setRadius(3);
		System.out.println("Circle Radius: " + spot.getRadius());
		System.out.println("Circle Circumference: " + spot.getCircumference());
	}
}