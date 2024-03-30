package Question2;
// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

public class Polygon {

	// Declaration of width & height
	protected float width;
	protected float height;

	// Constructor of Polygon class that assign the value of 5 as the initial value to all attributes.
	public Polygon() {
		width = 5;
		height = 5;
	}

	// Setter method for setup the value of the width of the Polygon object.
	public void setWidth(int w) {
		width = w;
	}

	// Setter method for setup the value of the height of the Polygon object.
	public void setHeight(int h) {
		height = h;
	}

	// Method to calculate the area
	public int getArea() {
		return 0; // Polygon will always return 0
	}
}

