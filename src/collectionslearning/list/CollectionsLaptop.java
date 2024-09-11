package collectionslearning.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsLaptop {

	public static void main(String[] args) {
		Laptop dell = new Laptop("Inspiron",45000,8,true);
		Laptop lenova = new Laptop("Ideapad",50000,6,false);
		Laptop hp = new Laptop("Pavilion",50000,10,true);
		
		ArrayList laptopList = new ArrayList();
		laptopList.add(dell);
		laptopList.add(lenova);
		laptopList.add(hp);
		System.out.println("Before sorting : ");
		System.out.println(laptopList);
	/*
		Collections.sort(laptopList);
		* when tried to sort objects-  java.lang.ClassCastException occurred
		
		System.out.println(laptopList);
		* Use comparator interface to convert Object as String
		use sort using comparator	*/
		
		Comparatorlaptop cl= new Comparatorlaptop();
		Collections.sort(laptopList, cl);
		//output will be in hashcode when treid to print Object. Hence overwrite toString() in Laptop class
		System.out.println("After sorting : ");
		System.out.println(laptopList);
		
	}

}
