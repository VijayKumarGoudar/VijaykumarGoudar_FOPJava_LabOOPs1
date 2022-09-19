import java.util.Scanner;

public class SupportAdminDriver {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("vijay", "Goudar");

		System.out.println("Please enter the department from the following ");
		System.out.print("1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");

		Scanner sc = new Scanner(System.in);
		int option;

		do {
			option = sc.nextInt();
			switch (option) {

			case 1:
				emp1.setDepartment("Technical");
				break;

			case 2:
				emp1.setDepartment("Admin");
				break;

			case 3:
				emp1.setDepartment("Human_Resource");
				break;

			case 4:
				emp1.setDepartment("Legal");
				break;

			default:
				System.out.println("Enter valid option");

			}

		}while(option>4 || option<1);
		
		emp1.setEmail(CredentialService.generateEmailAddress(emp1));
		
		emp1.setPassword(CredentialService.generatePassword(emp1));
		
		CredentialService.showCredentials(emp1);
		
		sc.close();
	}

}
