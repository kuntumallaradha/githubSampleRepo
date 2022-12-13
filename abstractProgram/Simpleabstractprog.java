package abstractProgram;
//abstact  classs Animal 
abstract class Animal {
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}
//Inheriting Animal class into dog
	class Dog extends Animal {

	  // provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}
public class Simpleabstractprog {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		d1.eat();

	}

}
