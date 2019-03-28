package Tests;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

import APIs.Search;

public class searchTests {
	private Search src = null;
	@Test
	public void firstResultTest() throws UnsupportedEncodingException, IOException{
		src = new Search("usa");
		src.searchText();
		String firstTitle = "United States - Wikipedia";
		String firstURL = "https://en.wikipedia.org/wiki/United_States";
		assertEquals(firstTitle,src.getResult(0).getTitle());
		assertEquals(firstURL,src.getResult(0).getURL());
		assertTrue(firstTitle.equals(src.getResult(0).getTitle()));
		assertTrue(firstURL.equals(src.getResult(0).getURL()));
	}
	@Test
	public void secondResultTest() throws UnsupportedEncodingException, IOException{
		src = new Search("Popcorn");
		src.searchText();
		String firstTitle = "Popcorn Time - Watch Free Movies and TV Shows instantly";
		String firstURL = "https://getpopcorntime.is/";
		assertEquals(firstTitle,src.getResult(0).getTitle());
		assertEquals(firstURL,src.getResult(0).getURL());
		assertTrue(firstTitle.equals(src.getResult(0).getTitle()));
		assertTrue(firstURL.equals(src.getResult(0).getURL()));
	}
	@Test
	public void thirdResultTest() throws UnsupportedEncodingException, IOException{
		src = new Search("Watch");
		src.searchText();
		String firstTitle = "Watches - Jomashop";
		String firstURL = "https://www.jomashop.com/watches.html";
		assertEquals(firstTitle,src.getResult(0).getTitle());
		assertEquals(firstURL,src.getResult(0).getURL());
		assertTrue(firstTitle.equals(src.getResult(0).getTitle()));
		assertTrue(firstURL.equals(src.getResult(0).getURL()));
	}
	@Test
	public void fourthResultTest() throws UnsupportedEncodingException, IOException{
		src = new Search("Manager");
		src.searchText();
		String firstTitle = "Developer to Manager";
		String firstURL = "https://devtomanager.com/";
		assertEquals(firstTitle,src.getResult(3).getTitle());
		assertEquals(firstURL,src.getResult(3).getURL());
		assertTrue(firstTitle.equals(src.getResult(3).getTitle()));
		assertTrue(firstURL.equals(src.getResult(3).getURL()));
	}
	@Test
	public void fifthResultResultTest() throws UnsupportedEncodingException, IOException{
		src = new Search("project");
		src.searchText();
		String firstTitle = "Project";
		String firstURL = "https://proj.ouponlinepractice.com/";
		assertEquals(firstTitle,src.getResult(4).getTitle());
		assertEquals(firstURL,src.getResult(4).getURL());
		assertTrue(firstTitle.equals(src.getResult(4).getTitle()));
		assertTrue(firstURL.equals(src.getResult(4).getURL()));
	}
}
