/* Greedy QUantifiers:
 ?    -> 0 or 1 time(once or not at all)
 *    -> 0 or more times
 + 	  -> 1 or more times
 {x}  -> exactly x times
 {x,}  -> atleast x times
 {x,y}  -> atleast x but not more than times
 
 */

package regexprograms;
import java.util.regex.*;

public class RegexGreedyQuantifiers {
	public static void displayFind(String regex, String searchMe)
	{
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(searchMe);
		boolean foundIt=false;
		while(m.find())
		{
		System.out.println("Regex "+ regex+" found "+m.group()+" in string: "+searchMe);
		foundIt=true;
		}
		if(!foundIt)
		{
			System.out.println("No match found for  "+ regex+"in string: "+searchMe);
		}
	}

	public static void main(String[] args) 
	{
// Greedy Quantifier
		displayFind("colou?r", "Is this a coloring book?");
		displayFind("colou?r", "Is this a colouring book?");
		displayFind("colou*r", "Is this a coloring book?");
		displayFind("colou*r", "Is this a colouring book?");
		displayFind("colou+r", "Is this a coloring book?");
		displayFind("colou+r", "Is this a colouring book?");
		displayFind("colou{0}r", "Is this a coloring book?");
		displayFind("colou{0,}r", "Is this a colouring book?");
		displayFind("M(i\\w\\w)+i", "Mississippi River");
		displayFind("M(i\\w\\w)*i", "Mississippi River");
		displayFind("M(i\\w\\w)*i", "Mi River");
		displayFind("M(i\\w\\w)?i", "Mississippi River");
		displayFind("M(i\\w\\w)?i", "Mi River");
		displayFind("M(i\\w\\w){3}i", "Mississippi River");
		displayFind("M(i\\w\\w){0,}i", "Mississippi River");
		displayFind("M(i\\w\\w){1,}i", "Mississippi River");
		displayFind("yoyos.*", "Red Yoyos - I like red yoyos!");
		displayFind(".*yoyos", "Red Yoyos - I like red yoyos!");
		displayFind("yoyos", "Red Yoyos blue yoyos, green yoyos!");
		displayFind("happy.*dogs", "I have happy large dogs and happy small dogs!");
		System.out.println();
// Reluctant Quantifier
		displayFind("happy.*?dogs", "I have happy large dogs and happy small dogs!");
		System.out.println();
// Possessive Quantifier
				displayFind("happy.*+dogs", "I have happy large dogs and happy small dogs!");
				displayFind("happy.*+", "I have happy large dogs and happy small dogs!");
	}

}
