package java_fundamentals;
public class Arrays3 {
    public static void main(String[] args) {
        int[] array = {1, 14, 34, 56, 97};
        int searchElement = 14;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}

