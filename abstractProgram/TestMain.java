package abstractProgram;

public class TestMain {

	public static void main(String[] args) {
		Shape s1= new Circle("Red",2.2);
		Shape s2 = new Rectangle("yellow", 2, 4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
