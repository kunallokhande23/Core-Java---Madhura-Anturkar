package com.app.core;

public enum ServicePlan {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	private double cost;

	private ServicePlan(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
	
	
}
