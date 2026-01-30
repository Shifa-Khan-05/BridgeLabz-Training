package com.streamapi.hospitaldoctoravailability;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

	
	public static void main(String[] args) {
		 List<Doctors> doctors=new ArrayList<Doctors>();
		  doctors.add(new Doctors("Dr. Kumar", "ENT", false));
	        doctors.add(new Doctors("Dr. Mehta", "Cardiology", true));
	        doctors.add(new Doctors("Dr. Sharma", "Orthopedic", true));
	        doctors.add(new Doctors("Dr. Ali", "Dermatology", false));
	        doctors.add(new Doctors("Dr. Roy", "Neurology", true));
	
	List<Doctors> fiList= doctors.stream().filter(d-> d.isAvailableOnWeekend).sorted(Comparator.comparing(Doctors::getSpeciality)).collect(Collectors.toList());
	
    fiList.forEach(System.out::println); 
	
	}
}
