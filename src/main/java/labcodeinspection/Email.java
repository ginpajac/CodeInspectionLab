package labcodeinspection;

import java.util.Locale;

/**
 * 
 * @author Ginger Jacome
 *
 */
public class Email {
	/** Members first name*/
	private String firstName;
	/** Members last name*/
	private String lastName;
	/** Members password*/
	private String password = null;
	/** Members deparment*/
	private String department;
	/** Default password length*/
	private int dfpasswordLength = 8;
	/** Members email*/
	private String email;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	/**
	 * This method return the default password lenght
	 * @return 
	 */
	public int getDfpasswordLength() {
		return dfpasswordLength;
	}
	
	/**
	 * 
	 * @param dfpasswordLength
	 */
	public void setDfpasswordLength(final int dfpasswordLength) {
		this.dfpasswordLength = dfpasswordLength;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * This method shows the member´s information
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * 
	 * @param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * This method generates an email
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.dfpasswordLength);
		this.email = this.firstName.toLowerCase(Locale.getDefault()) + this.lastName.toLowerCase(Locale.getDefault())+ "@" + this.department
				+ ".espol.edu.ec";
	}
}
