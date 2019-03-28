package APIs;

public class searchResult {
	private String title;
	private String URL;
	public searchResult(String title, String URL){
		this.title = title;
		this.URL = URL;
	}
	public String getURL(){return this.URL;}
	public String getTitle(){return this.title;}
	public String toString(){return "[Title:"+this.getTitle()+", URL:"+this.getURL()+"]";}
}
