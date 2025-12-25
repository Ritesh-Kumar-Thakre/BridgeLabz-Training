import java.time.LocalDate;
public class DateArithmetic {
    public static void main(String[] args) {
		// Taking random date
        LocalDate inputDate = LocalDate.of(2024, 6, 15);

        LocalDate result = inputDate
            .plusDays(7)
            .plusMonths(1)
            .plusYears(2)
            .minusWeeks(3);
        System.out.println("Final Date: " + result);
    }
}