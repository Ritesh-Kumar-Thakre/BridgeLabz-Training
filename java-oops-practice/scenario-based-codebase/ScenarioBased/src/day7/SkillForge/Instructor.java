package day7.SkillForge;

public class Instructor extends User {

    private String specialization;

    public Instructor(String name, String email, String specialization) {
        super(name, email);
        this.specialization = specialization;
    }

    @Override
    public void display() {
        System.out.println("Instructor: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
