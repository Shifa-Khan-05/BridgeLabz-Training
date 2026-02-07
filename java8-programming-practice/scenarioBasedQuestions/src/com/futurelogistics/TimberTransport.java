package com.futurelogistics;

public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    // 7-argument constructor (exact order as specified)
    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {

        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    // Getters and Setters
    public float getTimberLength() {
        return timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    // Vehicle selection based on timber area
    @Override
    public String vehicleSelection() {

        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250) {
            return "Truck";
        } else if (area >= 250 && area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    // Calculate total charge
    @Override
    public float calculateTotalCharge() {

        // Volume calculation
        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        // Timber type rate
        float rate;
        if (timberType.equalsIgnoreCase("Premium")) {
            rate = 0.25f;
        } else {
            rate = 0.15f; // NonPremium
        }

        // Price calculation
        float price = volume * timberPrice * rate;

        // Tax (30%)
        float tax = price * 0.3f;

        // Vehicle price
        float vehiclePrice;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        } else if (vehicle.equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        } else {
            vehiclePrice = 3000;
        }

        // Discount based on transport rating
        float discountPercentage = 0;
        if (transportRating == 5) {
            discountPercentage = 20;
        } else if (transportRating == 3 || transportRating == 4) {
            discountPercentage = 10;
        }

        float discount = price * discountPercentage / 100;

        // Total charge
        return (price + tax + vehiclePrice) - discount;
    }
}
