//Victor Sanchez
package projectOne;

import java.util.ArrayList;


public class ContactService {
	
	//Creating a new array to add the appointments to.
		static ArrayList<Contact> contactList = new ArrayList<>();
	
	//Adding an appointment to the array if an appointment with that name does not exist. 
	public static boolean addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact newContact = new Contact(contactID, firstName, lastName, phoneNumber, address);

		for (Contact contact : contactList) {
			if (contact.getContactID().equals(contactID)) {
				System.out.println("Contact ID is already in use");
				return false;
			}
		}
		contactList.add(newContact);
		System.out.println("The contact has been added.");
		return true;
		}

 	
	//Deleting an appointment from the array, by the ID of the appointment. 
 	public static void deleteContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
 		Contact contactToBeDeleted = null;
		
 		for (Contact contact : contactList) {
			if (contact.getContactID().equals(contactID)) {
				contactToBeDeleted = contact;
				break;
		}
 		}
 		
 		if (contactList.remove(contactToBeDeleted)) {
 			System.out.println("The contact has been deleted successfully.");
 		}
 		else {
 			System.out.println("This contact does not exist.");
 		}
	}
}
