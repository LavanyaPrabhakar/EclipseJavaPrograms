//Remove Ronie from nameList using iterator
package arrayslearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		String[] names = {"Anne", "Ronie","Robert"};
		
		for(int i=0; i< names.length; i++)
		{
			nameList.add(names[i]);
		}
		System.out.println("Before removing Ronie from nameList:");
		System.out.println(nameList);
	/*	Iterator it = nameList.iterator();
		
		while(it.hasNext())
		{	
			if(it.next().equals("Ronie"))
			{it.remove();}
		}
		System.out.println("After removing Ronie from nameList:");
		System.out.println(nameList);
		
		//Victor and 5 will be added as first two elements as cursor in first position
		*/	
		ListIterator li = nameList.listIterator();
		li.add("Victor");
		li.add(5);
		System.out.println(nameList);
		
		//set()->replace the last element which is returned by the next() or previous() along with the given element
		System.out.println("Before updating last element Robert as John :"+ nameList);
		while(li.hasNext())
		{	
			if(li.next().equals("Robert"))
				{li.set("John");}
			
		}
			
		System.out.println("After updating last element Robert as John :"+ nameList);
		List<String> nameList1 = new ArrayList<String>();
		nameList1.addAll(nameList);
		System.out.println(nameList1);
	}

}
