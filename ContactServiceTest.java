//Victor Sanchez 
package projectOne;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//Test to add the appointment. 
	@Test
		void testAddContact() {
		ContactService.contactList.clear();
		
			boolean successful = ContactService.addContact("ID1234567", "Victor", "Sanchez", "6789998212",
					"2500 N River Rd");
			assertTrue(successful);
			
		boolean successfu1 = ContactService.addContact("ID1234567", "Victor", "Sanchez", "6789998212",
				"2500 N River Rd");
			assertFalse(successfu1);
		}



	//Test to delete an appointment by adding one and then deleting it. 
		@Test
		void testDeleteContact(){
			ContactService.contactList.clear();
			
			ContactService.addContact("ID1234567", "Victor", "Sanchez", "6789998212",
					 "2500 N River Rd");
			
			ContactService.deleteContact("ID1234567", "Victor", "Sanchez", "6789998212",
					 "2500 N River Rd");
		}

}