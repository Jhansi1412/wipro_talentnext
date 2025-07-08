package Java_OOPS;
import java.util.Scanner;
public class question17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String string = "";
		for(int i=0; i<str.length(); i++) {
			string += str.substring(str.length()-3, str.length());
		}
		System.out.println(string);
	}
}
