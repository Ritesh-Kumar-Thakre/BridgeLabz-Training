package day1.hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

    private String appointmentDate;

    public OutPatient(int id, String name, int age, String appointmentDate) {
        super(id, name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Out-Patient");
        System.out.println("Appointment Date: " + appointmentDate);
    }
}
