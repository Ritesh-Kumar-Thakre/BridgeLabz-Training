package day4.FitTrack;

public class FitTrackApp {
	public static void main(String[] args) {

		UserProfile user = new UserProfile("Ritesh", 22, 72.5, 2500);

		Workout cardio = new CardioWorkout(30);
		Workout strength = new StrengthWorkout(45);

		cardio.startWorkout();
		cardio.calculateCalories(user.getWeight());
		cardio.stopWorkout();

		strength.startWorkout();
		strength.calculateCalories(user.getWeight());
		strength.stopWorkout();

		double totalCaloriesBurned = cardio.getCaloriesBurned() + strength.getCaloriesBurned();

		int remainingCalories = user.getDailyCalorieGoal() - (int) totalCaloriesBurned;

		System.out.println("\n--- USER PROFILE ---");
		user.displayProfile();

		System.out.println("\n--- WORKOUT SUMMARY ---");
		cardio.displayWorkout();
		strength.displayWorkout();

		System.out.println("\nTotal Calories Burned: " + totalCaloriesBurned);
		System.out.println("Remaining Calories for Today: " + remainingCalories);
	}
}
