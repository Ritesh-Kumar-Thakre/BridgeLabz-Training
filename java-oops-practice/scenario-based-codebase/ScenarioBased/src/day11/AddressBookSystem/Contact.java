package day11.AddressBookSystem;

public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Address address;

	public Contact(String firstName, String lastName, String phone, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSameContact(String fName, String lName) {
		return this.firstName.equalsIgnoreCase(fName) && this.lastName.equalsIgnoreCase(lName);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " | Phone: " + phone + " | Email: " + email + " | Address: "
				+ (address != null ? address : "N/A");
	}
}
