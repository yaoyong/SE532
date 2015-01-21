package edu.olivet.se532;

public class Seller {
	private String name;
	private int rating;
	private int rating_count;
	private boolean instore;
	private String shipping_Country;
	private boolean expectedavailable;
	private boolean intanationlavailable;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRatingCount() {
		return rating_count;
	}
	public void setRatingCount(int rating_count) {
			this.rating_count = rating_count;	
	}
	public boolean isInStore() {
		return instore;
	}
	public void setInStore(boolean instore) {
			this.instore = instore;	
	}
	public String getShippingCountry() {
		return shipping_Country;
	}
	public void setShippingCountry(String shipping_Country) {
		this.shipping_Country = shipping_Country;
	}
	public boolean isExpectedAvailable() {
		return expectedavailable;
	}
	public void setExpeditedShippingAvailable(boolean expectedavailable) {
		this.expectedavailable = expectedavailable;
	}
	public boolean isIntanationAvailable() {
		return intanationlavailable;
	}
	public void setIntanationAvailable(boolean intanationlavailable) {
		this.intanationlavailable = intanationlavailable;
	}
}


