package stringlearning;

public class StringBufferBuilderPerf {

	public static void main(String[] args) {
		long startTime= System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for(int i=0; i<100000; i++)
		{
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + 
		(System.currentTimeMillis() - startTime) + "ms");  
		
		startTime= System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");
		for(int i=0; i<100000; i++)
		{
			sb1.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + 
		(System.currentTimeMillis() - startTime) + "ms");  
	}

}
