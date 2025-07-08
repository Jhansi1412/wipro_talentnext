package Java_OOPS.Question5;
public class TestEmployee {
	public static void main(String[] args) {
		Person person=new Person();
		employee emp=new employee();
		person.setName("A. Jhansi");
		emp.setAnnual_Salary(100000.00);
		emp.setEmployee_Joining_year(2026);
		emp.setInsurance_number("140504ZA1045");
		emp.setName("A. Janu");
		System.out.println("Person Name: "+person.getName());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Annual Salary: "+emp.getAnnual_Salary());
		System.out.println("Employee Year of Joining: "+emp.getEmployee_Joining_year());
		System.out.println("Employee Insurance Number: "+emp.getInsurance_number());
	}
}
