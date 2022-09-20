package br.ufrn.imd.domain;

import java.util.Date;

import br.ufrn.imd.domain.Product;

public class DurableProduct extends Product {
	private int durability;
	
	public DurableProduct(String name, double price, String brand, String description, Date productionDate, int durability) {
		super(name, price, brand, description, productionDate);
		this.durability = durability;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
}
