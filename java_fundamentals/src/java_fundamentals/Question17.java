package java_fundamentals;
import java.util.Scanner;
public class Question17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=n; i !=0; i=i/10) {
			int digit = i%10;
			sum += digit;
		}
		System.out.println("Sum of digits = " + sum);
	}

}
