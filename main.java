package vjezbe;

public class main {

	public static void main(String[] args) {

		televizor tv1 = new televizor (4,"RTS",7);
		televizor tv2 = new televizor (7,"b92",9);
		
		tv1.ispisi();
		tv1.pojacajTon();
		tv2.smanjiTon();
	}

}
