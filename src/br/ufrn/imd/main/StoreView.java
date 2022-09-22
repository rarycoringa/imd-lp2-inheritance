package br.ufrn.imd.main;

import java.util.Calendar;

import br.ufrn.imd.domain.DurableProduct;
import br.ufrn.imd.domain.NonDurableProduct;

public class StoreView {
	public static void main(String[] args) {
		Calendar productionDate = Calendar.getInstance();
		productionDate.set(Calendar.DATE, 22);
		productionDate.set(Calendar.MONTH, 9);
		productionDate.set(Calendar.YEAR, 2022);
		
		DurableProduct car = new DurableProduct();
		car.setName("M3");
		car.setPrice(69900.00);
		car.setBrand("BMW");
		car.setDescription("An amazing car");
		car.setProductionDate(productionDate.getTime());
		car.setDurability(10);

		DurableProduct book = new DurableProduct();
		book.setName("Harry Potter");
		book.setPrice(34.90);
		book.setBrand("J. K. Rowling");
		book.setDescription("A magic book");
		book.setProductionDate(productionDate.getTime());
		book.setDurability(20);
		
		DurableProduct phone = new DurableProduct();
		phone.setName("iPhone 13");
		phone.setPrice(999.90);
		phone.setBrand("Apple");
		phone.setDescription("A futuristic phone");
		phone.setProductionDate(productionDate.getTime());
		phone.setDurability(5);
		
		NonDurableProduct chocolate = new NonDurableProduct(); //to be done
		NonDurableProduct towel = new NonDurableProduct(); // to be done
		NonDurableProduct soap = new NonDurableProduct(); // to be done
	}
}
