package day4.EduMentor;

public class LearnerProgress {

    private double percentage;

    public LearnerProgress(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public boolean isPassed() {
        return percentage >= 60;
    }
}
