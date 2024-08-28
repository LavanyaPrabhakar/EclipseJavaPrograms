/*
 *  Convert Char Array to String :
 *  1.using String Class Constructor
 *  2. Using valueOf() Method
 *  3. Using copyValueOf() Method
 *  4. Using StringBuilder Class
 *  Convert String to Char Array  :
 *///5. using getChars(srcbegin index,srcEnd index, charArrayName, itsBegin index)
package stringlearning;

public class CharArrayToStringExample1 {

	public static void main(String[] args) {
	
	 
		char[] ch = {'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ' , 't', 'o', 
				' ', 'J', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
		
	/*	1. Using String Class Constructor
		String str=new String(ch);
		System.out.println(str); 
		
		2. Using valueOf() Method:
		
		String str=new String();
		String s=str.valueOf(ch);
		System.out.println(s); 
		
		3. Using copyValueOf() Method
		
		String str=new String();
		String s=str.copyValueOf(ch);
		System.out.println(s);  	
		
		//4. Using StringBuilder Class
		StringBuilder sb= new StringBuilder();
		for(char chars:ch)
		{
			sb.append(chars);
		}
		System.out.println(sb);		*/
		
		//5. String to array using getChars(srcbegin index,srcEnd index, charArrayName, itsBegin index)
		String str=new String();
		String s=str.valueOf(ch);
		System.out.println(s); 
		char[] array=new char[23];
		s.getChars(0, 21, array, 0);
		for(char chars:array)
		{
			System.out.println(chars);
		}
		
		
	}

}
