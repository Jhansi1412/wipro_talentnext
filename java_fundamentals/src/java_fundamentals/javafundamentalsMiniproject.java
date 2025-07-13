package java_fundamentals;
import java.util.*;
public class javafundamentalsMiniproject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		int size=7;
		int emp_no[]={1001,1002,1003,1004,1005,1006,1007};
		String emp_name[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String join_date[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char designation_code[]={'e','c','k','r','m','e','c'};
		String department[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int basic[]={20000,30000,10000,12000,50000,23000,29000};
		int HRA[]={8000,12000,8000,6000,20000,9000,12000};
		int IT[]={3000,9000,1000,2000,20000,4400,10000};
		System.out.print("Enter the employee ID");
		int id=sc.nextInt();
		int value=0;
		for(int i=0;i<size;i++){
		    if(emp_no[i]==id){
		        value=i;
		    }
		}
		if(value==0){
		    System.out.print("There is no employee with empid : "+id+" ");
		}
		else{
		int empno=emp_no[value];
		String empname=emp_name[value];
		String dep=department[value];
		String designation="";
		int DA=0;
        char des_code=designation_code[value];
        switch(des_code){
            case 'e':
                designation="Engineer";
                DA=20000;
                break;
            case 'c':
                designation="Consultant";
                DA=32000;
                break;
            case 'k':
                designation="Clerk";
                DA=12000;
                break;
            case 'r':
                designation="Receptionist";
                DA=15000;
                break;
            case 'm':
                designation="Manager";
                DA=40000;
                break;
            default:
                System.out.print("invalid character");
        }
        int salary=basic[value]+HRA[value]+DA-IT[value];
        System.out.println("Emp No \tEmp Name \tDepartment\t Designation\tSalary");
        System.out.println(empno + "\t" + "  " +empname + "\t" + "        " + dep + "\t" + "         " + designation+ "\t" +"        "+ salary);
		}
	}
}