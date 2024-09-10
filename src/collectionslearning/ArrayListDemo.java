package collectionslearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		String[] names = {"Anne", "Ronie","Robert"};
		
		
		for(int i=0; i< names.length; i++)
		{
			nameList.add(names[i]);
		}
		
	/*	1. Display using For each loop
	 	for(String s:nameList)
		{			
			System.out.println(s);
		}
		// 2. Display using For loop using get method of ArrayList
		for(int i=0; i< nameList.size(); i++)
		{
			System.out.println(nameList.get(i));
		}
		// 3. Display using iterator
		*/
		Iterator it = nameList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
