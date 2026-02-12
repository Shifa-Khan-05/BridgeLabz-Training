import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();

        try {

            System.out.println("Enter flight details in the format:");
            System.out.println("<FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuelLevel>");
            System.out.println("Example: FL-1234:SpiceJet:250:50000");

            String input = sc.nextLine();

            String[] data = input.split(":");

            if (data.length != 4) {
                throw new InvalidFlightException("Invalid input format");
            }

            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount = Integer.parseInt(data[2]);
            double currentFuel = Double.parseDouble(data[3]);

            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(passengerCount, flightName);

            double fuelRequired =
                    util.calculateFuelToFillTank(flightName, currentFuel);

            System.out.println("Fuel required to fill the tank: "
                    + fuelRequired + " liters");

        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input format");
        }

        sc.close();
    }
}
