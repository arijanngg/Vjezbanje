package vjezbejava;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi string");
		String novi = sc.next();
		System.out.println("Unesi poziciju");
		int pozicija = sc.nextInt();
		 
		
		
		
					if( pozicija == 0 ) {
				if(novi.charAt(pozicija+1) == '0') {
					System.out.println("Slobodno polje");
				}else {
					System.out.println("Zauzeto polje");
				}
					}
					else if(pozicija == novi.length()-1) {
						if(novi.charAt(pozicija-1) == '0') {
							System.out.println("Slobodno polje");
						}else {
							System.out.println("Zauzeto polje");
						
						}	
			}else if ( novi.charAt(pozicija-1)=='0' && novi.charAt(pozicija+1)=='0' ) {
				System.out.println("Slobodna polja");
			}else if ( novi.charAt(pozicija-1)=='0' && novi.charAt(pozicija+1)=='1' ) {
				System.out.println("Slobodno je polje sa lijeve strane");
			}else if ( novi.charAt(pozicija-1)=='1' && novi.charAt(pozicija+1)=='0' ) {
				System.out.println("Slobodno je polje sa desne strane");
			}else {
				System.out.println("Zauzeta polja");
			}
				
			
			}	
			}
			
		
		
		
	


