/* Important methods in java collection-List inteface
 * e = element (Object), i = index , c = Collection
 * 
 * 
 */
package collectionslearning.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {

	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    //add(e)
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    numbers.add(8);
	    numbers.add(3);
	    numbers.add(80);
	    numbers.add(66);
	    System.out.println("numbers :"+numbers);
	    
	    //add(i,e)
	    numbers.add(4,0);
	    System.out.println("numbers :"+numbers);
	    //addAll(c)
	    ArrayList<Integer> numbers1 = new ArrayList<Integer>();
	    numbers1.addAll(numbers);
	    System.out.println("numbers1 :"+numbers1);
	    
	  //addAll(i,c)
	    ArrayList<Integer> numbers2 = new ArrayList<Integer>();
	    numbers2.add(100);
	    numbers2.add(200);
	    numbers2.add(300);
	    numbers2.add(400);
	    numbers2.addAll(2,numbers);
	    System.out.println("numbers2 :"+numbers2);
	    
    
	    //Size()
	    System.out.println("size of numbers2 array :"+numbers2.size());
	    
	    //contains(e)
	    System.out.println("contains the given element in numbers2 array :"+numbers2.contains(100));
	    
	    //contains(c)
	    System.out.println("contains the numbers collection within numbers2 array :"+numbers2.containsAll(numbers));
	    
	    
	  //remove(i)
	    System.out.println("value removed at index is : "+numbers2.remove(6));
	    
		  //remove(e)/returns bool : This is tricky in case of integer list,pass Integer object
	    //eg : arr.remove(new Integer(3)) -> this will remove first occurence of object with value 3
	    System.out.println("removal element exists : "+numbers.remove(new Integer(8)));
	    System.out.println("After removing first occurence of element :"+numbers);
	    
	   
     
  		//removeAll(c)
	    numbers2.removeAll(numbers2);
	    System.out.println("numbers2 after removeAll :"+numbers2);

  	    
	    //get(i)
	    
	    System.out.println("value at 4th index of numbers array : "+numbers.get(4));
	    
	    //set(i,e)
	    System.out.println("value replaced at 0th index given index of numbers array : "+numbers.set(0, 1000));
	    
	    System.out.println("numbers array after replace: "+numbers);
	    
	    System.out.println("Before sorting :"+numbers);
	    Collections.sort(numbers);
	    System.out.println("After sorting :"+numbers);
	    
	    System.out.println("Index value of key is :"+Collections.binarySearch(numbers, 23));
	    
	
	    
	    
	}

}
