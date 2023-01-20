package employeepackage;

import employeepackage.Employee;

public class Employee {
	
	public String empname;
	public int empid;
	public String designation;
	public int empsalary;
	public void employeeDetails() {
	
		Employee empname1 = new Employee();
		empname1.empname = "Ajay";
		Employee empid1 = new Employee();
		empid1.empid = 100;
		Employee emp1designation= new Employee();
		emp1designation.designation= "Developer";
		Employee empsalary1 = new Employee();
		empsalary1.empsalary = 4000;
		
		System.out.println("The Employee details are:");
		System.out.println("employee name: " + empname1.empname + " ,empid: " + empid1.empid + ",empdesignation: "+ emp1designation.designation +" ,empsalary: "+ empsalary1.empsalary);
		
	}
	
}


