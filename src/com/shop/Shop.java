package com.shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.shop.partner.Buyer;
import com.shop.partner.Seller;
import com.shop.products.Product;

/**
 * This is a framework allowing you to create you own shop.
 * The main functionalities:
 * - managing products
 * - managing sellers, buyers
 * - supports payments and invoices.
 */
public class Shop {
	private Map<String, Product> products;
	private Map<String, Seller> sellers;
	private Map<String, Buyer> buyers;
	private Map<String, Collection<String> > shoppingCart;

	public Shop() {
		products = new HashMap<String, Product>();
		sellers = new HashMap<String, Seller>();
		buyers = new HashMap<String, Buyer>();
		shoppingCart = new HashMap<String, Collection<String>>();
	}

	/**
	 * add a product to the shop.
	 * @param newProduct: the product you want to add to the shop
	 */
	public void addProduct(Product newProduct) {
		if (this.products.get(newProduct.getId()) == null)
			this.products.put(newProduct.getId(), newProduct);
	}

	public void addSeller(Seller newSeller) {
		if (this.sellers.get(newSeller.getPersonID()) == null)
			this.sellers.put(newSeller.getPersonID(), newSeller);
	}

	public void addBuyer(Buyer newBuyer) {
		if (this.buyers.get(newBuyer.getPersonID()) == null)
			this.buyers.put(newBuyer.getPersonID(), newBuyer);
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public Map<String, Seller> getSellers() {
		return sellers;
	}

	public Map<String, Buyer> getBuyers() {
		return buyers;
	}
	
	public Product searchProduct(String productID) {
		return this.products.get(productID);
	}

	public Seller searchSeller(String sellerID) {
		return this.sellers.get(sellerID);
	}
	
/**
 * allows buyer buys a product
 * @param buyerID
 * @param productId
 */
	public void buy(String buyerID, String productId) {
		Collection<String> productsOfBuyer;
		if (this.shoppingCart.get(buyerID) == null) {
			productsOfBuyer = new ArrayList<String>();
			productsOfBuyer.add(productId);
			this.shoppingCart.put(buyerID, productsOfBuyer);
		} else {
			productsOfBuyer = this.shoppingCart.get(buyerID);
			productsOfBuyer.add(productId);
		}
	}
	
	public Collection<String> getShoppingCart(String buyerID) {
		return this.shoppingCart.get(buyerID);
	}
}
