package vjezbejava;

import java.util.Scanner;

public class zad1 {

	public static <niz> void main(String[] args) {
//unijeti recenicu a da sistem vraca broj rijeci u recenici
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Unesi recenicu");
		
		String recenica = sc.nextLine().trim();
		
		
		
		String [] rijeci = recenica.split("\\s+");
		System.out.println("Ukupan broj rijeci je  " + rijeci.length);
		
		
		
	}

}
