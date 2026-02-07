package com.futurelogistics;

public class BrickTransports extends GoodsTransport {

    float brickSize;
    int brickQuantity;
    float brickPrice;

    public BrickTransports(String transportId, String transportDate,
            int transportRating, float brickSize, int brickQuantity, float brickPrice) {

        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) return "Truck";
        else if (brickQuantity <= 500) return "Lorry";
        else return "MonsterLorry";
    }

    public float calculateDiscount() {
        if (transportRating == 5) return 20;
        else if (transportRating >= 3) return 10;
        return 0;
    }

    public float getVehiclePrice() {
        String vehicle = vehicleSelection();
        if (vehicle.equalsIgnoreCase("Truck")) return 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) return 1700;
        return 3000;
    }

    public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrice() {
		return brickPrice;
	}

	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}

	@Override
    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;
        float discount = price * calculateDiscount() / 100;
        return price + tax + getVehiclePrice() - discount;
    }
}
