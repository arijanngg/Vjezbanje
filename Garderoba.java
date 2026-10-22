public class Garderoba extends proizvodi {

	private String materijalProizvodnje;
	private String sezona;
	
	
	
	
	public Garderoba(String opisproizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, String materijalProizvodnje, String sezona) {
		super(opisproizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.setMaterijalProizvodnje(materijalProizvodnje);;
		this.setSezona(sezona);
		
	
	}
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	
	public void uvecanacijena() {
		this.setUvoznaCijena(this.getUvoznaCijena()*1.05);

		
		
	}
	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona
				+ ", Opisproizvoda()=" + getOpisproizvoda() + ", Barkod()=" + getBarkod()
				+ ", ZemljaProizvodnje()=" + getZemljaProizvodnje() + ", GodinaProizvodnje()="
				+ getGodinaProizvodnje() + ", UvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	
	
}
