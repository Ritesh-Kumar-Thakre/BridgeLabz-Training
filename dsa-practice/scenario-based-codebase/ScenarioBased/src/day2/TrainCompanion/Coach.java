package day2.TrainCompanion;

import java.util.*;

public class Coach {
    protected int coachNumber;
    protected String type;
    protected String wifiSpeed;
    protected String pantry;
    protected Coach prevCoach;
    protected Coach nextCoach;
    protected List<User> users = new ArrayList<>();

    public Coach(int coachumber, String type, String wifiSpeed, String pantry) {
        this.coachNumber = coachumber;
        this.type = type;
        this.wifiSpeed = wifiSpeed;
        this.pantry = pantry;
        this.prevCoach = null;
        this.nextCoach = null;
    }

    public int getCoachNumber() {
        return coachNumber;
    }

    public void displayCoach() {
        System.out.println("Coach number: " + coachNumber);
        System.out.println("Coach type: " + type);
        System.out.println("Wifi speed: " + wifiSpeed);
        System.out.println("Pantry: " + pantry);
    }
}
