package oops_inheritance;
import java.util.ArrayList;
import java.util.StringJoiner;
public class question18 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		StringJoiner s=new StringJoiner(",","{","}");
		list.add("Avineni");
		list.add("Jhansi");
		list.add("Chowdary");
		for(String name:list) {
			s.add(name);
		}
		System.out.println(s);
	}
}
