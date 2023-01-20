package departmentpackage;

public class Department {

	public String depname;
	public int depmembers;
	public void departmentDetails() {

		Department depname1 = new Department();
		depname1.depname = "IT";

		Department depname2 = new Department();
		depname2.depname = " Accounts ";

		Department depmembers1 = new Department();
		depmembers1.depmembers = 100;
		
		Department depmembers2 = new Department();
		depmembers2.depmembers = 40;

		System.out.println("The Department details are");
System.out.println("Department name: " + depname1.depname + ", Total Members: " + depmembers1.depmembers);
System.out.println("Department name: " + depname2.depname + ", Total Members: " + depmembers2.depmembers);
}
}
