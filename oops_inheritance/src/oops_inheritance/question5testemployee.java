package oops_inheritance;
import oops_inheritance.question5employee;
import oops_inheritance.question5person;
public class question5testemployee {
	public static void main(String[] args) {
		question5person person=new question5person();
		question5employee emp=new question5employee();
		person.setName("A. Jhansi Chowdary");
		emp.setAnnual_Salary(100000.00);
		emp.setEmployee_Joining_year(2026);
		emp.setInsurance_number("12345Q56AT89");
		emp.setName("A. Rithu");
		System.out.println("Person Name: "+person.getName());
		System.out.println("Emplyee Name: "+emp.getName());
		System.out.println("Employee Annual Salary: "+emp.getAnnual_Salary());
		System.out.println("Employee Year of Joining: "+emp.getEmployee_Joining_year());
		System.out.println("Employee Insurance Number: "+emp.getInsurance_number());
	}
}
