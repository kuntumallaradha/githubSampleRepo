package abstractProgram;

 class Circle extends Shape{

	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("circle constructor called");
		this.radius= radius;
	}
	@Override
	double area() {
		
		return Math.PI*Math.pow(radius,2);
	}
	@Override
	public String toString() {
		
		
		System.out.println("2. circle constructor called");
		System.out.println("Some changes added by radha");

		return "Circle color is" + super.getColor() + "and area is:" + area();

	}
	
	 

}
