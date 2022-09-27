package com.app.core;

public enum Color {
	WHITE(1000), GREY(2000), SILVER(5000), BLACK(3000), RED(4500);

	// can you add state in the enum ?
	private double additionalCost;

	private Color(double additionalCost) {
		// super(name,ordinal)
		this.additionalCost = additionalCost;
	}

	public double getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(double additionalCost) {
		this.additionalCost = additionalCost;
	}

	// can you override toString : YES
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
