package APIs;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class main {

	public static void main(String[] args) throws IOException, ParseException{
//		Search src = new Search("tony");
//		src.searchText();
//		for(int i=0;i<7;i++){
//			System.out.println(i+" result: "+src.getResult(i));
//		}
		Double[] cord = Cordinates.getCordinates("Dovev Street 3, Ashkelon","Israel");
		System.out.println(cord[0]);
		System.out.println(cord[1]);
	}
}