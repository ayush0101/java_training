package com.training.model;

import com.training.ifaces.Item;

public abstract class RentalAgency implements Item {
	
	private double price;
	private int quantity;
	private int noOfdays;
	
	

	public RentalAgency() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RentalAgency(double price, int quantity, int noOfdays) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.noOfdays = noOfdays;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getNoOfdays() {
		return noOfdays;
	}



	public void setNoOfdays(int noOfdays) {
		this.noOfdays = noOfdays;
	}



	@Override
	public double rentCalculator() {
		return this.price*this.noOfdays*this.quantity;
	}

}
