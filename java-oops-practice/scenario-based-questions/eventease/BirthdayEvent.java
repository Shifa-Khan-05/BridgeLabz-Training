class BirthdayEvent extends Event {

    BirthdayEvent(String name, String location, String date, int attendees,
                  boolean catering, boolean decoration, User organizer) {
        super(name, location, date, attendees, catering, decoration, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with fun activities ");
    }
}
