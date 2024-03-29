package abstractProgram;

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color,double length,double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		
	return length * width;	
	}

	@Override
	public String toString() {
		System.out.println("2.Rectangle constructor called");

		return "Rectangle color is " + super.getColor() + "and area is:" + area();
	}

}
