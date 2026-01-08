public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    
    public void book() {
        System.out.println("International trip to " + destination + " booked with visa processing.");
    }

    
    public void cancel() {
        System.out.println("International trip cancelled with refund policy.");
    }
}
