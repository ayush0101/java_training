package com.training;

import com.training.model.Computer;
import com.training.model.Furniture;
import com.training.service.RentalService;

public class AgencyApplication {

	public static void main(String[] args) {

		Computer dell= new Computer(1000,19,10);
		Furniture table = new Furniture(200,8,10);
		RentalService service = new RentalService();
		service.printRent(dell);
		service.printRent(table);
	}

}
