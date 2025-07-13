package oops_inheritance;
import java.util.StringJoiner;
public class question19 {
	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-","{","}");
		StringJoiner s2=new StringJoiner("-","{","}");
		s1.add("Chittoor");
		s1.add("Banglore");
		s1.add("Vellore");
		s2.add("Hyderabad");
		s2.add("Dubai");
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}
}
