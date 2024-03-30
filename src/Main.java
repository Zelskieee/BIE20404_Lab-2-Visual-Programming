class Polygon {
    
    protected float width;
    protected float height;
    
    public Polygon() {
        width = 5;
        height = 5;
    }
    
    public void setWidth(int w) {
        width = w;
    }
    
    public void setHeight(int h) {
        height = h;
    }
    
    public int getArea() {
        return 0;
    }
}

class Triangle extends Polygon {
	
	public int getArea() {
		
		return (int)(0.5 * width * height);
	}
}

class Rectangle extends Polygon {

	public int calcArea() {
		
	return (int)(width * height);
	}
}

class Main {
	public static void main(String[] args) {

		System.out.println("   - Areas - ");
		
		Polygon a = new Polygon();

		Triangle b = new Triangle();

		Rectangle c = new Rectangle();
		
		System.out.println("Polygon : " + a.getArea() + " cm^2");
		System.out.println("Triangle : " + b.getArea() + " cm^2");
		System.out.println("Rectangle : " + c.calcArea() + " cm^2");
	}
}
