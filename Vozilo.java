package vjezbe;

public class Vozilo {
	
	private String marka;
	private String model;
	private int kubikaza;
	private int godiste;
	
	private static float osnovicaZaregistraciju;
	
	public static float getOsnovicaZaregistraciju() {
		return osnovicaZaregistraciju;
	}

	public static void setOsnovicaZaregistraciju(float osnovicaZaregistraciju) {
		Vozilo.osnovicaZaregistraciju = osnovicaZaregistraciju;
	}

	public Vozilo() {
		this(null,null,0,1945);
		
	}
	
	public Vozilo(String marka, String model, int kubikaza, int godiste) {
		super();
		this.setMarka(marka);
		this.setModel(model);
		this.setKubikaza(kubikaza);
		this.setGodiste(godiste);
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		if(kubikaza>=0)
		this.kubikaza = kubikaza;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		if(godiste>=1945)
		this.godiste = godiste;
	}
	public float dajcijenuregistracije() {
		
		
		return 0;
		
		
	}

	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	}

}
