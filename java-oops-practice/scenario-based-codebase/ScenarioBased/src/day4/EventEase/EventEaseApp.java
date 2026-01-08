package day4.EventEase;

public class EventEaseApp {

    public static void main(String[] args) {

        User organizer = new User(
                "Ritesh",
                "ritesh@mail.com",
                "9876543210"
        );

        Event birthday = new BirthdayEvent(
                101,
                "Indore Banquet Hall",
                "20-Aug-2026",
                120,
                50000,
                20000,
                5000,
                organizer
        );

        Event conference = new ConferenceEvent(
                102,
                "Tech Convention Center",
                "15-Sep-2026",
                300,
                150000,
                organizer
        );

        birthday.schedule();
        birthday.displayEventDetails();

        conference.schedule();
        conference.reschedule("18-Sep-2026");
        conference.displayEventDetails();
    }
}
