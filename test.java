import java.time.LocalDate;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		Garderoba g1 = new Garderoba("majica","232143512","Crna Gora", 2026,  2.5, "Kasmir", "zimska");
		HemijskiProizvodi h1 = new HemijskiProizvodi("prasak", "8241281818", "Amerika", 2026,9.5,23.4f, true);
		Hrana h2 = new Hrana ("pica","12412412","Italia",2026,11,600,LocalDate.of(2026,10 , 22));
		
		ArrayList<proizvodi>lista = new ArrayList<>();
		lista.add(g1);
		lista.add(h1);
		lista.add(h2);
		
		for(proizvodi p : lista) {
			System.out.println(p);
		}
		for(proizvodi p:lista) {
			p.uvecanacijena();
		}
		System.out.println("****************************************************");
		for(proizvodi p : lista) {
			System.out.println(p);}
	}

}
