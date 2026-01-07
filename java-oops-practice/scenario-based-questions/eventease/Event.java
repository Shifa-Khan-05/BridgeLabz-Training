class Event implements ISchedulable {

    private final int eventId;
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected boolean catering;
    protected boolean decoration;

    private double venueCost = 10000;
    private double cateringCost = 5000;
    private double decorationCost = 3000;
    private double discount = 2000;

    protected User organizer;

    private static int count = 100;

    Event(String eventName, String location, String date, int attendees,
          boolean catering, boolean decoration, User organizer) {

        this.eventId = ++count;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.catering = catering;
        this.decoration = decoration;
        this.organizer = organizer;
    }

    double calculateCost() {
        double total = venueCost;
        if (catering)
            total = total + cateringCost;
        if (decoration)
            total = total + decorationCost;

        return total - discount;
    }

    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + date);
    }

    public void cancel() {
        System.out.println("Event cancelled");
    }

    void showEventDetails() {
        System.out.println("Event ID : " + eventId);
        System.out.println("Event    : " + eventName);
        System.out.println("Location : " + location);
        System.out.println("Date     : " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateCost());
    }
}
