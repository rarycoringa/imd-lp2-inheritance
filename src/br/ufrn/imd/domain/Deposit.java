package br.ufrn.imd.domain;

import java.util.ArrayList;

import br.ufrn.imd.domain.Product;

public class Deposit {
	private ArrayList<Product> products;
	
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
	
	public Product getProductMostExpensive() {
		Product product_most_expensive = this.products.get(0);
		
		for(Product product : this.products) {
			if (product.getPrice() >= product_most_expensive.getPrice()) {
				product_most_expensive = product;
			}
		}
		
		return product_most_expensive;
	}
}
