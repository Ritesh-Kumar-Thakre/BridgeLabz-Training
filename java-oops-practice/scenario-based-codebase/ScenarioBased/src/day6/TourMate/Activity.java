package day6.TourMate;

public class Activity {
    private String activityName;
    private double cost;

    public Activity(String activityName, double cost) {
        this.activityName = activityName;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }

    String getActivityName() {
        return activityName;
    }
}
