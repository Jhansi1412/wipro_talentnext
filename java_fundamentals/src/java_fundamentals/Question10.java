package java_fundamentals;
import java.util.Scanner;
public class Question10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+ "->" + (char)(ch+32));
		}
		else {
			System.out.println(ch + "->" + (char)(ch-32));
		}
	}
}
