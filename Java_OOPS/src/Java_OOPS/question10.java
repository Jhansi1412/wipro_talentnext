package Java_OOPS;
import java.util.Scanner;
public class question10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String string="";
		for(int i=0;i<str.length();i++) {
			string+=str.substring(0, 2);
		}
		System.out.println(string);
	}
}
