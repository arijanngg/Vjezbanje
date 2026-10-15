package vjezbe;

public class Zaposleni {

	private String ime;
	private String prezime;
	private int godine_staza;
	private int plata;
	
	
	public Zaposleni(String ime, String prezime, int godine_staza, int plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public int getGodine_staza() {
		return godine_staza;
	}


	public void setGodine_staza(int godine_staza) {
		
		if(godine_staza<0) {
			System.out.println("Ne moze biti negativno");
			this.godine_staza=0;
		}else {
		
		this.godine_staza = godine_staza;
		}
	}


	public int getPlata() {
		return plata;
	}


	public void setPlata(int plata) {
		this.plata = plata;
	}			
	public void ispisivanje() {
		System.out.println("Ime radnika : " + this.ime + ", prezime radnika :" + this.prezime + ", godine staza: " + this.godine_staza);
		
	}
	public void najveca(Zaposleni z2, Zaposleni z3) {
		if (this.plata >= z2.plata && this.plata >=z3.plata) {
			System.out.println("Najvecu platu ima :" + this.ime);
		}else if ( z2.plata >= this.plata && z2.plata>= z3.plata) {
			System.out.println("najvecu platu ima " + z2.ime);
		}else {
			System.out.println("Najvecu platu ima " + z3.ime);
		}
		

	}

	public void provjera () {
		if(this.plata<800) {
			if(this.godine_staza>10) {
				double staraplata = this.plata;
				double novaplata = staraplata*1.06;
				System.out.println("Nova plata je " + novaplata );
			}else {
				System.out.println("nema godine staza");
			}
		}else {
			System.out.println("Plata veca od 800");
		}
		}
		public static void main(String[] args) {

			Zaposleni z1 = new Zaposleni("Marko", "Markovic", 12, 700);
	        Zaposleni z2 = new Zaposleni("Petar", "Petrovic", 5, 900);
	        Zaposleni z3 = new Zaposleni("Nikola", "Nikolic", 15, 750);

	        // Ispis zaposlenih
	        z1.ispisivanje();
	        
	        z1.provjera();
	        
			
		
	}
}
