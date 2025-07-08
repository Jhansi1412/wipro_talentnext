package Java_OOPS;
import java.util.Scanner;
public class question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String string = "";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)=='*') {
				i=i+2;
			}
			else {
				string+=str.charAt(i);
			}
		}
		System.out.println(string);
	}
}
