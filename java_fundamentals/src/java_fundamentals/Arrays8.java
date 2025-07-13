package java_fundamentals;
public class Arrays8 {
	public static void main(String args[]) {
		  int[] array = {1,53,9,8,5};
	        int sum = 0;
	        boolean inBetween = false;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == 6) {
	                inBetween = true;
	            } 
	            else if (array[i] == 7 && inBetween) {
	                inBetween = false;
	            } 
	            else if (!inBetween) {
	                sum += array[i];
	            }
	        }
	        System.out.println(sum);
	}
}
