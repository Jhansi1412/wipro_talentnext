package oops_inheritance;
import java.util.Optional;
public class question20 {
	public static void main(String[] args) {
		String names[] = new String[5];
		Optional<String>n=Optional.ofNullable(names[0]);
		if(n.isPresent()) {
			System.out.println(n.get());
		}
		else {
			System.out.println("Null Value");
		}
	}
}
