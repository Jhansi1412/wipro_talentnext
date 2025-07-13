package oops_inheritance;
import java.util.Optional;
public class question21 {
	public static void main(String[] args) {
		String address = null;
		Optional<String>n=Optional.ofNullable(address);
		System.out.println(n.orElse("United Kingdom"));
	}
}
