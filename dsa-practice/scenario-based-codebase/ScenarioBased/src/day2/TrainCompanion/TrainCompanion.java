package day2.TrainCompanion;

public class TrainCompanion {
    public static void main(String[] args) {

        User u1 = new User("Ritesh", 21, "Male");

        Coach c1 = new Coach(1, "1st AC", "100mbps", "Indian, Italian, Chinese food");
        Coach c2 = new Coach(2, "1st AC", "100mbps", "Indian, Italian, Chinese food");
        Coach c3 = new Coach(3, "1st AC", "100mbps", "Indian, Italian, Chinese food");
        Coach c4 = new Coach(4, "2nd AC", "60mbps", "Indian, Italian food");
        Coach c5 = new Coach(5, "2nd AC", "60mbps", "Indian, Italian food");
        Coach c6 = new Coach(6, "2nd AC", "60mbps", "Indian, Italian food");
        Coach c7 = new Coach(7, "3rd AC", "30mbps", "Indian food");
        Coach c8 = new Coach(8, "3rd AC", "30mbps", "Indian food");
        Coach c9 = new Coach(9, "3rd AC", "30mbps", "Indian food");
        Coach c10 = new Coach(10, "GS", "No wifi", "Not available");

        Train train = new Train();

        train.addCoach(c1);
        train.addCoach(c2);
        train.addCoach(c3);
        train.addCoach(c4);
        train.addCoach(c5);
        train.addCoach(c6);
        train.addCoach(c7);
        train.addCoach(c8);
        train.addCoach(c9);
        train.addCoach(c10);

        train.traverseForward();
        train.traverseBackward();

        train.assignUserToCoach(u1, 3);
        train.displayAdjacentByCoach(u1);

        System.out.println("\nRemoving coach 5...");
        train.removeCoach(5);

        train.traverseForward();
        train.traverseBackward();
    }
}

