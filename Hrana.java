import java.time.LocalDate;

public class Hrana extends proizvodi {

	private int brojKalorija;
	private LocalDate rokTrajanja;
	
	
	public Hrana(String opisproizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena,
			int brojKalorija, LocalDate rokTrajanja) {
		super(opisproizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.brojKalorija = brojKalorija;
		this.rokTrajanja = rokTrajanja;
	}
	public int getBrojKalorija() {
		return brojKalorija;
	}
	public void setBrojKalorija(int brojKalorija) {
		this.brojKalorija = brojKalorija;
	}
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(LocalDate rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	/*public void uvecanacijena() {
		
		LocalDate danas = LocalDate.now();
		if(danas.minusMonths(6).isBefore(rokTrajanja)) {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}else {
			this.setUvoznaCijena(getUvoznaCijena()*1.05);
		}*/
		
	public void uvecanacijena() {
		
		if(rokTrajanja.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznaCijena(getUvoznaCijena()*1.05);;
		}else {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}
	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rokTrajanja=" + rokTrajanja + ", Opisproizvoda()="
				+ getOpisproizvoda() + ", Barkod()=" + getBarkod() + ", ZemljaProizvodnje()="
				+ getZemljaProizvodnje() + ", GodinaProizvodnje()=" + getGodinaProizvodnje() + ",UvoznaCijena()="
				+ getUvoznaCijena() + "]";
	}
	
		
		}
	

