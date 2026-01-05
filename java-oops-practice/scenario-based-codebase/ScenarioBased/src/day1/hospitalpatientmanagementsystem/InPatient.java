package day1.hospitalpatientmanagementsystem;

public class InPatient extends Patient {

    private int roomNumber;
    private int daysAdmitted;

    public InPatient(int id, String name, int age,
                     int roomNumber, int daysAdmitted) {

        super(id, name, age);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: In-Patient");
        System.out.println("Room No: " + roomNumber);
        System.out.println("Days Admitted: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
