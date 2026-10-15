package trecicas;

public class kompleksnibroj {
//atributi
	private double realniDio;
	private double imaginarniDio;
	
	//konstruktor
	public kompleksnibroj(double a, double b) {
		realniDio = a;
		imaginarniDio= b;
		
	}
	
	
	


	//setteri
	public void postaviRealniDio(double a) {
		realniDio=a;
	}
	public void postaviImaginarniDio(double a ) {
		imaginarniDio=a;
	}
	//getteri
	public double dajRealnidio() {
		return realniDio;
	}
	public double dajImaginarniDio() {
		return imaginarniDio;
	}
	
	public void stampaj() {
		if(imaginarniDio>=0)
			System.out.printf("%.2f + %.2fi",realniDio, imaginarniDio);
		else 
			System.out.printf("%.2f - %.2fi",realniDio, imaginarniDio);;
	}
	//moduo kom. broja
	
	public double moduo() {
		double rez;
		rez = Math.sqrt(realniDio*realniDio+imaginarniDio*imaginarniDio);
		return rez;
	}
	
	public kompleksnibroj saberi(kompleksnibroj a ) {
		kompleksnibroj rez = new kompleksnibroj(0,0);
		rez.postaviRealniDio(realniDio+a.realniDio);
		rez.postaviImaginarniDio(imaginarniDio+a.imaginarniDio);
		
		
		return rez;
		
		
		
	}
	public kompleksnibroj oduzmi(kompleksnibroj a ) {
		kompleksnibroj rez = new kompleksnibroj(0,0);
		rez.postaviRealniDio(realniDio-a.realniDio);
		rez.postaviImaginarniDio(imaginarniDio-a.imaginarniDio);
		
		
		return rez;
		
		
		
	}
	public kompleksnibroj mnozi(kompleksnibroj a ) {
		kompleksnibroj rez = new kompleksnibroj(0,0);
		rez.postaviRealniDio(realniDio*a.realniDio-imaginarniDio*a.imaginarniDio);
		rez.postaviImaginarniDio(realniDio*a.imaginarniDio+imaginarniDio*a.realniDio);
		
		
		return rez;
		
		
		
	}
}
