import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class SkipsListe {
	private HashMap<Integer, String> linjer = new HashMap<Integer, String>();
	
	
	public void lesFil() throws Exception {
		String filnavn = "/skipsbase/skipsbase/Skipet/1906.txt";
		File fil = new File(filnavn);
		Scanner innFil = new Scanner(fil);
		int linjeNummer = 0;
		
		while (innFil.hasNextLine()) {
			String linje = innFil.nextLine();
			linjer.put(linjeNummer, linje);
			linjeNummer++;
		}
		innFil.close();
	}
	
	public void skrivLinje(int linjeNr) {
		String linje = linjer.get(linjeNr);
		System.out.println(linje);
	}
		
}