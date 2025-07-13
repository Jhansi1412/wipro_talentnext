package java_fundamentals;
public class Arrays9 {
	public static void main(String args[]) {
		  int[] array = {1,99,10};
	      int[] res = new int[array.length];
	      int index = 0;
	      for (int i = 0; i < array.length; i++) {
	            if (array[i] != 10) {
	                res[index++] = array[i];
	            }
	        }
	        for (int i = 0; i < res.length; i++) {
	        	System.out.print(res[i] + " ");
	        }        
	}
}
