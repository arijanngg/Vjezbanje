package vjezbe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vozilotest {

	public static void main(String[] args) {

		
		
		System.out.println(LocalDate.now().getYear());
		
		Automobil.setOsnovicaZaregistraciju((float)1.5);
		
		//Automobil a = new Automobil("VW", "Golf", 1496, 2007, 5, 5);
		//System.out.println(a.dajcijenuregistracije());
		
		ArrayList <Vozilo> vozniPark = new ArrayList <Vozilo>();
		vozniPark.add(new Automobil("VW", "Golf", 1496, 2007, 5, 5));
		vozniPark.add(new Automobil("BMW", "M3", 3000, 2017, 5, 5));
		vozniPark.add(new Motocikli("Suzuki", "xxxx", 3000, 2017, 0));
		vozniPark.add(new Kamion("MAN", "999", 6000, 2017, 10));
		
		float ukupnaCijena = 0;
		for(Vozilo aa : vozniPark)
		ukupnaCijena+=aa.dajcijenuregistracije();
		System.out.printf("ukupno za registraciju %.2f EUR", ukupnaCijena);
	}

}
