package searchprograms;

public class LinearSearching 
{

	public static int find(int[] ar, int target) {
		for (int i=0;i<ar.length;i++)
		{
			if(target==ar[i])
			{
				return i;
			}
		}
		return -1;
		
		
	}

	public static boolean contains(int[] ar, int target) 
	{

		for (int j = 0; j < ar.length; j++) {
			if (target == ar[j]) {
				return true;
			}
		}
		return false;
	}

	public static int find(String str, char target) {
		for (int i=0;i<str.length();i++)
		{
			if(target==str.charAt(i))
			{
				return i;
			}
		}
		return -1;
		
		
	}

	public static boolean contains(String str, char target) {
		for (int i=0;i<str.length();i++)
		{
			if(target==str.charAt(i))
			{
				return true;
			}
		}
		return false;
	}

	public static int[] find(int[][] twoDim, int target)
	{
		for (int row=0;row<twoDim.length;row++)
		{
			for(int col=0; col<twoDim[row].length; col++)
			{
				if(twoDim[row][col]== target)
				{
					return  new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
		
		
	}
	
}

