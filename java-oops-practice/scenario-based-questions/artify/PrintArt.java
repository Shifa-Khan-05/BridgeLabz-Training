/*
 * PrintArt inherits from Artwork
 * Overrides license method (Polymorphism)
 */
class PrintArt extends Artwork {

    PrintArt(String title, String artist, String licenseType, double price) {
        super(title, artist, licenseType, price);
    }

    void getArt() {
        System.out.println("This is a Print Art");
    }

    @Override
    public void license() {
        System.out.println("Print License: Physical reproduction allowed");
    }
}
