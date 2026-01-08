package day4.FitTrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;
    protected double caloriesBurned;
    private boolean isActive;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories(double weight);

    @Override
    public void startWorkout() {
        isActive = true;
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        isActive = false;
        System.out.println(type + " workout stopped");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void displayWorkout() {
        System.out.println("Workout Type: " + type);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories Burned: " + caloriesBurned);
    }
}
