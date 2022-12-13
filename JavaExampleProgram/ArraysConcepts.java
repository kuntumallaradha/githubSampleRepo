package JavaExampleProgram;

//import java.lang.reflect.Array;
//import java.util.Scanner;

public class ArraysConcepts {

	public static void main(String[] args) {
		//declaring arrays
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	//print the elements in forward 
	System.out.println("print numbers in forward:");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Elements at index " +  i  + ":" + arr[i]);
		sum=sum+arr[i];
	}
		
	System.out.println("sum of the total numbers:"+ sum);
	//print the elements in reverse 
	System.out.println("print numbers in reverse:");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
	//prime numbers
	System.out.println("***printing the prime numbers:");
	//Scanner in= new Scanner(System.in);//create scanner object--> scanner class is used to get user input.
	System.out.println("Prime numbers:");
	//Elements in the array are looped one by one using for loop
	for (int i=0; i<arr.length;i++) {
		boolean isPrime= true;
		
		// using for loop and if condition, prime number are identified from all the numbers that are entered in the array
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime = false;
				break;
		}
	}
		
	//All the prime numbers or the numbers that satisfy the if condition are displayed as output.
		if(isPrime)
		System.out.println(i);
	}

}
}
