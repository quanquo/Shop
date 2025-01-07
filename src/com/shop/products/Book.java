package com.shop.products;

/**
 * This class is a subclass of Product.
 * Helps to manage books in your shop.
 */
public class Book extends Product {

	private String isbn;
	
	public Book(String productID) {
		super(productID);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	 
}
