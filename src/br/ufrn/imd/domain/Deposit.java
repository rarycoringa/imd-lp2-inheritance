package br.ufrn.imd.domain;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.domain.Product;

public class Deposit {
	private List<Product> products;
	
	public Deposit() {
		this.products = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void removeProduct(Product product) {
		this.products.remove(product);
	}
	
	public int getProductsQuantity() {
		return this.products.size();
	}
	
	public boolean isEmpty() {
		return this.products.isEmpty();
	}
	
	// get more expensive product
}
