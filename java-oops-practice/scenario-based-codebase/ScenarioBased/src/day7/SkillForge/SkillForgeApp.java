package day7.SkillForge;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor ins = new Instructor("Dr. Mehta", "mehta@skillforge.com", "Java");

        String[] javaModules = {"OOP", "DSA", "Spring", "Projects"};
        Course course = new Course("Java Mastery", ins, javaModules);

        course.addReview(5);
        course.addReview(4);
        course.addReview(5);

        Student s1 = new Student("Ritesh", "ritesh@mail.com");
        s1.updateProgress(4, course.getTotalModules());

        Student s2 = new Student("Neha", "neha@mail.com");
        s2.updateProgress(2, course.getTotalModules());

        course.displayCourse();

        System.out.println("\n--- Students ---");
        s1.display();
        s1.generateCertificate();

        System.out.println();

        s2.display();
        s2.generateCertificate();
    }
}
