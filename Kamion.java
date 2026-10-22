package vjezbe;

public class Kamion extends Vozilo {

	private int nosivost;

	
	public Kamion() {
		this(null,null,0,1945,0);
	}
	 
	
	public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) {
		super(marka, model, kubikaza, godiste);
		this.nosivost = nosivost;
	}

	public int getNosivost() {
		return nosivost;
	}

	public void setNosivost(int nosivost) {
		if(nosivost>= 0)
		this.nosivost = nosivost;
	}

	@Override
	public String toString() {
		return "Kamion [nosivost=" + nosivost + ", getMarka()=" + getMarka() + ", getModel()=" + getModel()
				+ ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}

	@Override
	public float dajcijenuregistracije() {
		float cijena;
		cijena=((float)this.getKubikaza()+(2026 - this.getGodiste()))* Vozilo.getOsnovicaZaregistraciju() + 30* this.getNosivost();
		return cijena;
	}
	
	
}
