package day4.EventEase;

public class BirthdayEvent extends Event {

    public BirthdayEvent(
            int eventId,
            String location,
            String date,
            int attendees,
            double venueCost,
            double serviceCost,
            double discount,
            User organizer
    ) {
        super(
                eventId,
                "Birthday Party",
                location,
                date,
                attendees,
                venueCost,
                serviceCost,
                discount,
                organizer
        );
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event scheduled with decorations and cake arrangements.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎂 Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Birthday Event cancelled.");
    }
}
