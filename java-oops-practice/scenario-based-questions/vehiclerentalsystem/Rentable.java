package vehiclerentalsystem;
// Abstraction: hides rent calculation logic

interface Rentable {
    double calculateRent(int days);
}
