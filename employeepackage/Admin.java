package employeepackage;
public class Admin {

	public String admin;
	public void displayAdminDetails() {

		Admin admin1 = new Admin();
		admin1.admin = "Chandru";

		Admin admin2 = new Admin();
		admin2.admin = "Dinesh";

		Admin admin3 = new Admin();
		admin3.admin = "Eswar";

		System.out.println("The Admin details are: ");
		System.out.println("Admin1: " + admin1.admin + ",Admin2: "+ admin2.admin + ", Admin3: "+ admin3.admin);
	}
}
