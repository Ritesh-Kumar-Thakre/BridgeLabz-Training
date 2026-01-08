package day4.EduMentor;

public class Instructor extends User {

    private String specialization;
    private int experience;

    public Instructor(String name, String email, int userId, String specialization, int experience) {
        super(name, email, userId);
        this.specialization = specialization;
        this.experience = experience;
    }

    @Override
    public void displayUser() {
        super.displayUser();
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
    }
}