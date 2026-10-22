public class HemijskiProizvodi extends proizvodi {

	private float temperaturaSkladistenja;
	private boolean zapaljivo;
	
	
	
	public HemijskiProizvodi(String opisproizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double d, float temperaturaSkladistenja, boolean zapaljivo) {
		super(opisproizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, d);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	
	public float getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	
	public void uvecanacijena() {
		if(this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena()*1.125);
		}else {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}

	@Override
	public String toString() {
		return "HemijskiProizvodi [temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ ", Opisproizvoda()=" + getOpisproizvoda() + ", Barkod()=" + getBarkod()
				+ ", ZemljaProizvodnje()=" + getZemljaProizvodnje() + ", GodinaProizvodnje()="
				+ getGodinaProizvodnje() + ", UvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	
	
}
