package day1.hospitalpatientmanagementsystem;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ritesh", 22, 305, 4);
        Patient p2 = new OutPatient(102, "Aman", 25, "31-Jan-2025");
        Patient p3 = new Patient(103, "Rahul", 30, "Diabetes");

        Doctor d1 = new Doctor(201, "Dr. Mehta", "Cardiology");

        p1.displayInfo();
        d1.displayInfo();

        Bill bill1 = new Bill(p1, 8000, 2000, 1500);
        bill1.printBill();

        System.out.println("\n-------------------------");

        p2.displayInfo();
        Bill bill2 = new Bill(p2, 0, 1000, 400);
        bill2.printBill();

        System.out.println("\n-------------------------");

        p3.displayInfo();
        Bill bill3 = new Bill(p3, 0, 2500, 1000);
        bill3.printBill();
    }
}
