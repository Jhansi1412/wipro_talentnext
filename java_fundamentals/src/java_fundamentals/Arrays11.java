package java_fundamentals;
public class Arrays11 {
	public static void main(String args[]) {
		int[] array = {1, 4, 1, 3};
        boolean element = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) {
                element = false;
                break;
            }
        }
        System.out.println(element);
	}
}
