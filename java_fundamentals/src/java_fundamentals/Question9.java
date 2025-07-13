package java_fundamentals;
import java.util.Scanner;
public class Question9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gender");
		String gender = sc.nextLine().toLowerCase();
		System.out.print("Enter age");
		int age = sc.nextInt();
		if(gender.equals("female")) {
			if(age>=1 && age<=58) {
				System.out.println("The percentage of intrest is 8.2%");
			}
			else {
				System.out.println("The percentage of intrest is 9.2%");
			}
		}
		if(gender.equals("male")) {
			if(age>=1 && age<=58) {
				System.out.println("The percentage of intrest is 8.4%");
			}
			else {
				System.out.println("The percentage of intrest is 10.5%");
			}
		}
	}
}
