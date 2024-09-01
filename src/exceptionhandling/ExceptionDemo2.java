package exceptionhandling;

import java.util.*;

public class ExceptionDemo2  {
	
	public static void main(String[] args) 
	{
		ExceptionDemo1 ed = new ExceptionDemo1();
		
		try
		{
		ed.calculate();
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Enter only integer values for a and b and also value of b must be greater than zero");
			try
			{
			ed.calculate();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Enter only integer values for a and b and also value of b must be greater than zero");
				try {
				ed.calculate();
				}
				catch(Exception e)
				{
					System.out.println("Enter only integer values for a and b and also value of b must be greater than zero");
					
				}
			}
		}


	}
	

}
