package vjezbe;

public class Motocikli extends Vozilo {

	public float kilometraza;

	public float getKilometraza() {
	return kilometraza;
	}

	public void setKilometraza(float kilometraza) {
	if(kilometraza>= 0)
		this.kilometraza = kilometraza;
	}
	public Motocikli() {
	this(null, null, 0 , 1945, 0 );	
	}

	public Motocikli(String marka, String model, int kubikaza, int godiste, float kilometraza) {
		super(marka, model, kubikaza, godiste);
		this.kilometraza = kilometraza;
	}

	@Override
	public String toString() {
		return "Motocikli [kilometraza=" + kilometraza + ", getMarka()=" + getMarka() + ", getModel()=" + getModel()
				+ ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}

	@Override
	public float dajcijenuregistracije() {
		float cijena = 0;
		
		return cijena;
	}
	
	
	
}
