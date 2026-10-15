package vjezbejava;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {

		//koja su to slova koja se u stringu ponavljaju
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Unesi string");
		
		String recenica = sc.next();
		
		for(int i = 0 ; i < recenica.length()-1; i ++) {
			
				
				if(recenica.charAt(i) == recenica.charAt(i+1)) {
					System.out.println("slovo koje se ponavlja je " + recenica.charAt(i));
					
				
			}
		}

	}

}
