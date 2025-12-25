import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZones{
	public static void main(String[]args){
	
		// Applying the required logic
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss z");
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
		ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		// Printing the results
        System.out.println("GMT: " + fmt.format(gmt));
        System.out.println("IST: " + fmt.format(ist));
        System.out.println("PST: " + fmt.format(pst));
	}
}