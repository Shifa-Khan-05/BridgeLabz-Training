package com.futurelogistics;

abstract public class GoodsTransport {

	String transportId;
	String transportDate;
	int transportRating;

	public GoodsTransport(String transportId, String transportDate, int transportRating) {
       this.transportDate=transportDate;
       this.transportId=transportId;
       this.transportRating=transportRating;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public String getTransportDate() {
		return transportDate;
	}

	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}

	public int getTransportRating() {
		return transportRating;
	}

	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}

	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
}
