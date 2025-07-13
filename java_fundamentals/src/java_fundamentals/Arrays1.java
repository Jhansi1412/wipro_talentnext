package java_fundamentals;
import java.util.Scanner;
public class Arrays1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double average = (double)sum/n;
		System.out.println("Sum= " + sum);
		System.out.println("Average= " + average);
	}
}