package java_fundamentals;
import java.util.Scanner;
public class Question6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans ="";
		if (args.length == 0) {
		      System.out.println("No values");
		    }
		    if (args.length != 0) {
		      for (int i = 0; i < args.length; i++) {
		        System.out.print(args[i]);
		        if (i < args.length - 1) {
		          System.out.print(",");
		        }
		     }
	    }
	}
}
