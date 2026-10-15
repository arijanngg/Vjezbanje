package vjezbejava;

import java.util.Scanner;

public class yad2 {

	public static void main(String[] args) {

		//recenicu provjeri je li palindrom
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi recenicu");
		String recenica =sc.nextLine();
		
		StringBuilder sb =  new StringBuilder(recenica);
		
		String obrnuto = sb.reverse().toString();
		
		if(recenica.equalsIgnoreCase(obrnuto)) {
			System.out.println("Jeste palindrom");
		}else {
			System.out.println("Nije palindrom");
		}
		
		
	}

}
