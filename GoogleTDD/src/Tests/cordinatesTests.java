package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import APIs.Cordinates;

public class cordinatesTests {
	private Cordinates src = new Cordinates();
	@Test
	public void firstResultTest() throws UnsupportedEncodingException, IOException, ParseException{
		String addressInput = "Dovev Street 3, Ashkelon";
	    String countyInput = "Israel";
	    Double[] check = {31.6783435,34.5810802};
		assertEquals(check,Cordinates.getCordinates(addressInput,countyInput));
		assertTrue(Arrays.equals(check,Cordinates.getCordinates(addressInput,countyInput)));
	}
	@Test
	public void secondResultTest() throws UnsupportedEncodingException, IOException, ParseException{
		String addressInput = "Garden Street, Cambridge, MA";
	    String countyInput = "USA";
	    Double[] check = {42.3815099,-71.126215};
		assertEquals(check,Cordinates.getCordinates(addressInput,countyInput));
		assertTrue(Arrays.equals(check,Cordinates.getCordinates(addressInput,countyInput)));
	}
	@Test
	public void thirdResultTest() throws UnsupportedEncodingException, IOException, ParseException{
		String addressInput = "Rue Claude Guichard, 63000 Clermont-Ferrand";
	    String countyInput = "France";
	    Double[] check = {45.7764049,3.119611};
		assertEquals(check,Cordinates.getCordinates(addressInput,countyInput));
		assertTrue(Arrays.equals(check,Cordinates.getCordinates(addressInput,countyInput)));
	}
	@Test
	public void fourthResultTest() throws UnsupportedEncodingException, IOException, ParseException{
		String addressInput = "Kohlenweg 1, 44147 Dortmund";
	    String countyInput = "Germany";
	    Double[] check = {51.52538999999999,7.433009999999999};
		assertEquals(check,Cordinates.getCordinates(addressInput,countyInput));
		assertTrue(Arrays.equals(check,Cordinates.getCordinates(addressInput,countyInput)));
	}
	@Test
	public void fifthResultResultTest() throws UnsupportedEncodingException, IOException, ParseException{
		String addressInput = "Calle Sta. María del Monte, 6A, 45480 Urda, Toledo";
	    String countyInput = "Spain";
	    Double[] check = {39.4078226,-3.714550499999999};
		assertEquals(check,Cordinates.getCordinates(addressInput,countyInput));
		assertTrue(Arrays.equals(check,Cordinates.getCordinates(addressInput,countyInput)));
	}
}
