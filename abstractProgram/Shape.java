package abstractProgram;

abstract class Shape {
	String color;
	//abstract method
	abstract double area();
	public abstract String toString();
	
	//abstract class can have the constructor
	public Shape (String color) {
		System.out.println("Shape constructor called..");
		this.color= color;
	}
	//this is a concrete method
	public String getColor()
	{
		return color;
	}

}
