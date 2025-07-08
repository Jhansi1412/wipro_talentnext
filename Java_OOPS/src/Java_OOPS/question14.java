package Java_OOPS;
import java.util.Scanner;
public class question14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		if(str.charAt(0)=='x' && str.charAt(str.length() - 1) == 'x') {
			System.out.println(str.substring (1,str.length()-1));
		}
	}
}
