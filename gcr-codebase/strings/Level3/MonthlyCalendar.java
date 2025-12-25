import java.util.*;
public class MonthlyCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(month, year);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Print initial spaces
        for(int i=0;i<startDay;i++){
            System.out.print("    ");
        }
        // Print days
        for(int day=1;day<=days;day++){
            System.out.printf("%3d ", day);
            // Move to next line after Saturday
            if(((day + startDay) % 7) == 0){
                System.out.println();
            }
        }
        System.out.println();
        sc.close();
    }

    // Method to get the name of the month
    public static String getMonthName(int month){
        String[] months = {"", "January","February","March","April","May","June",
							"July","August","September","October","November","December"};
        return months[month];
    }

    // Method to check Leap year check
    public static boolean isLeapYear(int year){
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // Method to Get number of days in month
    public static int getDaysInMonth(int month,int year){
        int[] days = {
                0,31,28,31,30,31,30,31,31,30,31,30,31
        };
        // February leap year check
        if(month == 2 && isLeapYear(year)){
            return 29;
        }
        return days[month];
    }

    // Method to apply Gregorian Algorithm (First day of month)
    public static int getFirstDay(int month,int year){
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (x + (31*m0)/12) % 7;
    }
}
