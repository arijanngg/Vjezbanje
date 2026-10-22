

public class proizvodi {

	private String opisproizvoda;
	private String barkod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	
	
	public proizvodi(String opisproizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena2) {

		this.setOpisproizvoda(opisproizvoda);
		this.setBarkod(barkod);
		this.setZemljaProizvodnje(zemljaProizvodnje);
		this.setGodinaProizvodnje(godinaProizvodnje);
		this.setUvoznaCijena(uvoznaCijena2);
	}
	
	public String getOpisproizvoda() {
		return opisproizvoda;
	}
	public void setOpisproizvoda(String opisproizvoda) {
		this.opisproizvoda = opisproizvoda;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}
	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double d) {
		this.uvoznaCijena = d;
	}
	public void uvecanacijena() {
		
	}
	
	
	
	
	
	
}
