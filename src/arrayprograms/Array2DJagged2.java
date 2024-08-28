/* Jagged Array: print the values in jagged 2D array format
 * Condition :
 * Row length=mark.length
 * column length=mark[row].length
 * 
 * Output:
20  40  
1  
2  3  4  5  
6  7  8  9  0  
1  2  3  4  5  6  
  
 */
package arrayprograms;


public class Array2DJagged2 {

	public static void main(String[] args) {


		
		int[][] mark= {{20,40},{1},{2,3,4,5},{6,7,8,9,0},{1,2,3,4,5,6}};
		
		for(int row=0; row < mark.length; row++)
		{
			for(int col=0; col < mark[row].length; col++)
			{
				System.out.print(mark[row][col]+"  ");
			}
			System.out.println();
		}
	}

}

