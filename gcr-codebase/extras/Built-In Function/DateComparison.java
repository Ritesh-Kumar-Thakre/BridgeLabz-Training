import java.time.LocalDate;
public class DateComparison {
    public static void main(String[] args) {
		// Taking dates
        LocalDate date1 = LocalDate.of(2024, 6, 15);
        LocalDate date2 = LocalDate.of(2024, 7, 10);

        if (date1.isBefore(date2)) {
            System.out.println("first date is before second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("first date is after second date.");
        } else {
            System.out.println("Both dates are same.");
        }
    }
}