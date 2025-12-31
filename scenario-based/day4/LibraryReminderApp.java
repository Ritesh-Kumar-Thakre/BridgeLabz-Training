/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.util.*;
public class LibraryReminderApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter today's month (1-12):");
        int monthToday =sc.nextInt();
        System.out.println("Enter today's date (1-30):");
        int dayToday =sc.nextInt();
		
		// Applying the required logic
        int todayTotalDays =monthToday*30 + dayToday;
        String books[] =new String[5];
        int totalFine =0;
        final int finePerDay =5;
        System.out.println("\nEnter names of 5 books:");
        for(int i =0; i< 5;i++) {
            books[i] =sc.next();
        }
        System.out.println("\n------ Library Fine Report ------");
        for(int i = 0; i<5;i++) {
            System.out.println("\nEnter due month for book " + books[i] + ":");
            int dueMonth = sc.nextInt();
            System.out.println("Enter due date for book " + books[i] + ":");
            int dueDay = sc.nextInt();
            int dueTotalDays = dueMonth*30 + dueDay;
            int lateDays = todayTotalDays - dueTotalDays;
            if(lateDays > 0){
                int fine =lateDays * finePerDay;
                totalFine +=fine;
                System.out.println("Book: " + books[i]);
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Book: " + books[i]);
                System.out.println("Returned on time — No fine");
            }
        }
        System.out.println("\nTotal Fine to Pay: ₹" + totalFine);
    }
}
