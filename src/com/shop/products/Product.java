package com.shop.products;

public abstract class Product {
	private String id;
	private String desription;
	
	public Product(String productID) {
		this.setId(productID);;
	}
	
	public String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	
	
}
