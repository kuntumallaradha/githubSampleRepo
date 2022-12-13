package JavaExampleProgram;

class Animalpro{
		protected void display1() {
		System.out.println("I am an animalpro");
	}
}

//to access the protected we use extends key word

public class AccessMod extends Animalpro {
	
public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.legcount=4;
		animal.display();
		display();
		hello();
		Method1();
		AccessMod Acmocd = new AccessMod();
		Acmocd.display1();
		Acmocd.myPublicMethod();
		Acmocd.myPrivateMethod();
		//A obj =new A();
		}

//protect method

	protected static void display() {
	System.out.println("It's a protect method");
	}
//creating public method using static 
	public static void hello() {

	System.out.println("hello world!");
	}
	
	//creating private using static method
	private static void Method1() {
			System.out.println("private method1");
		}
	//creating private method
	private void myPrivateMethod() {
		System.out.println("private method must be called by creating objects");
	}
	
//creatring public method
		public void myPublicMethod() {
			System.out.println("Public method must be called by creating objects");
		}
	

		}
