package day4.FitTrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.08;
    }
}
