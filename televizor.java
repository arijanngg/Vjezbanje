package vjezbe;

public class televizor {

	

		private int brojkanala;
		
		private String  nazivkanala;
		
		private int jacinatona;
		
		
		
		
	



public televizor( int brojkanala , String nazivkanala, int jacinatona) {
	
	setBrojkanala (brojkanala);
	
	
	this.nazivkanala=nazivkanala;
	
	setJacinatona(jacinatona);
	
}








public int getBrojkanala() {
	return brojkanala;
}








public void setBrojkanala(int brojkanala) {
	this.brojkanala = brojkanala;
	if(brojkanala>=1) {
		this.brojkanala = brojkanala;
	}else {
		System.out.println("Broj kanala mora biti veci ili jednak 1");
	this.brojkanala = 1;
	
	}
	
}








public String getNazivkanala() {
	return nazivkanala;
}








public void setNazivkanala(String nazivkanala) {
	this.nazivkanala = nazivkanala;
}








public int getJacinatona() {
	return jacinatona;
}








public void setJacinatona(int jacinatona) {
	this.jacinatona = jacinatona;

	if (jacinatona>=0 && jacinatona<=10) {
		this.jacinatona=jacinatona;
		
	}else {
		if(jacinatona<0) {
			this.jacinatona=0;
		}if(jacinatona>10) {
			this.jacinatona=10;
		}
	}

}
public void pojacajTon() {
	if(this.jacinatona<10) {
		this.jacinatona++;
		System.out.println("Ton je povecan na" + this.jacinatona);
	}else {
		System.out.println("Ton je vec na maximumu");
	}
	
}

public void ispisi() {
	
	System.out.println("Broj kanala:" + this.brojkanala + ", naziv kanala: "+ this.nazivkanala + ", jacina tona:"+ this.jacinatona);
	
	
}

public void smanjiTon() {
	if(this.jacinatona>0) {
		this.jacinatona--;
		System.out.println("Jacina tona smanjena na " + this.jacinatona);
	}else {
		System.out.println("Jacina tona je na minimumu");
	}
	
}
}