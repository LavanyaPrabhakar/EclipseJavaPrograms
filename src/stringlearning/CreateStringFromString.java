package stringlearning;

public class CreateStringFromString {

	public static void main(String[] args) {
		String s1 = " Buchingham Palace London United Kingdom ";
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		System.out.println(s1);//s1 unchanged as String is immutable
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.strip());
		String s3 = s1.strip();
		System.out.println(s3.length());
		System.out.println(s1.trim()); 
		String s4 = s1.trim();
		System.out.println(s4.length());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.repeat(2));
		System.out.println(s1.indent(20));
		System.out.println(s1.toCharArray());
		
		for(int i=0; i<s1.length();i++)
		{
			System.out.println();
		}
	}

}
