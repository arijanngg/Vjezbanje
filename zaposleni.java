package zadatak3;

public class zaposleni {

	private int jedinstveniID;
	private String ime;
	private String prezime;
	private double satnica;
	private int ukupanBrojSati;
	protected double plata;
	
	
	
	
	
	public zaposleni(int jedinstveniID, String ime, String prezime, double satnica, int ukupanBrojSati, double plata) {
		super();
		this.jedinstveniID = jedinstveniID;
		this.ime = ime;
		this.prezime = prezime;
		this.satnica = satnica;
		this.ukupanBrojSati = ukupanBrojSati;
		this.plata = plata;
	}
	public int getJedinstveniID() {
		return jedinstveniID;
	}
	public void setJedinstveniID(int jedinstveniID) {
		this.jedinstveniID = jedinstveniID;
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
	public double getSatnica() {
		return satnica;
	}
	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}
	public int getUkupanBrojSati() {
		return ukupanBrojSati;
	}
	public void setUkupanBrojSati(int ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
}	
	