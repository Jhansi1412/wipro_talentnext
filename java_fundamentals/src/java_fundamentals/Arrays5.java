package java_fundamentals;
public class Arrays5 {
	public static void main(String args[]) {
		int[] arr = {10, 5, 20, 8, 25, 3};
        int jMax = Integer.MIN_VALUE;
        int aMax = Integer.MIN_VALUE;
        int jMin = Integer.MAX_VALUE;
        int aMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > jMax) {
                aMax = jMax;
                jMax = arr[i];
            } else if (arr[i] > aMax && arr[i] != jMax) {
                aMax = arr[i];
            }
            if (arr[i] < jMin) {
                aMin = jMin;
              jMin = arr[i];
            } else if (arr[i] < aMin && arr[i] != jMin) {
                aMin = arr[i];
            }
        }

        System.out.println("Largest two numbers: " + jMax + ", " + aMax);
        System.out.println("Smallest two numbers: " + jMin + ", " + aMin);
    }
}
