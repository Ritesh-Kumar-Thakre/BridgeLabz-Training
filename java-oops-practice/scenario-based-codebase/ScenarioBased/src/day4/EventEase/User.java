package day4.EventEase;

public class User {

    private String name;
    private String email;   // sensitive
    private String phone;   // sensitive

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void displayUser() {
        System.out.println("Organizer: " + name);
        System.out.println("Email: " + email);
    }
}
