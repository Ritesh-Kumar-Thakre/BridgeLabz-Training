package day2.TrainCompanion;

public class User {
    protected String name;
    protected int age;
    protected String gander;
    protected int coachNumber;

    public User(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public int getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(int coachNumber) {
        this.coachNumber = coachNumber;
    }

    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gander: " + gander);
    }
}
