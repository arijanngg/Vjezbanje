package zadatak3;

public class Konobar extends zaposleni {

	private int prekovremeniSati;
	

	public Konobar(int jedinstveniID, String ime, String prezime, double satnica, int ukupanBrojSati, double plata,
			int prekovremeniSati) {
		super(jedinstveniID, ime, prezime, satnica, ukupanBrojSati, plata);
		this.prekovremeniSati = prekovremeniSati;
	}


	public int getPrekovremeniSati() {
		return prekovremeniSati;
	}


	public void setPrekovremeniSati(int prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}


	public void izracunajplatu() {
		double plata = (this.getSatnica()*this.getUkupanBrojSati())+(this.prekovremeniSati*(this.getSatnica()*1.2));
		
	}
	
	
	
}
