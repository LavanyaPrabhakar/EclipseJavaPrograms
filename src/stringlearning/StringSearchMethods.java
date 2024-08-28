package stringlearning;

public class StringSearchMethods {

	public static void main(String[] args) {
	String s1= "Buchingham Palace London United Kingdom";
			//	0123456789	
	// Method 1: indexOf(int char)
	//  //index value of first occurrence of  'u' is 1
	System.out.println(s1.indexOf('u'));
	// Method 2: indexOf(String str)
	System.out.println(s1.indexOf("Palace"));
	// Method3: indexOf(int char, int fromIndex)
	System.out.println(s1.indexOf('a', 10));
	// Method4: indexOf(String Str, int fromIndex)
	System.out.println(s1.indexOf("lace",10));
	// Method 5: lastIndexOf(int char)
	// index value of last occurrence of 'm' is 38
	System.out.println(s1.lastIndexOf('m'));
	// Method 6: lastIndexOf(String str)
	System.out.println(s1.lastIndexOf("ing"));
	// Method7: lastIndexOf(int char, int fromIndex)
	System.out.println(s1.lastIndexOf('i', 32));
	// Method8: lastIndexOf(String str, int fromIndex)
	
	System.out.println(s1.lastIndexOf("ing",32));
	//If the string is not there then will give -1 as value
	System.out.println(s1.lastIndexOf("ing",2));
	}

}
