package edu.olivet.se532;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
public class SellerHunterEntry {

	public static void main(String[] args) throws MalformedURLException, IOException {
		SellerHunter hunter = new SellerHunter();
		List<Offer> offers = hunter.getOfferList("031043601X", "New");
		for (Offer offer : offers) {
			System.out.println(offer);
		}
	}	
}