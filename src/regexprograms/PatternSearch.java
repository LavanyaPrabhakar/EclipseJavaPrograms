/*(i) pattern is created using the Pattern.compile() method
(ii)matcher() method is used to search for the pattern in a string
    It returns a Matcher object which contains information about the search that was performed.
(iii) find() method returns true if the pattern was found in the string and false if it was not found.
 */
package regexprograms;

import java.util.regex.*;

public class PatternSearch 
{
	public static void main(String[] args) 
	{
		String sentence= "thupparkku thuppaya thuppakki thupparkku thuppaya thoovum mazhai";
		
		Pattern p=Pattern.compile("thupparkku", Pattern.CASE_INSENSITIVE);
		
		Matcher m=p.matcher(sentence);
		int count=0;
		while(m.find())
		
		{	
			System.out.println(m.group()+" starts at index "+m.start()+" and ends at index "+m.end());
			count++;
		}
		System.out.println("thupparkku appears"+count+" times");
		
		
	}
}
