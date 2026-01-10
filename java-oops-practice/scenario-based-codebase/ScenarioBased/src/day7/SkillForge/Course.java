package day7.SkillForge;

public class Course {
    private String title;
    private Instructor instructor;
    private String[] modules;

    // Encapsulation
    private double rating;                  // protected logic
    private final int[] reviews = new int[10];  // read-only internal

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    public void addReview(int stars) {
        if (stars >= 1 && stars <= 5) {
            for (int i = 0; i < reviews.length; i++) {
                if (reviews[i] == 0) {
                    reviews[i] = stars;
                    break;
                }
            }
            calculateRating();
        }
    }

    protected void calculateRating() {        // encapsulated logic
        int sum = 0, count = 0;
        for (int r : reviews) {
            if (r > 0) {
                sum += r;
                count++;
            }
        }
        if (count > 0)
            rating = (double) sum / count;
    }

    public double getRating() {
        return rating;   // read-only
    }

    public int getTotalModules() {
        return modules.length;
    }

    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Modules: ");
        for (String m : modules)
            System.out.println(" - " + m);
        System.out.println("Rating: " + rating);
    }
}
