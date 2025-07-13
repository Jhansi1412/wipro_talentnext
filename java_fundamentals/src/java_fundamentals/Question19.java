package java_fundamentals;
import java.util.Scanner;
public class Question19 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int x =0;
		while(n!=0) {
		int rem=n%10;
	      x = x*10+rem;
	      n/=10;
	    }
	    System.out.println(x);
    }
}

