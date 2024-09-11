package collectionslearning.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {

	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    System.out.println("Before sorting :"+numbers);
	    Collections.sort(numbers);
	    System.out.println("After sorting :"+numbers);
	    
	    System.out.println("Index value of key is :"+Collections.binarySearch(numbers, 23));
	}

}
