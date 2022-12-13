package ExceptionsPractice;

public class ExcceptionExample {

	public static void main(String[] args) {
	//	try {
	//		int data=100/0;
	//		System.out.println(data);
	//	}catch(ArithmeticException e) {
	//	System.out.println("printing the exception:  "+e);
	//	}
	//	System.out.println("rest of the code....");

		
		//resolving exception
	//	int i=50;
	//	int j=0;
	//	int data;
	//	try {
	//		data=i/j; //may throw exception
	//	}
	//	catch(Exception e)
	//			{
					//System.out.println("exception e" + e);
					//System.out.println(i/(j+2));
					//generating the exception in catch block
		//			int data2=50/0; //creating exception in catch block
		//		}
		//System.out.println("rest of the code:");
		
		
		
		//mutli-catch block exception
		
	//	try {
		//	int a[]=new int[5];
			//a[5]=30/0;
	//	}
	//	catch(ArithmeticException e) {
	//		System.out.println("Arthmetic exception");
	//	}
	//	catch(ArrayIndexOutOfBoundsException e) {
	//		System.out.println("ArrayIndexOutOfBoundsException");
	//	}
	//	catch(Exception e) {
	//		System.out.println("parent Exception occurs");
	//	}
	//	System.out.println("rest of the code");
		
		//multi try block
		
		try {
			//inner try block1
			try {
				//inner try block2
				try {
					int[] arr= {1,2,3,4};
					System.out.println(arr[7]);
				}
				catch(ArithmeticException e1) {
					System.out.println("ArithmeticException");
					System.out.println("inner try block 2");
				}
				
			}
		
		catch(ArithmeticException e2) {
			System.out.println("Arthimetic Exception");
			System.out.println("inner try block2");
		}
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic exception");
			System.out.println("inner try block1");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBounds Exception");
			System.out.println(e4);
			System.out.println("inner try block1");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("handled in main try-block");
			
		}
		
}
}