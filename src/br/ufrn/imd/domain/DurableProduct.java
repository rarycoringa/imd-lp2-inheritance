package br.ufrn.imd.domain;

import java.util.Date;

import br.ufrn.imd.domain.Product;

public class DurableProduct extends Product {
	private int durability;

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
}
