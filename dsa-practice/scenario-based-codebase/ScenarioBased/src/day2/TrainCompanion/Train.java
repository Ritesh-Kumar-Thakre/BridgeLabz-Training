package day2.TrainCompanion;

public class Train {
    static Coach head;
    static Coach tail;

    public void addCoach(Coach newCoach) {
        if (head == null) {
            head = tail = newCoach;
            return;
        }
        tail.nextCoach = newCoach;
        newCoach.prevCoach = tail;
        tail = newCoach;
    }

    public void removeCoach(int coachNumber) {
        Coach temp = head;

        while (temp != null) {
            if (temp.coachNumber == coachNumber) {

                if (temp == head)
                    head = temp.nextCoach;

                if (temp == tail)
                    tail = temp.prevCoach;

                if (temp.prevCoach != null)
                    temp.prevCoach.nextCoach = temp.nextCoach;

                if (temp.nextCoach != null)
                    temp.nextCoach.prevCoach = temp.prevCoach;

                System.out.println("Coach removed: " + coachNumber);
                return;
            }
            temp = temp.nextCoach;
        }

        System.out.println("Coach not found");
    }

    public void traverseForward() {
        Coach temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.coachNumber + " ");
            temp = temp.nextCoach;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Coach temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.coachNumber + " ");
            temp = temp.prevCoach;
        }
        System.out.println();
    }

    public void assignUserToCoach(User user, int coachNumber) {
        Coach temp = head;
        while (temp != null) {
            if (temp.coachNumber == coachNumber) {
                temp.users.add(user);
                user.setCoachNumber(coachNumber);
                System.out.println(user.name + " assigned to coach " + coachNumber);
                return;
            }
            temp = temp.nextCoach;
        }
    }

    public void displayAdjacentByCoach(User user) {
        int coachNumber = user.getCoachNumber();
        Coach temp = head;

        while (temp != null) {
            if (temp.getCoachNumber() == coachNumber) {
                System.out.println("\nUser is in Coach: " + coachNumber);
                System.out.println("Previous Coach: " + (temp.prevCoach != null ? temp.prevCoach.coachNumber : "None"));
                System.out.println("Next Coach: " + (temp.nextCoach != null ? temp.nextCoach.coachNumber : "None"));
                return;
            }
            temp = temp.nextCoach;
        }

        System.out.println("Coach not found");
    }
}
