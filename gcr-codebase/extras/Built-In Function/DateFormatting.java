import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(fmt1.format(date));
        System.out.println(fmt2.format(date));
        System.out.println(fmt3.format(date));
    }
}