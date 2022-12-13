package ExceptionsPractice;

import java.io.IOException;

public class ExceptionPropagation1 {
	void m() throws IOException  {
		//int data =50/0; //exception ocured
		throw new java.io.IOException("device error");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("exception handled..");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation1 obj  = new ExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");

	}

}
