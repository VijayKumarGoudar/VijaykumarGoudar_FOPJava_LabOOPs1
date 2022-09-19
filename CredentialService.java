import java.util.Random;

public class CredentialService {
	private static String company = "GL"; //Company name 
	
	
//This method is written to generate password with given constraints.
	
	public static String generatePassword(Employee emp) {

		StringBuilder password = new StringBuilder();
	
		Random rand = new Random();
		int randomNumber = rand.nextInt(8);
		randomNumber += 8;                  // Password length is between 8 to 15

		// ASCII values of special chars(33,47), number(48,57),
		// A-Z (65-91), a-z(97-122)

		for (int i = 0; i < randomNumber; i++) {

			if (i % 4 == 0) {

				// code for adding small letters a-z
				char temp = (char) (97 + rand.nextInt(26));
				password.append(temp);

			} else if (i % 4 == 1) {
				// code for adding special characters
				
				char temp = (char) (33 + rand.nextInt(15));
				password.append(temp);
				
			} else if (i % 4 == 2) {
				// code for adding Capital letters A-Z
				
				char temp = (char) (65 + rand.nextInt(26));
				password.append(temp);
				
			} else if (i % 4 == 3) {
				// code for adding  Numbers 0-9
				
				char temp = (char) (48 + rand.nextInt(10));
				password.append(temp);
			}

		}

		return password.toString();
	}

	//Method to generate and return email.
	public static String generateEmailAddress(Employee emp) {
		String email = emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + 
				"." + company + ".com";

		return email;
	}

	//method to display credentials
	public static void showCredentials(Employee emp) {

		System.out.println("Dear " + emp.getFirstName() + " your genearted credentials are as follows");

		System.out.println("Email --> " + emp.getEmail());

		System.out.println("Password --> " + emp.getPassword());
	}

}
