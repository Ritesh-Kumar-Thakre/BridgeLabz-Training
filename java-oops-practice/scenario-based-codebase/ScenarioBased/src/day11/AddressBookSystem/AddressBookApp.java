package day11.AddressBookSystem;

public class AddressBookApp {
	public static void main(String[] args) {

		AddressBook book = new AddressBook();

		Address a1 = new Address("Indore", "MP", "452001");
		Address a2 = new Address("Pune", "MH", "411001");

		Contact c1 = new Contact("Ritesh", "Thakre", "9876543210", "ritesh@gmail.com", a1);

		Contact c2 = new Contact("Neha", "Sharma", "9123456789", "neha@gmail.com", a2);

		Contact c3 = new Contact("Ritesh", "Thakre", "9999999999", "duplicate@gmail.com", a1);

		book.addContact(c1);
		book.addContact(c2);
		book.addContact(c3); // duplicate

		book.displaySortedContacts();

		System.out.println("\n-- Edit Contact --");
		book.editContact("Neha", "Sharma", "8888888888", "neha_new@gmail.com");

		System.out.println("\n-- Search by City --");
		book.searchByLocation("Indore");

		System.out.println("\n-- Delete Contact --");
		book.deleteContact("Ritesh", "Thakre");

		book.displaySortedContacts();
	}
}
