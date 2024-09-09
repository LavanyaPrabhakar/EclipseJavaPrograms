package collectionslearning;

import java.util.Comparator;

public class Comparatorlaptop implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		if(l1.price > l2.price)
			return +1;
		if(l1.price < l2.price)
			return -1;
		
		return 0;
	}

}
