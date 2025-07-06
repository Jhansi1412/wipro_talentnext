package java_fundamentals;
import java.util.*;
public class Arrays7 {
	public static void main(String args[]) {
		int[] array = {8,14,12,10,4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        Integer[] unique = set.toArray(new Integer[0]);
        System.out.print("{");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i]);
            if (i != unique.length - 1)
                System.out.print(",");
        }
        System.out.print("}");
	}
}
