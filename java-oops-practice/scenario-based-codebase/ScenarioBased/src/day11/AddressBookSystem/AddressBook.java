package day11.AddressBookSystem;

import java.util.ArrayList;
import java.util.Comparator;

public class AddressBook {

	private ArrayList<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contact) {
		for (Contact c : contacts) {
			if (c.isSameContact(contact.getFirstName(), contact.getLastName())) {
				System.out.println("Duplicate contact not allowed!");
				return;
			}
		}
		contacts.add(contact);
		System.out.println("Contact added successfully.");
	}

	public void editContact(String firstName, String lastName, String newPhone, String newEmail) {
		for (Contact c : contacts) {
			if (c.isSameContact(firstName, lastName)) {
				c.setPhone(newPhone);
				c.setEmail(newEmail);
				System.out.println("Contact updated.");
				return;
			}
		}
		System.out.println("Contact not found.");
	}

	// Delete Contact
	public void deleteContact(String firstName, String lastName) {
		for (Contact c : contacts) {
			if (c.isSameContact(firstName, lastName)) {
				contacts.remove(c);
				System.out.println("Contact deleted.");
				return;
			}
		}
		System.out.println("Contact not found.");
	}

	// Search by City or State
	public void searchByLocation(String location) {
		boolean found = false;
		for (Contact c : contacts) {
			if (c.getAddress() != null && (c.getAddress().getCity().equalsIgnoreCase(location)
					|| c.getAddress().getState().equalsIgnoreCase(location))) {
				System.out.println(c);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No contacts found for: " + location);
		}
	}

	public void displaySortedContacts() {
		contacts.sort(Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName));

		System.out.println("\n--- Address Book ---");
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
}
