package oops_inheritance;
import java.util.*;
public class question22 {
	public static void main(String[] args) {
		Object employee=null;
		Optional<Object>n=Optional.ofNullable(employee);
		System.out.println(n.orElse("Invalid Employee Exception"));
	}
}
