package exceptionhandling;

import java.util.*;

public class ExceptionDemo1 {



	
	
	
	public void calculate() throws ArithmeticException, InputMismatchException {
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter value a : ");
		int a= scan.nextInt();
		
		System.out.println("Enter value b : ");
		int b= scan.nextInt();
		System.out.println(" divide= "+(a/b));
	

		
	}


/*

	private static void add(int a, int b) {
		System.out.println(" add= "+(a+b));
		
	}

	private static void divide(int a, int b) {
		
		try {
		System.out.println(" divide= "+(a/b));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("b value is zero and must be greater than 0");

			
		}

	}
	*/


}
