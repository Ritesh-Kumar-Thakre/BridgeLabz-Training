package day4.EventEase;

public class ConferenceEvent extends Event {

    public ConferenceEvent(
            int eventId,
            String location,
            String date,
            int attendees,
            double venueCost,
            User organizer
    ) {
        super(
                eventId,
                "Conference",
                location,
                date,
                attendees,
                venueCost,
                organizer
        );
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference scheduled with professional setup.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("📅 Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Conference cancelled.");
    }
}
