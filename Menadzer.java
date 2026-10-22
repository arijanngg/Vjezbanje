package zadatak3;

public class Menadzer extends zaposleni {

	private double osnovica;
	private double bonus;
	
	public Menadzer(int jedinstveniID, String ime, String prezime, double satnica, int ukupanBrojSati, double plata,
			double osnovica, double bonus) {
		super(jedinstveniID, ime, prezime, satnica, ukupanBrojSati, plata);
		this.osnovica = osnovica;
		this.bonus = bonus;
	}
	public double getOsnovica() {
		return osnovica;
	}
	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void izracunajPlatu() {
		this.setPlata(this.getOsnovica() + 4 * this.getUkupanBrojSati() * this.getSatnica() + this.getBonus());
	}
	
}
