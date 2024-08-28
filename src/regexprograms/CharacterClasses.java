/*1. to find starting character or word use caret symbol(^)at the start of the pattern 
 *2. to find ending character or word use dollar symbol($) at the end of the pattern  
 *3. to find any two characters or words use pipe symbol(|) between characters or words
 */
package regexprograms;
import java.util.regex.*;

public class CharacterClasses {

	public static void main(String[] args) 
	{
		/*	
		 String sentence="English is considered as the global language";
		1. to find starting character or word use caret symbol(^)at the start of the pattern 
		
		Pattern p = Pattern.compile("^English"); 
		Matcher m=p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group()+ " starts at index "+m.start());
		}
		
		 2. to find ending character or word use dollar symbol($) at the end of the pattern 
	
		Pattern p = Pattern.compile("language$"); 
		Matcher m=p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group()+ " ends at index "+m.end());
		}
		
		3. to find any two characters or words use pipe symbol(|) between characters or words
		
		Pattern p = Pattern.compile("E|a"); 
		Matcher m=p.matcher(sentence);
		while(m.find())
		{
			System.out.println(m.group()+ " ends at index "+m.end());
		}
		 */
		String s="abbcbcaBcaaQW123!£&*";
//		Pattern p = Pattern.compile("[abc]"); 
//		Pattern p = Pattern.compile("[^abc]"); 
//		Pattern p = Pattern.compile("[a-z]"); 
//		Pattern p = Pattern.compile("[A-Z]"); 
//		Pattern p = Pattern.compile("[0-9]"); 
//		Pattern p = Pattern.compile("[a-zA-Z]"); 
//		Pattern p = Pattern.compile("[a-zA-Z0-9]"); 
//		Pattern p = Pattern.compile("[^a-zA-Z0-9]"); 
		Pattern p = Pattern.compile("[^a-zA-Z]"); 
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()+ " starts at index "+m.start());
		}
	}

}
