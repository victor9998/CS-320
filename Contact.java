//Victor Sanchez
package projectOne;


public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	//Constructor to make the contact, which also verifies that each string meets the requirements 
	public Contact (String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if (contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
			
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
			
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
			
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName =firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public String getContactID() {
		return contactID;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getAddress() {
		return address;
	}
}
