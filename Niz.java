package trecicas;

import java.util.Random;
import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi broj elemenata");
		int n = sc.nextInt();
		Random r = new Random ();
		
		double niz[] = new double [n];
		
		for( int i = 0 ; i < n ; i ++) {
			niz[i]= r.nextInt(50);
		
		}
		System.out.println("Trenutni niz je ");
		for(int i = 0 ; i < niz.length ; i ++) {
			System.out.print(niz[i] + " ");
		}
		for ( int i = 0 ; i < niz.length ; i ++) {
			if ( niz[i] % 2 == 0) {
				niz[i] = niz[i] *(-1);
			}else {
				niz[i] = 1 / niz[i];
			}
		}System.out.println();
		
		
		
		System.out.println("Novi niz je ");
		for(int i = 0 ; i < niz.length ; i ++) {
			System.out.print(niz[i] + " ");
		}
		
	}

}
