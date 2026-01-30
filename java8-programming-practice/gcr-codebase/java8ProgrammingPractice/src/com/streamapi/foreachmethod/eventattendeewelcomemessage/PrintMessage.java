package com.streamapi.foreachmethod.eventattendeewelcomemessage;

import java.util.ArrayList;
import java.util.List;

public class PrintMessage {

	public static void main(String[] args) {
		List<Attendee> attendees = new ArrayList<Attendee>();
		attendees.add(new Attendee("Sneha", "Wlcome sneha"));
		attendees.add(new Attendee("Sakshi", "Wlcome sakshi"));
		attendees.add(new Attendee("Riya", "Wlcome Riya"));

		System.out.println();
		attendees.forEach(a -> System.out.println(" Name : " + a.name + " | Message " + a.msg));
	}
}
