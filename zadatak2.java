package vjezbejava;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi recenicu");
		
		
		
		String recenica = sc.nextLine();
		String[] rijeci = recenica.split(" ");
		for(int i = 0 ; i < rijeci.length; i ++) {
			
		
		StringBuilder sb = new StringBuilder(rijeci[i]);
		System.out.print(sb.reverse() + " ");
		
		
		
		
		
		
		}
		
	}

}
