package com.training.service;

import com.training.ifaces.Item;

public class RentalService {
public void printRent(Item items) {
		
		System.out.println("Total Rent for the item = " +items.rentCalculator());
	}
}
