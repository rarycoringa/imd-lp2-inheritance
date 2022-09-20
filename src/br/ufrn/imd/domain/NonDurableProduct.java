package br.ufrn.imd.domain;

import java.util.Date;

import br.ufrn.imd.domain.Product;

public class NonDurableProduct extends Product {
	private Date expirationDate;
	private String genre;
	
	public NonDurableProduct(String name, double price, String brand, String description, Date productionDate, Date expirationDate, String genre) {
		super(name, price, brand, description, productionDate);
		this.expirationDate = expirationDate;
		this.genre = genre;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
