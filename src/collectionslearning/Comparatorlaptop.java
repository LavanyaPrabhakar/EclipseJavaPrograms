package collectionslearning;

import java.util.Comparator;

public class Comparatorlaptop implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

/*// Based on int price and int gb
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		if(l1.price > l2.price)
			return -1;
		if(l1.price < l2.price)
			return +1;
		else 
			{
			if(l1.gb> l2.gb)
				{return -1;}
			else if(l1.gb < l2.gb)
				{return +1;}
			}
		return 0;
		// Based on String brand use compareTo method
		*/
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		int result = l1.brand.compareTo(l2.brand);
		if(result>0)
			return +1;
		if(result<0)
			return -1;
		else
			return 0;
	}

}
