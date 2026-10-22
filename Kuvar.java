package zadatak3;

public class Kuvar extends zaposleni {
	private double iznos;
	

	
	public Kuvar(int jedinstveniID, String ime, String prezime, double satnica, int ukupanBrojSati, double plata,
			double iznos) {
		super(jedinstveniID, ime, prezime, satnica, ukupanBrojSati, plata);
		this.iznos = 1500;
	}



	public double getIznos() {
		return iznos;
	}



	public void setIznos(double iznos) {
		this.iznos = iznos;
	}



	public void izracunajplatu() {
		this.setPlata(iznos+ 4*(this.getUkupanBrojSati()*this.getSatnica()));
	}

	
	
	
	
}
