package com.constructors.level1;
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void display() {
        System.out.println("Guest Name = " + guestName  );
        System.out.println("Room type = "  +  roomType );
        System.out.println("Nights = " + nights);
    }
    
    
    public static void main(String args[])
    {
    	HotelBooking hotelBooking=new HotelBooking("abhya", "Ac", 4);
    	hotelBooking.display();
    }
}

