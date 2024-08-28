package stringlearning;

public class StringCompareMethods
{

	public static void main(String[] args)
	{
	
		String s1= new String("John");
		String s2= new String("PHP");
		String s3= new String("john");
		String s4= new String("PHPJava");
		StringBuffer s5= new StringBuffer("John");
		String s6= new String("John");
		
//Method 1: equals (Output value :boolean)
		boolean result= s1.equals(s2);
		System.out.println("equals : s1 VS s2 = "+result);
		System.out.println("equals : s1 VS s3(case sensitive) = "+s1.equals(s3));
// Method 2: equalsIgnoreCase
		System.out.println("equalsIgnoreCase : s1 VS s3 = "+s1.equalsIgnoreCase(s3));
// Method 3: compareTo (Output value in integer: -ve or +ve or zero )
				System.out.println("compareTo : s1 VS s2 = "+s1.compareTo(s2));
				System.out.println("compareTo : s1 VS s3 = "+s1.compareTo(s3));
// Method 4: compareToIgnoreCase (Output value in integer: -ve or +ve or zero )
		System.out.println("compareToIgnoreCase : s1 VS s2 = "+s1.compareToIgnoreCase(s2));
		System.out.println("compareToIgnoreCase : s1 VS s3 = "+s1.compareToIgnoreCase(s3));
// Method 5: startsWith("J") -> within double quotes can give first one or more continuous character
		System.out.println(s1.startsWith("J"));
				
// Method 5: endsWith("hn") -> within double quotes can give last one or more continuous character
				System.out.println(s1.endsWith("hn"));
				
// Method 6: startsWith(String prefix, int toffset)
//toffset (from index)- where to begin looking in this string. 
				System.out.println(s4.startsWith("Java", 3));		
// Method 7: contentEquals(char sequence)- in String
				System.out.println(s1.contentEquals(s6));
				
// Method 8: contentEquals(StringBuffer)- in StringBuffer
				System.out.println(s1.contentEquals(s5));
	}
}
