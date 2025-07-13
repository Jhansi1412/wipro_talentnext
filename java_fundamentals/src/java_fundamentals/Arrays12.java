package java_fundamentals;
public class Arrays12 {
	public static void main(String args[]) {
		int[] a = {7,7,7};
        int[] b = {3,8,0};
        int[] res = {a[1], b[1]};
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
	}
}
