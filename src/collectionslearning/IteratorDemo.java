package collectionslearning;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		// Make a collection
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	 // Get the iterator
	    Iterator<String> it = cars.iterator();
	    

	    
	 // Print all items in ArrayList  	
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    
	    System.out.println(cars);
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    
	    System.out.println(numbers);
	    
	    Iterator<Integer> iter = numbers.iterator();
	    
	 // Removing Items from a Collection
	    while(iter.hasNext())
	    {
	    	int i=iter.next();
	    	if(i<10)
	    	{
	    		iter.remove();
	    	}
	    }
	    System.out.println(numbers);
	    
	    


	}

}
