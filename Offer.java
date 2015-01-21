package edu.olivet.se532;

public class Offer {

	public String toString() {
		return "Offer [seller=" + seller + ", product=" + product + ", condition=" + condition + ", price=" + price + ", shippingPrice="
				+ shippingPrice + "]";
	}

	private Seller seller;
	private Product product;
	private Condition condition;
	private float price;
	private float shippingPrice;
	
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(float shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
}