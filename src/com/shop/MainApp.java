package com.shop;

import java.util.Collection;

import com.shop.partner.Buyer;
import com.shop.products.Book;
import com.shop.products.Product;

public class MainApp {
	public static void main(String[] args) {
		Shop myShop = new Shop();
		
		Book cBook = new Book("C1234");
		cBook.setDesription("C++ for Dummies");
		
		Book javaBook = new Book("JAVA1234");
		javaBook.setDesription("Java for Profis ");
		
		myShop.addProduct(cBook);
		myShop.addProduct(javaBook);
		
		Buyer tung = new Buyer("tung");
		tung.setFirstName("Tung");
		
		myShop.addBuyer(tung);
		
		Product foundProduct = myShop.searchProduct("C124");
		if (foundProduct == null)
			System.out.println("C124 not found");
		else
			System.out.println(myShop.searchProduct("C124").getDesription());
		
		/**
		 * test: buyer buys something. 
		 */
		myShop.buy("tung", "C1234");
		myShop.buy("tung", "JAVA1234");
		myShop.buy("tung", "Sh");
		Collection<String> tungCart = myShop.getShoppingCart("tung");
 	
		System.out.println("myShop finish");
	}
}
