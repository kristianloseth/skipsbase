import java.util.ArrayList;

public class Skip {
	int nummer;
	int aar;
	String navn;
	String kalleSignal;
	String byggInfo;
	String tonnasje;
	String dimensjoner;
	ArrayList<String> hendelser = new ArrayList<String>();
	
	public Skip(String navn, int nummer, int aar) {
		this.navn = navn;
		this.nummer = nummer;
		this.aar = aar;
	}
	
	public void skrivSkip() {
		System.out.println(navn + nummer + aar);
	}

}
