package day4.EventEase;

public abstract class Event implements ISchedulable {

    private final int eventId;   // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    protected User organizer;

    // Constructor without services
    public Event(
            int eventId,
            String eventName,
            String location,
            String date,
            int attendees,
            double venueCost,
            User organizer
    ) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with catering / decoration
    public Event(
            int eventId,
            String eventName,
            String location,
            String date,
            int attendees,
            double venueCost,
            double serviceCost,
            double discount,
            User organizer
    ) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    // Cost calculation (operators)
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void displayEventDetails() {
        System.out.println("\nEvent ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        organizer.displayUser();
    }
}
