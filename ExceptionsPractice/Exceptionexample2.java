package ExceptionsPractice;

public class Exceptionexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside the try block...");
			int data=25/0;
			System.out.println(data);
		}
		//can't handle arithmetic type exception
		//can only accept Null Pointer type exception
		//catch(NullPointerException e) 
		catch(ArithmeticException e){
		System.out.println(e);
		}
		
		//executes regardless of exception occured or not
		//finall block will have only one
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code..");
	}

}
