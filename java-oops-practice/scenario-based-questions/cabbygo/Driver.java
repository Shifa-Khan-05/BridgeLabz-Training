
public class Driver {

    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public void showDriverDetails() {
        System.out.println("Driver Name: " + name);
        System.out.println("License No: " + licenseNumber);
        System.out.println("Rating: " + rating);
    }
}
