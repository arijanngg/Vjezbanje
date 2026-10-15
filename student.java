package vjezbenacasu;

import java.util.ArrayList;

public class student {
	
	//atributi
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private String adresa;
	private float brojBodova;
	private boolean polozioIliNe;
	
	private static float prolazNaIspitu;

	
	//getteri i setteri
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

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public float getBrojBodova() {
		return brojBodova;
		this.azurirajProlaz();
	}

	public void setBrojBodova(float brojBodova) {
		this.brojBodova = brojBodova;
	}

	public boolean isPolozioIliNe() {
		return polozioIliNe;
	}

	public void setPolozioIliNe(boolean polozioIliNe) {
		this.polozioIliNe = polozioIliNe;
	}

	public static float getProlazNaIspitu() {
		return prolazNaIspitu;
	}

	public static void setProlazNaIspitu(float prolazNaIspitu) {
		student.prolazNaIspitu = prolazNaIspitu;
	}
//konstruktor
	public student(String ime, String prezime, String brojIndeksa, String adresa, float brojBodova,
			boolean polozioIliNe) {
		
		this.setIme(ime);;
		this.setPrezime(prezime);
		this.setBrojIndeksa(brojIndeksa);
		this.setAdresa(adresa);
		this.setBrojBodova(brojBodova);
		this.setPolozioIliNe(polozioIliNe);
	}

		public student(String string, String string2, String string3, String string4, int i) {
				
		this(null,null,null,null,0,false);
			

}
		public String toString() {
			return "Student [ime: " + getIme() + ", prezime: " + getPrezime() + ", broj indeksa: " + getBrojIndeksa()+ ", adresa: " + getAdresa()+ ", broj bodova:" + getBrojBodova()+ " , polozio ili ne:   " +isPolozioIliNe()+"]";  
			
		}
	public void azurirajProlaz() {
		if(this.getBrojBodova() >= student.getProlazNaIspitu())
			this.setPolozioIliNe(true);
		else
			this.setPolozioIliNe(false);
	}
	
	public static ArrayList<student> izdvojPoloziliIline(ArrayList<student> niz boolean polozili){
		
		ArrayList<student> rez = new ArrayList<student>();
		
		for(student a:niz)
			if(polozili) {
			if(a.isPolozioIliNe())
				rez.add(a);
			}
			else {
				if(!a.isPolozioIliNe())
					rez.add(a);
				
				
			}
		return rez;
	} 
	
public static ArrayList<student> izdvojUlica (ArrayList<student> niz, String nazivUlica){
		
		ArrayList<student> rez = new ArrayList<student>();
		
		for(student a:niz)
			
			if(a.getAdresa().startsWith(nazivUlica))
				rez.add(a);
			
				
				
			
		return rez;
	} 
	
	
	
}

