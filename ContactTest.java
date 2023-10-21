//Victor Sanchez 
package projectOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Testing to verify that the strings that were used are equal to each other
	@Test
	void testContact() {
		Contact contact = new Contact("Id1234567", "Victor", "Sanchez", "6284324129", "42 Wallaby Way, Sydney");
		assertTrue(contact.getContactID().equals("Id1234567"));
		assertTrue(contact.getFirstName().equals("Victor"));
		assertTrue(contact.getLastName().equals("Sanchez"));
		assertTrue(contact.getPhoneNumber().equals("6284324129"));
		assertTrue(contact.getAddress().equals("42 Wallaby Way, Sydney"));
	}

	//Testing to verify that an exception is thrown if the requirements are not met
	@Test
	void testContactIdNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id123456789", "Natanael", "Martinez", "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testContactIdNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Natanael", "Martinez", "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testFirstNameNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael-Cano", "Martinez", "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", null, "Martinez", "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testLastNameNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", "MartinezGonzalez", "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", null, "6284324129", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", "Martinez", "628403241269", "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", "Martinez", null, "42 Wallaby Way, Sydney Dr");
		}); }
	
	@Test
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", "Martinez", "6284324129", "42 Wallaby Way, Sydney Dr. The Bottom Of the Sea");
		}); }
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Id1234567", "Natanael", "Martinez", "6284324129", null);
		}); }
	}