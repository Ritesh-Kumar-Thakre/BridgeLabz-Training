package day1.hospitalpatientmanagementsystem;

public class Bill implements Payable {

    private Patient patient;
    private double roomCharge;
    private double consultationFee;
    private double medicineCost;
    private double discount;

    public Bill(Patient patient, double roomCharge,
                double consultationFee, double medicineCost) {

        this.patient = patient;
        this.roomCharge = roomCharge;
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;

        // Emergency patients get 5% surcharge instead of discount
        if (patient.admissionType.equals("Emergency"))
            discount = -0.05 * (roomCharge + consultationFee);
        else
            discount = 0.10 * consultationFee;
    }

    @Override
    public double calculatePayment() {

        double subtotal = roomCharge + consultationFee + medicineCost;

        double tax = subtotal * 0.12;  // 12% GST

        return subtotal + tax - discount;
    }

    public void printBill() {
        System.out.println("\n----- Hospital Bill -----");
        System.out.println(patient.getSummary());
        System.out.println("Room Charge: " + roomCharge);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Cost: " + medicineCost);
        System.out.println("Discount / Surcharge: " + discount);
        System.out.println("Total Payable: " + calculatePayment());
    }
}
