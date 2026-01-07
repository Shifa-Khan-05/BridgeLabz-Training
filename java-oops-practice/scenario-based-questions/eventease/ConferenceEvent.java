class ConferenceEvent extends Event {

    ConferenceEvent(String name, String location, String date, int attendees,
                    boolean catering, boolean decoration, User organizer) {
        super(name, location, date, attendees, catering, decoration, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Event scheduled with professional setup ");
    }
}
