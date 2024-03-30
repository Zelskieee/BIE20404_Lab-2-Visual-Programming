package Question2;
//Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

public class Main {

	public static void main(String[] args) {

		// Display the output that imitate the header
		System.out.println("   - Areas - ");
		
		// Object created in Polygon class
		Polygon a = new Polygon();

		// Object created in Triangle class
		Triangle b = new Triangle();

		// Object created in Rectangle class
		Rectangle c = new Rectangle();
		
		// Output to display the area
		// Display the area of Polygon 
		System.out.println("Polygon : " + a.getArea() + " cm^2");
		
		// Display the area of Triangle 
		System.out.println("Triangle : " + b.getArea() + " cm^2");
		
		// Display the area of Rectangle 
		System.out.println("Rectangle : " + c.calcArea() + " cm^2");
	}
}


