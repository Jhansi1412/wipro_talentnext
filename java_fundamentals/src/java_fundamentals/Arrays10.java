package java_fundamentals;
public class Arrays10{
	public static void main(String args[]) {
		int[] array = {4,3,2};
        int[] res = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                res[index++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                res[index++] = array[i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
	}
}
