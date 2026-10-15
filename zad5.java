package vjezbejava;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
//za dva unijeta teksta provjeriti da li je drugi podtekst prvog
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi tekst prvog");
		String prvi= sc.next();
		
		System.out.println("Unesi tekst drugog");
		String drugi = sc.next();
		
		if(prvi.contains(drugi)) {
			System.out.println("Drugi je podtekst prvog");
		}else {
			System.out.println("Drugi nije podtekst prvog");
		}
		
		
	}

}
