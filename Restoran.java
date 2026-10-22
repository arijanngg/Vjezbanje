package zadatak3;

import java.util.ArrayList;

public class Restoran {

	private String Naziv;
	private String adresa;
	private int PIB;
	private ArrayList<zaposleni> zaposleni;
	
	
	public Restoran(String naziv, String adresa, int pIB, ArrayList<zadatak3.zaposleni> zaposleni) {
		
		Naziv = naziv;
		this.adresa = adresa;
		PIB = pIB;
		this.zaposleni = zaposleni;
		
	}
	public String getNaziv() {
		return Naziv;
	}
	public void setNaziv(String naziv) {
		Naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getPIB() {
		return PIB;
	}
	public void setPIB(String pIB) {
		PIB = pIB;
	}
	public ArrayList<zaposleni> getZaposleni() {
		return zaposleni;
	}
	public void setZaposleni(ArrayList<zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}
	
	public void dodajZaposlenog(zaposleni z) {
		zaposleni.add(z);
	}
	public void ukloniZaposlenog(zaposleni z) {
		zaposleni.remove(z.getJedinstveniID());
	}
	public void nadjiZaposlenog(int id) {
		for(zaposleni z : this.zaposleni) {
			if(z.getJedinstveniID() == id) {
				System.out.println(z.getIme());
			}
		}
	}
	public static void main (String[] args) {
		ArrayList<zaposleni> zaposleni = new ArrayList<>();
		
		Konobar konobar1 = new Konobar(1, "Marko","Markovic",40,40,0,15);
		Kuvar kuvar1=new Kuvar(2,"Marko","Ivanovic",40,40,0,1500);
		
		Restoran r1 = new Restoran("Atroria", "City Kvart", 123, zaposleni);
		
		r1.dodajZaposlenog(konobar1);
		r1.dodajZaposlenog(kuvar1);
	
	}
}
