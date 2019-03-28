package APIs;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Search {
	private static final int MAX_RESULTS = 7;
	private String searchInsetrtion;
	private ArrayList<searchResult> results = new ArrayList<searchResult>(MAX_RESULTS);
//	public Search() throws UnsupportedEncodingException, IOException{
//		this.searchInsetrtion = "tony";
//		this.searching();
//	}
	public Search(String searchInsetrtion) throws UnsupportedEncodingException, IOException{
		if(!setSearchInsetrtion(searchInsetrtion))
			this.searchInsetrtion = "Example Search";
	}
	
	public searchResult getResult(int index){return this.results.get(index);}
	public boolean setResult(searchResult result){
		if(result == null) return false;
		this.results.add(result);
		return true;
	}
	public String getSearchInsetrtion(){return this.searchInsetrtion;}
	public boolean setSearchInsetrtion(String searchInsetrtion){
		if(searchInsetrtion == null){
			return false;
		}
		this.searchInsetrtion = searchInsetrtion;
		return true;
	}
	public void searchText() throws UnsupportedEncodingException, IOException{
		String google = "http://www.google.com/search?q=";
		String search = this.getSearchInsetrtion();
		String charset = "UTF-8";
		String userAgent = "ExampleBot 1.0 (+http://example.com/bot)";
		Elements links = Jsoup.connect(google + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select(".g>.r>a");
		System.out.println(links);
		for (Element link : links) {
		    String title = link.text();
		    String url = link.absUrl("href");
		    url = URLDecoder.decode(url.substring(url.indexOf('=') + 1, url.indexOf('&')), charset);
		    if (!url.startsWith("http")) {
		        continue;
		    }
		    this.setResult((new searchResult(title,url)));
		}
	}
	public void searchPhotos(){
		
	}
}