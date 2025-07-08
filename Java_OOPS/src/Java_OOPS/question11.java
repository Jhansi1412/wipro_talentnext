package Java_OOPS;
import java.util.Scanner;
public class question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.length()%2 == 1) {
			System.out.println("null");
		}
		else {
			System.out.println(str.substring(0, str.length()/2));
		}
	}
}
