
/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/


public class  DigitalWatchSimulation {

     //creating a method to print the time
    public static void watchSimulation() {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                // Simulate power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println(" Power Cut at 13:00!");
                    return; // stops entire watch simulation
                }

                // Print time in HH:MM format
                System.out.printf("%02d:%02d%n", hour, minute);
            }
        }
    }
  //main method 
    public static void main(String[] args) {
		//call the method watchSimulation
        watchSimulation();
    }
}
