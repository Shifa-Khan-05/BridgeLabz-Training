/*
 * DigitalArt inherits from Artwork
 * Overrides license method (Polymorphism)
 */
class DigitalArt extends Artwork {

    DigitalArt(String title, String artist, String licenseType, double price) {
        super(title, artist, licenseType, price);
    }

    void getArt() {
        System.out.println("This is a Digital Art");
    }

    @Override
    public void license() {
        System.out.println("Digital License: Online use only, non-transferable");
    }
}
