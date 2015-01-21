package edu.olivet.se532;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class SellerHunter {
	private static final String AMAZON_HOST = "http://www.amazon.com";
	
	public List<Offer> getOfferList(String isbn, String condition) throws MalformedURLException, IOException {
		Document doc = this.getDocument(isbn, condition);
		List<Offer> results = new ArrayList<Offer>();
		Elements rows = doc.select("div.a-row.a-spacing-mini.olpOffer");
		for (int i = 0; i < rows.size(); i++) {
			results.add(new Offer());
		}
		return results;
	}
	
	Document getDocument(String isbn, String condition) throws MalformedURLException, IOException {
		String url = String.format("%s/gp/offer-listing/%s/ref=olp_tab_%s?ie=UTF8&condition=%s&sr=8-1", 
								   AMAZON_HOST, isbn, condition.toLowerCase(), condition.toLowerCase());
		Connection conn = getConnection(new URL(url));
		Document document = conn.get();
		return document;
	}
	
	Connection getConnection(URL url) {
		Connection conn = Jsoup.connect(url.toExternalForm());
		conn.timeout(8000);
		conn.header("Connection", "keep-alive");
		conn.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		conn.header("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36");
		conn.header("Accept-Encoding", "gzip, deflate, sdch");
		conn.header("Accept-Language", "en-US,en;q=0.8");
		conn.header("Cache-Control", "max-age=0");
		conn.header("Host", url.getHost());
		return conn;
	}
	
	String getText(Document document, String selector) {
		Elements elements = document.select(selector);
		if (elements.size() <= 0) {
			return "";
		}
		return elements.get(0).text();
	}
}