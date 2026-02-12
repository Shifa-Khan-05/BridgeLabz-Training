import java.util.regex.Pattern;
import java.util.regex.Matcher;

class FlightUtil {

    // Validate Flight Number
    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException {

        String regex = "^FL-[1-9]\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(flightNumber);

        if (!matcher.matches()) {
            throw new InvalidFlightException(
                    "The flight number " + flightNumber + " is invalid");
        }
        return true;
    }

    // Validate Flight Name (CASE-SENSITIVE as per note)
    public boolean validateFlightName(String flightName)
            throws InvalidFlightException {

        if (!(flightName.equals("SpiceJet") ||
              flightName.equals("Vistara") ||
              flightName.equals("IndiGo") ||
              flightName.equals("Air Arabia"))) {

            throw new InvalidFlightException(
                    "The flight name " + flightName + " is invalid");
        }
        return true;
    }

    // Helper Method: Get Passenger Capacity
    private int getCapacity(String flightName) {

        switch (flightName) {
            case "SpiceJet":
                return 396;
            case "Vistara":
                return 615;
            case "IndiGo":
                return 230;
            case "Air Arabia":
                return 130;
        }
        return 0;
    }

    // Validate Passenger Count
    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {

        int capacity = getCapacity(flightName);

        if (passengerCount <= 0 || passengerCount > capacity) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount +
                    " is invalid for " + flightName);
        }
        return true;
    }

    // Calculate Fuel
    public double calculateFuelToFillTank(String flightName,
                                          double currentFuelLevel)
            throws InvalidFlightException {

        double maxCapacity = 0;

        switch (flightName) {
            case "SpiceJet":
                maxCapacity = 200000;
                break;
            case "Vistara":
                maxCapacity = 300000;
                break;
            case "IndiGo":
                maxCapacity = 250000;
                break;
            case "Air Arabia":
                maxCapacity = 150000;
                break;
        }

        if (currentFuelLevel < 0 || currentFuelLevel > maxCapacity) {
            throw new InvalidFlightException(
                    "Invalid fuel level for " + flightName);
        }

        return maxCapacity - currentFuelLevel;
    }
}
